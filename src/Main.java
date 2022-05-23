import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cow cow1=new Cow(150, 7,"F","Ala-Bash",12);
        Cow cow2=new Cow(145,8,"F", "Konur", 14);
        Cow cow3=new Cow(165,6,"F","Kara",9);
        Cow cow4=new Cow(158, 5,"F","Ala-Bash",12);
        Cow cow5=new Cow(149,9,"F", "Konur", 14);
        Cow cow6=new Cow(166,5,"F","Muyuz",9);

        Sheep sheep1=new Sheep(55, 5,"F","Ak koi",3 );
        Sheep sheep2=new Sheep(50,3,"F", "Kara koi", 4);
        Sheep sheep3=new Sheep(59,4,"M","Ak koi",5);
        Sheep sheep4=new Sheep(60,4,"M","Kochkor",6);

        Horse horse1=new Horse(200,5,"M","Tulpar","Turkmen");
        Horse horse2=new Horse(250,6,"M","Arhiles","Arab");
        Horse horse3=new Horse(215,7,"M","Jorgo","Golshtin");

        List<Cow> cows1=new ArrayList<>();
        cows1.add(cow1);
        cows1.add(cow2);
        cows1.add(cow3);
        cows1.add(cow4);
        cows1.add(cow5);
        List<Cow> cows2=new ArrayList<>();
        cows2.add(cow6);

        List<Sheep> sheep=new ArrayList<>();
        sheep.add(sheep1);
        sheep.add(sheep2);
        sheep.add(sheep3);
        List<Sheep> SHEEP=new ArrayList<>();
        SHEEP.add(sheep4);

        List<Horse> horses1 = new ArrayList<>();
        horses1.add(horse1);
        horses1.add(horse2);
        List<Horse> horses2 = new ArrayList<>();
        horses2.add(horse3);



        Farm farm1=new Farm(1,"Too-jayloo",cows1,horses1,sheep,"Asan");

        Farm farm2=new Farm(2,"Ak-say",cows2,horses2,sheep,"Uson");

        Farm[] farms={farm1,farm2};
        for (Farm farm : farms) {
            System.out.println(farm.toString());
        }

    }
}