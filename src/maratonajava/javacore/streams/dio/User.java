package src.maratonajava.javacore.streams.dio;

import java.util.List;

public record User(String name, int age, Sex sex, List<Contact> contacts) {
}
