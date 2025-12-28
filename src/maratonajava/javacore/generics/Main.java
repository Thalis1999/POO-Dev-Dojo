package src.maratonajava.javacore.generics;


import src.maratonajava.javacore.generics.dao.ClientDAO;
import src.maratonajava.javacore.generics.dao.GenericDAO;
import src.maratonajava.javacore.generics.dao.UserDAO;
import src.maratonajava.javacore.generics.domain.ClientDomain;
import src.maratonajava.javacore.generics.domain.UserDomain;

public class Main {
    private static GenericDAO<Integer, UserDomain> userDAO = new UserDAO();
    private static GenericDAO<String, ClientDomain> clientDAO = new ClientDAO();

    static void main() {
        System.out.println("***UserDAO***");
        var user = new UserDomain(1,"Joao", 25);
        System.out.println(userDAO.count());
        System.out.println(userDAO.save(1, user));
        System.out.println(userDAO.find(d -> d.getId().equals(1)));
        System.out.println(userDAO.find(d -> d.getId().equals(2)));
        System.out.println(userDAO.count());
        System.out.println(userDAO.delete(new UserDomain(-1,"", -1)));
        System.out.println(userDAO.delete(user));
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.count());
        System.out.println("***UserDAO(fim)***");
        System.out.println("***ClientDAO***");
        var client = new ClientDomain("A","Maria", 21);
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.save(1, client));
        System.out.println(clientDAO.find(d -> d.getId().equals("A")));
        System.out.println(clientDAO.find(d -> d.getId().equals("2")));
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.delete(new ClientDomain("","", -1)));
        System.out.println(clientDAO.delete(client));
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.count());
        System.out.println("***ClientDAO(fim)***");





    }
}
