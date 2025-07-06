package je_colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List linguagens = new ArrayList();
        linguagens.add("java");
        linguagens.add("c#");
        linguagens.add("javascript");

        System.out.println("Capacidade: " + linguagens.size());
        System.out.println("Pos. 2: " + linguagens.get(2));
        System.out.println("Pos. linguagem java: " + linguagens.indexOf("java"));

        linguagens.remove(1);
        System.out.println("Capacidade: " + linguagens.size());

        for (Object linguagem : linguagens)
            System.out.println(linguagem);
    }
}
