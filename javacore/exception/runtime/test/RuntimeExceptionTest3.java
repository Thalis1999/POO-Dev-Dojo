package javacore.exception.runtime.test;

public class RuntimeExceptionTest3 {
    static void main() {

    }
    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("fechando recurso liberado pelo SO");
        }
        return null;
    }
}
