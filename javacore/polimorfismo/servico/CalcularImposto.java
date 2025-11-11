package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

// Metodo genérico para produtos
// narrowing cast(explicito) - Referencia a classe super, e objeto a sub classe
// instanceof - verificar se instancia do objeto de referencia produto é to tipo Tomate
public class CalcularImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade(); //cast - produto para tipo tomate.
            System.out.println(dataValidade);
        }
    }
}
