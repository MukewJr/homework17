public class Horse extends AbstractDomesticAnimal {
   private String breed;

    public Horse(int weight, int age, String gender, String nickName, String breed) {
        super(weight, age, gender, nickName);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
