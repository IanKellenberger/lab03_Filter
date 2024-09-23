import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int returnValue = chooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            try (Scanner scanner = new Scanner(selectedFile)) {
                ShortWordFilter filter = new ShortWordFilter();
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
