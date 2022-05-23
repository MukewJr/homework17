public abstract class AbstractDomesticAnimal {
    private int weight;
    private int age;
    private String gender;
    private String NickName;

    public AbstractDomesticAnimal(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        NickName = nickName;
    }

    @Override
    public String toString() {
        return "{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", NickName='" + NickName + '\'' +
                '}';
    }
}
