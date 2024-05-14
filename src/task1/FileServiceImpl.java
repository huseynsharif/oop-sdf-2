package task1;

import java.io.*;

public class FileServiceImpl extends FileService {

    private String path = "src/task1/test.txt";

    @Override
    String findLongestWord() {
        String longestWord = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
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
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.write(line);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
