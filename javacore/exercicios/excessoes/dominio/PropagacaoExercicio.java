package javacore.exercicios.excessoes.dominio;

public class PropagacaoExercicio {
    public static class ErroDeProcessamentoException extends Exception{
        public ErroDeProcessamentoException(String mensagem) {
            super(mensagem);
        }
    }
    public static void camadaDados() throws ErroDeProcessamentoException {
        // simulando falha
        boolean falha = true;
        if (falha) {
            System.out.println("[Dados] Erro na camada de dados.");
            throw new ErroDeProcessamentoException("[Dados] Falha ao acessar.");
        }
        System.out.println("[Dados] Sucesso");
    }
    public static void camadaServico() throws ErroDeProcessamentoException {
        System.out.println("[Serviço] Iniciando logica de negocio...");
        try {
            camadaDados();
        }catch (ErroDeProcessamentoException e){
            throw e;        }
        System.out.println("[Serviço] Concluida");
    }
    public static void camadaApresentacao() throws ErroDeProcessamentoException{
        System.out.println("[Apresentação] Iniciando aplicação");
        camadaServico();
        System.out.println("[Apresentação] Concluido");
    }

    static void main() {
        System.out.println("Iniciando aplicacao...");
        try {
            camadaApresentacao();
        } catch (ErroDeProcessamentoException e) {
            System.out.println("Erro no main");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        System.out.println("Aplicação encerrada");
    }
}
