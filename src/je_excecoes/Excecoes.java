package je_excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class Excecoes {
    public static void main(String[] args) {
        checkEstado("RJ");

        try {
            var valor = NumberFormat.getInstance().parse("1");
            System.out.println(valor);
        }
        catch (ParseException ex) {
            System.out.println("erro");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Finally block");
        }
    }

    public static void checkEstado(String nomeEstado) throws EstadoValidationException {
        if(nomeEstado.equalsIgnoreCase("SP")) {
            throw new EstadoValidationException();
        }
        System.out.println("Bem vindo a: " + nomeEstado);
    }
}
