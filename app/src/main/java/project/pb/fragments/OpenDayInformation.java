package project.pb.fragments;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import project.pb.R;
import project.pb.opendag.OpenDagData;
import project.pb.zoom.MultiTouchListener;

public class OpenDayInformation extends AppCompatActivity implements View.OnClickListener {

    private Button addcalender;
    private TextView generalInfo,nameTitle;
    private ImageButton shareButton;
    private OpenDagData key;
    private LinearLayout newopendaypage;
    private ImageView studyPicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf1);
        initialize();
    }

    public void initialize(){
        generalInfo = findViewById(R.id.textView3);
        addcalender = findViewById(R.id.addcalender);
        shareButton = findViewById(R.id.shareButton);
        newopendaypage = findViewById(R.id.newopendaypage);

        nameTitle = findViewById(R.id.nameTitle);
        studyPicture = findViewById(R.id.studyPicture);

        shareButton.setOnClickListener(this);
        addcalender.setOnClickListener(this);

        generalInfo.setScrollbarFadingEnabled(false);
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(getData());
        nameTitle.setText(key.getName());
        studyPicture.setImageResource(key.getPic());
        generalInfo.setOnTouchListener(new MultiTouchListener());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shareButton:
                shareFeature();
                break;
            case R.id.addcalender:
                CallenderFeature();
                break;
        }
    }

    public void CallenderFeature(){
        Calendar calendarEvent = Calendar.getInstance();
        calendarEvent.set(key.getDate()[0], key.getDate()[1], key.getDate()[2]);
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                calendarEvent.getTimeInMillis());
        intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                calendarEvent.getTimeInMillis() + 60 * 60 * 1000);
        intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
        intent.putExtra(CalendarContract.Events.TITLE, key.getName());
        intent.putExtra(CalendarContract.Events.DESCRIPTION, key.getDescription());
        intent.putExtra(CalendarContract.Events.EVENT_LOCATION, key.getLocation());
        startActivity(intent);
    }

    public void shareFeature(){
        Resources resources = getResources();

        Intent emailIntent = new Intent();
        emailIntent.setAction(Intent.ACTION_SEND);
        // Native email client doesn't currently support HTML, but it doesn't hurt to try in case they fix it
        String shareTwitter = "Open Day invite: \n " + key.getDescription() ;
        String shareBody = "Your friend has invited you to join this open day: " + key.getName() +" Visit: "+ key.getLink() + '\n';
        shareBody += '\n';
        for(int i = 0; i < key.getInformation().length; i++) {
            shareBody += key.getInformation()[i] + '\n';
        }
        String shareSub = key.getName()+" Invitation";
        emailIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        emailIntent.setType("message/rfc822");

        PackageManager pm = getPackageManager();
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");


        Intent openInChooser = Intent.createChooser(emailIntent, "Share using");

        List<ResolveInfo> resInfo = pm.queryIntentActivities(sendIntent, 0);
        List<LabeledIntent> intentList = new ArrayList<LabeledIntent>();
        for (int i = 0; i < resInfo.size(); i++) {
            // Extract the label, append it, and repackage it in a LabeledIntent
            ResolveInfo ri = resInfo.get(i);
            String packageName = ri.activityInfo.packageName;
            if(packageName.contains("android.email")) {
                emailIntent.setPackage(packageName);
            } else if(packageName.contains("whatsapp") || packageName.contains("twitter") || packageName.contains("facebook") || packageName.contains("mms") || packageName.contains("android.gm")) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(packageName, ri.activityInfo.name));
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                if(packageName.contains("twitter")) {
                    intent.putExtra(Intent.EXTRA_TEXT, shareTwitter);
                } else if(packageName.contains("facebook")) {
                    // Warning: Facebook IGNORES our text. They say "These fields are intended for users to express themselves. Pre-filling these fields erodes the authenticity of the user voice."
                    // One workaround is to use the Facebook SDK to post, but that doesn't allow the user to choose how they want to share. We can also make a custom landing page, and the link
                    // will show the <meta content ="..."> text from that page with our link in Facebook.
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                } else if(packageName.contains("mms")) {
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                } else if(packageName.contains("android.gm")) { // If Gmail shows up twice, try removing this else-if clause and the reference to "android.gm" above
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    intent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                    intent.setType("message/rfc822");
                }else if(packageName.contains("whatsapp")) {
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                }

                intentList.add(new LabeledIntent(intent, packageName, ri.loadLabel(pm), ri.icon));
            }
        }

        // convert intentList to array
        LabeledIntent[] extraIntents = intentList.toArray( new LabeledIntent[ intentList.size() ]);

        openInChooser.putExtra(Intent.EXTRA_INITIAL_INTENTS, extraIntents);
        startActivity(openInChooser);
    }

    public String getData(){
        key = (OpenDagData) getIntent().getSerializableExtra("open_dag_informatie");
        String[] content = key.getInformation();
        String s = "";
        for(int i = 0; i < content.length; i++) {
            s += content[i] + "\n";
        }
        return s;
    }
}
