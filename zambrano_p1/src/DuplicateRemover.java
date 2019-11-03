import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.HashSet;
import java.io.PrintWriter;


public class DuplicateRemover {

    String[] uniqueWords;

    public void remove(FileInputStream dataFile) throws IOException {
        Scanner scnr = new Scanner(dataFile);
        HashSet<String> words = new HashSet<String>();

        while(scnr.hasNext()) {
            String nextWord = scnr.next();
            words.add(nextWord);
        }

        uniqueWords = new String[words.size()];
        words.toArray(uniqueWords);

        dataFile.close();
    }

    public void write(FileOutputStream outputFile) throws IOException {
        PrintWriter out = new PrintWriter(outputFile);

        out.println(uniqueWords);

        outputFile.close();
    }
}
