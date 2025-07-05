package je_expressoes;

import java.time.LocalDate;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Gabriel Antognoli";
        Integer matricula = 123;
        Double salario = 9125.54;
        LocalDate dataAdminissao = LocalDate.now();
//        String textoImpresso = "Ola ".concat(nome).concat(" ").concat(sobrenome);
        String dadosFuncionario = String.format("Mat.: %05d - Nome: %-15.15s - Sal.: %,.2f - %td/%<tm/%<tY",
                matricula, nome, salario, dataAdminissao);
        System.out.println(dadosFuncionario);
    }
}
