package Chap_2_basic_of_java_programming;

public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                System.out.print(i * j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}