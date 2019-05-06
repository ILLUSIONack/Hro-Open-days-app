package project.pb.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import project.pb.R;
import project.pb.opendag.OpenDagData;

public class OpenDayInformation extends AppCompatActivity {

    private TextView generalInfo;

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

    }
}
