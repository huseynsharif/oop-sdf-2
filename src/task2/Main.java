package task2;

public class Main {

    public static void main(String[] args) {
        String initialString = "Hello";
        StringBuilder stringBuilder = new StringBuilder(initialString);
        StringAppender stringAppender = AppendHandler.getStringAppender(initialString);
        stringAppender.handle(stringBuilder);
        System.out.println(stringBuilder.toString());
    }

}
