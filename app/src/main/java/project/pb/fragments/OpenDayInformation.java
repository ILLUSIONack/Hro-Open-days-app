package project.pb.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import project.pb.R;
import project.pb.opendag.OpenDagData;

public class OpenDayInformation extends AppCompatActivity {

    private TextView generalInfo;
    private ImageButton shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf1);
        generalInfo = findViewById(R.id.textView3);

        final OpenDagData key = (OpenDagData) getIntent().getSerializableExtra("open_dag_informatie");
        String[] content = key.getInformation();
        String s = "";
        for(int i = 0; i < content.length; i++) {
            s += content[i] + "\n";
        }
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(s);


        shareButton = findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your friend has invited you to join this open day: " + key.getName() +" Visit: "+ key.getLink();
                String shareSub = key.getName()+" Invitation";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));

            }
        });

    }
}
