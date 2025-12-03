package src.maratonajava.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
    static void main() {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e){ // Genérica sempre pro final
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }

}
