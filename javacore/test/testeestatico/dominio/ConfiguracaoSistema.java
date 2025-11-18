package javacore.test.testeestatico.dominio;

public class ConfiguracaoSistema {
    public static String nomeAplicacao;
    public static boolean configuracaoCarregada;

    static{
        System.out.println("Carregando configurações iniciais...");
        nomeAplicacao = "Sistema de gestão financeira.";
        configuracaoCarregada = true;
    }
}
