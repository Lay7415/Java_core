package Chap_2_basic_of_java_programming;

public class Primitive_Type_Conversion {

    public static void main(String[] args) {
        double a = 56.9898;
        int b = (int) Math.round(a);
        System.out.println(b); 

        float float_var = 55.55f;

        System.out.println((int)float_var);
    }
}