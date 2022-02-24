package person;

public class information {

    private String IDCard;
    private String name;
    private String age;
    private String sex;


    public information() {
    }

    public information(String IDCard, String name, String age, String sex) {
        this.IDCard = IDCard;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
