
public class Human {

    public String name;
    public int age;
    public String phone;

    public Human (String name, int age, String phone){

        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Human(){

    }

    public String getPhone(){

        return phone;
    }

    public String getName(){

        return name;
    }
}
