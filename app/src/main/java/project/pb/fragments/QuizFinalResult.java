package project.pb.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import project.pb.MainActivity;
import project.pb.R;

public class QuizFinalResult extends Activity {

    private SharedPref sharedPref;
    private TextView finalScoreCount;
    private TextView conclusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPref = new SharedPref(getApplicationContext());
        if(sharedPref.loadNightModeState() == true) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.activity_quiz_resultss);

        int finalScore = getIntent().getIntExtra("score", 0);

        finalScoreCount = (TextView)findViewById(R.id.QuizResultTextView);
        conclusion = (TextView)findViewById(R.id.QuizResultConclusion);

        finalScoreCount.setText("Your final score is: " + finalScore);

        if (finalScore < 6) {
            conclusion.setText("Judging from your test results, we can not recommend an ICT study at our school.\nOf course you can always submit for a course. Your knowledge has plenty room to be expanded!");
        }
        if (finalScore > 5) {
            conclusion.setText("Based on your test results we can say that you have great knowledge of ICT and have a place in our school!\nYou have some knowledge of ICT and will no doubt excel in the ICT business if you put in work at our school.");
        }

        Toast.makeText(this, "Quiz completed. Press back to leave.",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }


}
