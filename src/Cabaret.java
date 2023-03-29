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
    
    public double averagePerformerAge() {
        double sum = 0;
        for(Performer performer: performers) {
            sum += performer.getAge();
        }
        return sum / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> overAge = new ArrayList<>();
        for(Performer performer: performers) {
            if(performer.getAge() >= age) {
                overAge.add(performer);
            }
        }
        return overAge;
    }

    public void groupRehearsal() {
        for(Performer performer: performers) {
            System.out.println("REHEARSAL CALL!: " + performer.getName());

            if(performer instanceof Comedian) {
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for(Performer performer: performers) {
            System.out.println("Welcome to the cabaret! Next act up..." + performer.getName());

            if(performer instanceof Dancer) {
                Dancer temp = (Dancer) performer;
                temp.pirouette(2);
            }
            performer.perform();
        }
    }
}
