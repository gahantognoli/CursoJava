package java_new_io;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File dir = new File("c:\\rocket");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("foi criado o diretório");
        }

        try {
            File arquivo = new File(dir, "aula-java.txt");
            arquivo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
