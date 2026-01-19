package src.maratonajava.javacore.io.filepersistence;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IOfilePersistence implements FilePersistence {

    private String currentDir = System.getProperty("user.dir");   //retorna diretorio atual

    private final String storedDir = "/managerFiles/IO/";

    private final String fileName;

    public IOfilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDir + storedDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar o arquivo.");

        clearFile();
    }


    @Override
    public String write(String data) {
        try (
                var fileWriter = new FileWriter(currentDir + storedDir + fileName, true);
                var bufferedWrite = new BufferedWriter(fileWriter);
                var printWriter = new PrintWriter(bufferedWrite);
        ) {
            printWriter.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public boolean remove(String sentence) {
        var content = findAll();
        var contentList = new ArrayList<>(Stream.of(content.split(System.lineSeparator())).toList());

        if (contentList.stream().noneMatch(c -> c.contains(sentence))) return false;

        clearFile();
        contentList.stream()
                .filter(c -> !c.contains(sentence))
                .forEach(this::write);
        return true;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        var contentList = toListString();

        if (contentList.stream().noneMatch(c -> c.contains(oldContent))) return "";

        clearFile();
        contentList.stream()
                .map(c -> c.contains(oldContent) ? newContent : c)
                .forEach(this::write);
        return newContent;
    }

    @Override
    public String findAll() {
        var content = new StringBuilder();
        try (var reader = new BufferedReader(new FileReader(currentDir + storedDir + fileName))) {
            String line;
            do {
                line = reader.readLine();
                if ((line != null)) content.append(line)
                        .append(System.lineSeparator());
            } while (line != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public String findBy(String sentence) {
        var found = "";
        try (var reader = new BufferedReader(new FileReader(currentDir + storedDir + fileName))) {
            String line = reader.readLine();
            while (line != null) {
                if ((line != null) && (line.contains(sentence))) {
                    found = line;
                    break;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return found;
    }

    private void clearFile() {
        try (OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> toListString() {
        var content = findAll();
        return new ArrayList<>(Stream.of(content.split(System.lineSeparator())).toList());
    }
}
