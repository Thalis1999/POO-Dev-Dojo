package javacore.exercicios.excessoes.dominio;

public class IdadeInvalidaException extends RuntimeException{
    private int idadeInvalida;

    public IdadeInvalidaException(String mensagem, int idade) {
        super(mensagem);
        this.idadeInvalida = idade;
    }

    public int getIdadeInvalida() {
        return idadeInvalida;
    }

    public void setIdadeInvalida(int idadeInvalida) {
        this.idadeInvalida = idadeInvalida;
    }
}
