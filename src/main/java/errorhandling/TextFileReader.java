package errorhandling;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

    /**
     * Reads a textfile and returns the text as a string
     *
     * @param file the file to be read
     * @return The text of the file
     * @throws IOException
     */
    public static String readTextFile(File file) throws IOException {
        List<String> lines = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null)
        {
            lines.add(line);
        }
        reader.close();
        return StringUtils.join(lines);
    }

    public static void main(String[] array) {
        try {
            String text = TextFileReader.readTextFile(new File("/tmp/nonexisting-file.txt"));
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("could not read text from file: " + e.getMessage());
        }

    }


}
