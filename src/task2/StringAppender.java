package task2;

public abstract class StringAppender {

    protected StringAppender nextAppender;
    protected String originalString;
    protected Letter letter;

    public StringAppender(Letter letter) {
        this.letter = letter;
    }

    public StringAppender setNextAppender(StringAppender nextAppender) {
        this.nextAppender = nextAppender;
        return this;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public void append(StringBuilder stringBuilder){
        if (simulateError()){
            throw new RuntimeException("Exception in: " + letter);
        }
        stringBuilder.append(letter);
    }

    // override this method in child classes when you want to see error
    public boolean simulateError() {
        return false;
    }

    public void handle(StringBuilder stringBuilder){
        try {
            append(stringBuilder);
            if (nextAppender!=null){
                nextAppender.handle(stringBuilder);
            }
        }
        catch (Exception e){
            stringBuilder.setLength(0);
            stringBuilder.append(originalString);
            System.out.println(e.getMessage());
        }
    }
}
