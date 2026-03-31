package src.maratonajava.javacore.serializacao.test;

import src.maratonajava.javacore.serializacao.dominio.Aluno;
import src.maratonajava.javacore.serializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest1 {
    static void main() {
        Aluno aluno = new Aluno(1L, "Thalis", "232322222");
        Turma turma = new Turma("Maratona Java");
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){ //trabalhar com baixo nivel
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar(){ //trabalhar com baixo nivel
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
