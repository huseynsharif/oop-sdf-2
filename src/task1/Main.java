package task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        FileService fileService = new FileServiceImpl();
        fileService.handleProses();


    }

}
