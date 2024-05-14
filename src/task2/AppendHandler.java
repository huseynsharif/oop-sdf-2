package task2;

public class AppendHandler {

    public static StringAppender getStringAppender(String initialString){

        AppenderA appenderA = new AppenderA();
        AppenderB appenderB = new AppenderB();
        AppenderC appenderC = new AppenderC();

        appenderA.setOriginalString(initialString);
        appenderB.setOriginalString(initialString);
        appenderC.setOriginalString(initialString);

        return appenderA.setNextAppender(
                appenderB.setNextAppender(
                        appenderC
                )
        );
    }

}
