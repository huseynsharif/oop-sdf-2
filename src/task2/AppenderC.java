package task2;

public class AppenderC extends StringAppender {
    public AppenderC() {
        super(Letter.C);
    }

    // override to true, then we will see error in C
    @Override
    public boolean simulateError() {
        return true;
    }
}
