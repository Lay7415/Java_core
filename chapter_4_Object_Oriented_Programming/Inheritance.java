package chapter_4_Object_Oriented_Programming;

public class Inheritance {
    public static void main(String[] args) {
        Goblin goblin = new Goblin("Grimtooth");
        goblin.getGoblin();
    }
}

class Mammal {
    protected String type;
    protected int strength;

    Mammal(String type, int strength) {
        this.type = type;
        this.strength = strength;
    }
}

class Goblin extends Mammal {
    private String name;

    Goblin(String name) {
        super("goblin", 34);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getGoblin() {
        System.out.println("Goblin Name: " + name + ", Type: " + type + ", Strength: " + strength);
    }
}
