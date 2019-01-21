public enum Stages {

    KINDER ("KINDER"),
    ELEMENTARY("ELEMENTARY"),
    JRHIGHSCHOOL("JRHIGHSCHOOL");

    private final String value;

    Stages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
