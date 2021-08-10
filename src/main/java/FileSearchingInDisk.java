import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class FileSearchingInDisk {

    public static ArrayList<File> files = new ArrayList<>();

    public static void main(String[] args) {
        //  there is given file Path
        File file = new File("D:\\");
        System.out.println("------------------------------------------");

        //  "key" is keyword for searching in the disk it searches by this word
        //  if there is any file contains this keyword So it will be added to "files" arraylist above in
        //  the final arraylist will give  as answer .
        for (File key : Objects.requireNonNull(searchFile(file, "key"))) {
            System.out.println(key.getAbsolutePath() + " <=> " + key.getName());
            System.out.println("----------------------------");
        }

    }


    private static ArrayList<File> searchFile(File file, String name) {


        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            if (fileList != null) {
                for (File file1 : fileList) {
                    if (file1.isDirectory()) {
                        // there is recursion algorithm is used
                        searchFile(file1, name);
                    } else {
                        if (file1.getName().contains(name)) {
                            // adding to list
                            files.add(file1);

                        }
                    }
                }
            }
        }
        return files;
    }


}
