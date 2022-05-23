public class Sheep extends AbstractDomesticAnimal {
   private int massWool;

    public Sheep(int weight, int age, String gender, String nickName, int massWool) {
        super(weight, age, gender, nickName);
        this.massWool = massWool;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "typeWool='" + massWool + '\'' +
                "} " + super.toString();
    }
}
