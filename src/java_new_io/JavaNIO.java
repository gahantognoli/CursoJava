package java_new_io;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\arquivos\\aula-java.txt");
            String conteudo = "GABRIEL ANTOGNOLI";
            Files.writeString(path, conteudo);

            List<String> linhas = Files.readAllLines(path);
            linhas.forEach(linha -> System.out.println(linha));
//            System.out.println(conteudo);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
