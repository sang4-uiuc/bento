import java.io.File;
import java.util.Comparator;

public class FileSizeComparator implements Comparator<File> {
    public int compare( File a, File b ) {

        int aSize = (int) a.length();
        int bSize = (int) b.length();
        if ( aSize == bSize ) {
            return 0;
        }
        else {
            return Integer.compare(aSize, bSize);
        }
    }
}