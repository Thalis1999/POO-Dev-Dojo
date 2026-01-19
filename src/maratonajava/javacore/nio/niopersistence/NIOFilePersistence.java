package src.maratonajava.javacore.nio.niopersistence;

import java.io.*;
import java.nio.ByteBuffer;

public class NIOFilePersistence implements FilePersistence {
    private String currentDir = System.getProperty("user.dir");   //retorna diretorio atual

    private final String storedDir = "/managerFiles/IO/";

    private final String fileName;

    public NIOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDir + storedDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar o arquivo.");

        clearFile();
    }

    @Override
    public String write(String data) {
        try (var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), "rw");) {
            file.seek(file.length());
            file.writeBytes(data);
            file.writeBytes(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public boolean remove(String sentence) {
        return false;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll() {
        var content = new StringBuilder();
        try (
                var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), "rw");
                var channel = file.getChannel();
        ) {
            var buffer = ByteBuffer.allocate(256);
            var byteReader = channel.read(buffer);
            while (byteReader != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    content.append((char) buffer.get());
                }
                buffer.clear();
                byteReader = channel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public String findBy(String sentence) {
        var content = new StringBuilder();
        try (
                var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), "rw");
                var channel = file.getChannel();
        ) {
            var buffer = ByteBuffer.allocate(256);
            var byteReader = channel.read(buffer);
            while (byteReader != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    while (!content.toString().endsWith(System.lineSeparator())) {
                        content.append((char) buffer.get());
                    }
                    if (content.toString().contains(sentence)) {
                        break;
                    } else {
                        content.setLength(0);
                    }
                    if (!content.isEmpty()) break;
                }
                buffer.clear();
                byteReader = channel.read(buffer);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private void clearFile() {
        try (OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
