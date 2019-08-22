package homework.prog.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@SaveTo(path = "D:\\ua.kiev.prog\\Text.txt")
public class TextContainer {

    String text = "My name is Artem, and I like to learn Java!!!";

    @Saver
    public void save(String path) throws IOException {

        Files.write(Paths.get(path),text.getBytes());


    }

}







