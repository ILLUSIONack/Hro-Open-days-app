package project.pb.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import project.pb.R;

public class ContactPageFragment extends Fragment implements View.OnClickListener {

    private SharedPref sharedPref;
    private EditText your_name, your_subject, your_message,your_email;
    private ImageView callImage;
    private Button email;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sharedPref = new SharedPref(getContext().getApplicationContext());
        if (sharedPref.loadNightModeState() == true) {
            getActivity().setTheme(R.style.DarkTheme);
        } else {
            getActivity().setTheme(R.style.AppTheme);
        }

        View view = inflater.inflate(R.layout.contact_page, container, false);
        initialize(view);
        return view;
    }

    private void initialize(View view) {
        getActivity().setTitle("Contact");
        your_name = view.findViewById(R.id.textName);
        your_subject = view.findViewById(R.id.textSubject);
        your_email = view.findViewById(R.id.email);
        your_message = view.findViewById(R.id.textMessage);
        callImage = view.findViewById(R.id.phoneCallButtonImage);
        email = view.findViewById(R.id.buttonSend);
        callImage.setOnClickListener(this);
        email.setOnClickListener(this);
    }

    public void phoneCall() {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:0107944000"));
        startActivity(callIntent);
    }

    //Asks the users to choose a email service of choice
    public void chooseEmailService() {
        Context context = getContext();
        CharSequence text = "Please select Email Client";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage() {
        String name = your_name.getText().toString();
        String subject = your_subject.getText().toString();
        String email = your_email.getText().toString();
        String message = your_message.getText().toString();
        if (TextUtils.isEmpty(name)) {
            your_name.setError("Enter Your Name");
            your_name.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(subject)) {
            your_subject.setError("Enter Your Subject");
            your_subject.requestFocus();
            return;
        }
        Boolean onError = false;
        if (!isValidEmail(email)) {
            onError = true;
            your_email.setError("Invalid Email");
            return;
        }
        if (TextUtils.isEmpty(message)) {
            your_message.setError("Enter Your Message");
            your_message.requestFocus();
            return;
        }

        Intent sendEmail = new Intent(android.content.Intent.ACTION_SEND);
        sendEmail.setType("plain/text");
        sendEmail.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"usman-ack@hotmail.com"});
        sendEmail.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
        sendEmail.putExtra(android.content.Intent.EXTRA_TEXT,
                "name:" + name + '\n'+ "Email:"+'\n'+ email + '\n'+ "Message:" + '\n' + message);

        /* Send it off to the Activity-Chooser */
        startActivity(Intent.createChooser(sendEmail, "Send mail..."));

        chooseEmailService();
    }

    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phoneCallButtonImage:
                phoneCall();
                break;
            case R.id.buttonSend:
                sendMessage();
        }
    }
}
