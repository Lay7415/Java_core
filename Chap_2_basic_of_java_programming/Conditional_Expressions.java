package Chap_2_basic_of_java_programming;

public class Conditional_Expressions {
    public static void main(String[] args) {
        String pokemonType = "Fire";

        if (pokemonType.equals("Water"))
            System.out.println("Вода сильна против Огня");
        else if (pokemonType.equals("Fire"))
            System.out.println("Огонь силен против Травы");
        else if (pokemonType.equals("Wind")) 
            System.out.println(("Ветер лишь усиливает огонь"));
        else if (pokemonType.equals("Grass"))
            System.out.println("Трава сильна против Воды");
        else
            System.out.println("Неизвестный тип покемона");
    }
}