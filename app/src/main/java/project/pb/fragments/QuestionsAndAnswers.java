package project.pb.fragments;

public class QuestionsAndAnswers {

    private String QuesionList [] = {
            "Which language can you use to write code in Android Studio?",
            "What is #FFFF?",
            "What program do we use to make Android Apps?",
            "Android and IOS are examples of what?",
            "What color is our application?",
            "What is PyCharm?",
            "What is 2 x 69 ?",
            "2 + 2 = ?",
            "When did Kim Kardashian and Kanye West marry each other?",
            "When was Trump inaugurated?",
            "What is OnePlus 7 ?",

    };

    private String ChoicesString [] [] = {
            {"Java", "Python", "Droid++", "C##"},
            {"RNG Code", "White in Hex", "Morse Code", "Binary Code"},
            {"PyCharm", "Microsoft Word", "Android Studio", "Sony Vegas"},
            {"Software", "Programming Languages", "Operating Systems", "Index Codes"},
            {"It is pink", "Red", "Its not red", "Its not pink"},
            {"A video game", "And operating system", "A program for writing code", "A mix of Python and Charm"},
            {"I don't know, this isn't math", "138", "128", "Why am I doing math?"},
            {"Qwick Mafs", "4", "f(x)=(4x - 3x + 12x) * (2x)", "10?"},
            {"Undisclosed date in 2018", "May 24th, 2014", "April 4th, 2017", "No clue when."},
            {"When the world went to s**t", "Halloween 2016", "January 20th, 2017", "When he became president"},
            {"9", "8", "Eight", "A phone manufactured by OnePlus" }
    };

    private String CorrectAnswers [] = {"Java", "White in Hex", "Android Studio", "Operating Systems", "Red", "A program for writing code", "138", "3", "May 24th, 2014", "January 20th, 2017", "A phone manufactured by OnePlus"};

    public String getQuestionFromList(int a) {
        String question = QuesionList[a];
        return question;
    }

    public String getChoiceOne(int a) {
        String choice1 = ChoicesString[a][0];
        return choice1;
    }

    public String getChoiceTwo(int a) {
        String choice2 = ChoicesString[a][1];
        return choice2;
    }

    public String getChoiceThree(int a) {
        String choice3 = ChoicesString[a][2];
        return choice3;
    }

    public String getChoiceFour(int a) {
        String choice4 = ChoicesString[a][3];
        return choice4;
    }


    public String getCorrectAnswer(int a) {
        String answer = CorrectAnswers[a];
        return answer;
    }

}
