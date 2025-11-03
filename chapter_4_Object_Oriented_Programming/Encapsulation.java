package chapter_4_Object_Oriented_Programming;

public class Encapsulation {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pikachu", "Electric");
        Pokemon p2 = new Pokemon("Charmander", "Fire");
        Pokemon p3 = new Pokemon("Squirtle", "Water");
        p1.getPokemon();
        p2.getPokemon();
        p3.getPokemon();
    }
}

class Pokemon {
    private String name;
    private String attribute;
    private static int count;

    Pokemon(String name, String attribute) {
        if (count > 3) {
            throw new Error("Only 3 pokemon for creating");
        }
        this.name = name;
        this.attribute = attribute;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void getPokemon() {
        System.out.println("Name: " + this.name + ", Attribute: " + this.attribute);
    }

}