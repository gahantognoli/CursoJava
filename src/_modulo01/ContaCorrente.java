package _modulo01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    int numero;
    int agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    double saldo;
    boolean ativo = true;

    void sacar(Double valorSolicitado){
    }

    void transferir(ContaCorrente contaDestino, double valorTransferido){
    }

    void cancelar(String justificativa){
    }

    List<String> consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){
        return new ArrayList<>();
    }

    double consultarSaldo(){
        return saldo;
    }
}
