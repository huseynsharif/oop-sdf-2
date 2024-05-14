package task1;

public abstract class FileService {

    public void handleProses(){
        String longestWord = findLongestWord();
        add(longestWord);
    }

    abstract String findLongestWord();
    abstract void add(String line);
}
