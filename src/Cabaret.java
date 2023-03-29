import java.util.ArrayList;
public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer potentialPerformer) {
        if(performers.indexOf(potentialPerformer) == -1) {
            performers.add(potentialPerformer);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePerformer(Performer searchPerformer) {
        if(performers.indexOf(searchPerformer) != -1) {
            performers.remove(searchPerformer);
            return true;
        } else {
            return false;
        }
    }
}
