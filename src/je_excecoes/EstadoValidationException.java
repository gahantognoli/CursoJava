package je_excecoes;

public class EstadoValidationException extends RuntimeException {
    public EstadoValidationException() {
        super("O estado não foi localizado.");
    }
}
