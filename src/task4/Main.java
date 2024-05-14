package task4;



public class Main {
    public static void main(String[] args) {

        String path = "src/task4/words.txt";

        try {
            FileService fileService = new FileServiceImpl();
            fileService.scanFile(path);
            System.out.println("Done");
        }
        catch (IllegalArgumentException e){
            System.out.println("Failure");
        }
    }
}
