package src.maratonajava.javacore.exercicios.excessoes.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade incorreta", 151);
        }
        this.nome = nome;
        this.idade = idade;
        System.out.println("Pessoa" + nome + "e idade " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    static void main() {
        Pessoa p1 = new Pessoa("thalis", 151);

        try{
            System.out.println("Tentando criar pessoa com 151 anos");
            Pessoa p2 = new Pessoa("luis", 151);
        }catch (IdadeInvalidaException e){
            System.err.println("Erro ao criar pessoa ");
        }
    }
}
