package project.pb.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import project.pb.R;

public class QuizFragment extends Fragment {

    private SharedPref sharedPref;
    private QuestionsAndAnswers mQuestionLibrary = new QuestionsAndAnswers();

    private TextView ScoreCounter;
    private TextView ScoreText;
    private TextView QuestionView;
    private Button Choice1Button;
    private Button Choice2Button;
    private Button Choice3Button;
    private Button Choice4Button;

    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sharedPref = new SharedPref(getContext().getApplicationContext());
        if(sharedPref.loadNightModeState()) {
            getActivity().setTheme(R.style.DarkTheme);
        } else {
            getActivity().setTheme(R.style.AppTheme);
        }
        View view = inflater.inflate(R.layout.quiz_layout, container, false);


        ScoreCounter = view.findViewById(R.id.score);
        ScoreText = view.findViewById(R.id.score_text);
        QuestionView = view.findViewById(R.id.question);
        Choice1Button = view.findViewById(R.id.choice1);
        Choice2Button = view.findViewById(R.id.choice2);
        Choice3Button = view.findViewById(R.id.choice3);
        Choice4Button = view.findViewById(R.id.choice4);


        updateQuestion();

        Choice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Choice1Button.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                }
                updateQuestion();
            }
        });

        Choice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Choice2Button.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                }
                updateQuestion();
            }
        });

        Choice3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Choice3Button.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                }
                updateQuestion();
            }
        });

        Choice4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Choice4Button.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                if (Choice4Button.getText() == "A phone manufactured by OnePlus")
                {
                    ScoreCounter.setText(null);
                    ScoreText.setText("Your final score is: " + Score);
                    Choice4Button.setEnabled(false);
                }
                }
                updateQuestion();

            }

        });
        return view;
    }
    private void updateScore(int score) {
        ScoreCounter.setText("" + score);
    }



    private void updateQuestion(){
        QuestionView.setText(mQuestionLibrary.getQuestionFromList(QuestionNumber));
        Choice1Button.setText(mQuestionLibrary.getChoiceOne(QuestionNumber));
        Choice2Button.setText(mQuestionLibrary.getChoiceTwo(QuestionNumber));
        Choice3Button.setText(mQuestionLibrary.getChoiceThree(QuestionNumber));
        Choice4Button.setText(mQuestionLibrary.getChoiceFour(QuestionNumber));

        Answer = mQuestionLibrary.getCorrectAnswer(QuestionNumber);
        if (QuestionNumber<10) {QuestionNumber++;}

    }
}
