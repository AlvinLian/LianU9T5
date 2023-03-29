import java.util.ArrayList;
public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal client) {
        if(clients.indexOf(client) == -1) {
            clients.add(client);
            System.out.println("Welcome to " + name + "'s office, " + client.getName() + "!");
        } else {
            System.out.println(client.getName() + " is already a client of " + name + "!");
        }
    }


}
