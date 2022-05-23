import java.util.Arrays;
import java.util.List;

public class Farm {

      int id;
       private String address;

        List<Cow> cows;
        List<Horse> horses;
        List<Sheep> sheep;
        String ownerName;

    public Farm(int id,String address, List<Cow> cows, List<Horse> horses, List<Sheep> sheep, String ownerName) {
        this.id=id;
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }


    @Override
    public String toString() {
        return "Farm "+id+"{" +
                "address='" + address + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
