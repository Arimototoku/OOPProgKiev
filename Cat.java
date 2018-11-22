package ua.i.sonne;

public class Cat {

    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void meow(){
        System.out.println("MEEOOWW");
    }

    public void jump(){
        System.out.println(this.getName() + " is jumping");
    }
    public void play(){
        System.out.println(this.getName() + " is playing");
    }

    public void eat(){
        System.out.println(this.getName() + " is eating");
    }
}
