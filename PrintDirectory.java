import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class PrintDirectory {
    public static void listFilesForFolder(final File folder, ArrayList<File> list) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry, list);
            } else {
                list.add(fileEntry);
            }
        }
    }

    public static void main(String[] args) {
        final File folder = new File(args[0]);
        ArrayList<File> list = new ArrayList<File>();
        listFilesForFolder(folder, list);
        Collections.sort(list, new FileSizeComparator());
        for (File file : list) {
                System.out.println(file.getPath() + " " + file.getName() + " " +  file.length());
            }

    }
}