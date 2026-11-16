package lab.src.main.java.agh.po.lab4.animals;

public class Snake extends Animal {
    public Snake(String name) {
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return "This is snake";
    }
}
