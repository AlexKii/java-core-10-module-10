import read.PhoneNumbersValidator;
import read.JsonPrinter;
import read.WordsCounter;

import java.io.File;

public class Tests {
    private static final File BASE = new File("files");

    public static void main(String[] args) {

        //task 1
        new PhoneNumbersValidator().main(BASE);

        //task 2
        new JsonPrinter().main(BASE);

        //task 3
        new WordsCounter().main(BASE);

    }
}
