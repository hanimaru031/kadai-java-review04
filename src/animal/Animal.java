package animal;

public class Animal {

    private String Name;// 苗字
    private int age;// 年齢

    public Animal(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getage() {
        return age;

    }

    public void say() {
        System.out.println(Name + "です。" + age + "歳です。");
    }

}