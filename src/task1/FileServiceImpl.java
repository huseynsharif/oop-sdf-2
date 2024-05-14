package task1;

import java.io.*;

public class FileServiceImpl extends FileService {

    private final String PATH = "src/task1/test.txt";

    @Override
    String findLongestWord() {
        String longestWord = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));
            String line;

            while ((line = reader.readLine()) != null){
               if (line.length()>longestWord.length()){
                   longestWord = line;
               }
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Longest word: " + longestWord);
        return longestWord;
    }

    @Override
    void add(String line) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true));
            writer.write(line);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
