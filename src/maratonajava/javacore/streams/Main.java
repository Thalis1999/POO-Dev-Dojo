package src.maratonajava.javacore.streams;

import src.maratonajava.javacore.streams.dio.Contact;
import src.maratonajava.javacore.streams.dio.ContactType;
import src.maratonajava.javacore.streams.dio.Sex;
import src.maratonajava.javacore.streams.dio.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<User> users = new ArrayList<>(generateUsers());

        var values = users.stream()
                .filter(u -> u.contacts().size() >= 2)
              //.filter(u -> u.contacts() == null || u.contacts().isEmpty(); //nulo ou vazio
              //.filter(u -> u.contacts().stream().anyMatch(c -> type() == EMAIL); //contatos que tenham email
                .toList();

        users.forEach(System.out::println);
    }

    private static  List<User> generateUsers() {
        var contacts1 = List.of(
                new Contact("(19)98777888", ContactType.PHONE),
                new Contact("joao@gmail.com", ContactType.EMAIL)
        );
        var contacts2 = List.of(
                new Contact("(19)96598745", ContactType.PHONE),
                new Contact("maria@gmail.com", ContactType.EMAIL)
        );
        var contacts3 = List.of(
                new Contact("(19)91554873", ContactType.PHONE),
                new Contact("julia@gmail.com", ContactType.EMAIL)
        );
        var contacts4 = List.of(
                new Contact("(19)94333444", ContactType.PHONE),
                new Contact("jonas@gmail.com", ContactType.EMAIL)
        );

        var user1 = new User("Joao", 26, Sex.MALE, new ArrayList<>(contacts1));
        var user2 = new User("Maria", 45, Sex.FEMME, new ArrayList<>(contacts2));
        var user3 = new User("Julia", 19, Sex.FEMME, new ArrayList<>(contacts3));
        var user4 = new User("Jonas", 22, Sex.MALE, new ArrayList<>(contacts4));

        return List.of(user1, user2, user3, user4);
    }
}
