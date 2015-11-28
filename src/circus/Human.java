package circus;


public class Human {


    private String name;
    private int age;
    private String phone;


    public Human(String name, int age, String phone) {

        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Human() {

    }

    public String getPhone() {

        return phone;
    }

    public String getName() {

        return name;
    }

    public int getAge(){

        return age;
    }

    public String toString() {
        return "Person{" +
                "name:" + getName() +
                ", age=" + getAge() +
                ", phone:" + getPhone();
    }


}


