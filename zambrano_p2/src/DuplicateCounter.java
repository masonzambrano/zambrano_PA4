import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

    HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

    public void count(FileInputStream dataFile) throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        Scanner scnr = new Scanner(dataFile);

        while(scnr.hasNext()) {
            words.add(scnr.next());
        }

        dataFile.close();
    }

    public void write(FileOutputStream outputFile) throws IOException {

        PrintWriter out = new PrintWriter(outputFile);

        out.print(wordCounts);

        outputFile.close();
    }
}
