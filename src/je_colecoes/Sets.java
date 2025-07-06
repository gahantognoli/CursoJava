package je_colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set linguagens = new HashSet();
        linguagens.add("java");
        linguagens.add("c#");
        linguagens.add("javascript");

        System.out.println("Capacidade: " + linguagens.size());

        linguagens.remove("c#");
        System.out.println("Capacidade: " + linguagens.size());

        for (Object linguagem : linguagens)
            System.out.println(linguagem);
    }
}
