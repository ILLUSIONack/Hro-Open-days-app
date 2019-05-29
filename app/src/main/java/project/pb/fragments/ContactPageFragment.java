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

import project.pb.R;

public class ContactPageFragment extends Fragment implements View.OnClickListener {

    private EditText your_name;
    private EditText your_subject;
    private EditText your_message;
    private ImageView callImage;
    private Button email;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_page, container, false);
        initialize(view);
        return view;
    }

    private void initialize(View view) {
        getActivity().setTitle("Contact");
        your_name = view.findViewById(R.id.textName);
        your_subject = view.findViewById(R.id.textSubject);
        your_message = view.findViewById(R.id.textMessage);
        callImage = view.findViewById(R.id.phoneCallButtonImage);
        email = view.findViewById(R.id.buttonSend);
        callImage.setOnClickListener(this);
        email.setOnClickListener(this);
    }

    public void phoneCall(){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+3164333431"));
        startActivity(callIntent);
    }

    //Asks the users to choose a email service of choice
    public void chooseEmailService(){
        Context context = getContext();
        CharSequence text = "Please select Email Client";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage(){
        String name = your_name.getText().toString();
        String subject = your_subject.getText().toString();
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
                "name:" + name + '\n' + "Message:" + '\n' + message);

        /* Send it off to the Activity-Chooser */
        startActivity(Intent.createChooser(sendEmail, "Send mail..."));

        chooseEmailService();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.phoneCallButtonImage:
                phoneCall();
                break;
            case R.id.buttonSend:
                sendMessage();
        }
    }
}
