package project.pb.hints;

public enum HintsData {

    HINT_1("The CMI hogeschool rotterdam supports up to 3 studies!"),
    HINT_2("You can take a quiz to test your knowledge in the 'quiz page'!"),
    HINT_3("You can set the route to Hr in the 'About Hr' Page");

    private String hint;

    HintsData(String hint) {
        this.hint = hint;
    }

    public String getHint() {
        return hint;
    }
}
