package task4;

import java.io.*;

public class FileServiceImpl implements FileService {


    @Override
    public void scanFile(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = reader.readLine()) != null){
                if (line.length()>5){
                    throw new IllegalArgumentException();
                }
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
