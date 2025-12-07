package src.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest1 {
    static void main() {
        File file = new File("C:\\PROJETOS\\DevDojo\\arquivo");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());  // endereco absoluto
            System.out.println("is diretory " + file.isDirectory());  // é diretorio?
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());  // arquivo é oculto?
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));  //trabalha com Data
            boolean exists = file.exists();  // existe?
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
