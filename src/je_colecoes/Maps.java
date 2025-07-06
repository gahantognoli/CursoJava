package je_colecoes;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap();
        estados.put("PI", "Piaui");
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");

        System.out.println("Estado: " + estados.get("SP"));

        for (var estado : estados.entrySet()) {
            System.out.println("O estado é: " + estado.getValue());
        }
    }
}
