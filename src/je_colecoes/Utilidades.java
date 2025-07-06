package je_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilidades {
    public static void main(String[] args) {
        List<String> carros = new ArrayList();
        carros.add("gol");
        carros.add("fiesta");
        carros.add("i30");
//        carro.add(1);
//        carro.add(true);

        for(var carro : carros)
            System.out.println(carro);

        Collections.sort(carros);
        for (var carro : carros)
            System.out.println(carro);

        Collections.reverse(carros);
        Collections.shuffle(carros);

        for(var carro : carros)
            System.out.println(carro);
    }
}
