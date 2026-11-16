package lab.src.main.java.agh.po.lab4.animals;


public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return "This is Parrot";
    }
}