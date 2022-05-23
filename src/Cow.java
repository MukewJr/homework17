public class Cow extends AbstractDomesticAnimal {
    private int amountMilk;

    public Cow(int weight, int age, String gender, String nickName, int amountMilk) {
        super(weight, age, gender, nickName);
        this.amountMilk = amountMilk;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "amountMilk=" + amountMilk +
                "} " + super.toString();
    }
}
