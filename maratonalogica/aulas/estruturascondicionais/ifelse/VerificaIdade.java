package maratonalogica.aulas.estruturascondicionais.ifelse;
/*
    Receba uma idade como entrada.
    Se idade for maior que 18 imprima "Adulto".
    Se não imprima "Ainda não é adulto".
*/
public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 17;
        // ==, !=, >, >=, <, <=
        if (idade > 18){
            System.out.println("Menor de idade");
        }else {
            System.out.println("Maior de idade");
        }
    }
}
