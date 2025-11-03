package Chap_2_basic_of_java_programming;

public class Switch_Statement {
    public static void main(String[] args) {
        String car_model = "Audi";

        // switch (car_model) {
        //     case "Mers":
        //         System.out.println("Deuthchland");
        //         break;
        //     case "BMW":
        //         System.out.println("Deutchland");
        //         break;
        //     case "Audi":
        //         System.out.println("Deuthchland");
        //         break;
        //     case "Bugati":
        //         System.out.println("England");
        //         break;
        //     case "Licang":
        //         System.out.println("China");
        //     default:
        //         break;
        // }

        switch (car_model) {
            case "Mers" -> System.out.println("Deutschland");
            case "Audi" -> System.out.println("Brasilia");
            case "Bugati" -> System.out.println("England");
            default -> System.out.println("none");
        }
    }
}
