package ua.i.sonne;

public class CatTest {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska", 5, 3);
        Cat murzik = new Cat("Murzik", 6, 5);
        Cat barsik = new Cat("Barsik", 2, 1);

        barsik.meow();
        murzik.meow();

        vaska.jump();
        murzik.play();
        barsik.eat();

        barsik.setWeight(2);
        System.out.println(barsik.getWeight());

    }
}
