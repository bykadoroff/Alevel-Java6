package ua.bykadoroff.hw10;

public class Main {
    public static void main(String[] args) {

        Pow powViaLambda = (number, pow) -> {
            double result = 1;
            if (pow == 0) {
                return result;
            }
            if (number == 0) {
                return 0;
            }
            if (pow < 0) {
                pow = pow * (-1);
                for (int i = 1; i <= pow; i++) {
                    result = result * (1 / number);
                }
                return result;
            }
            if (pow > 0)
                for (int i = 1; i <= pow; i++) {
                    result = result * number;
                }
            return result;
        };

        System.out.println(powViaLambda.pow(3, 3));
        System.out.println(powViaLambda.pow(3, 4));
        System.out.println(powViaLambda.pow(6, 5));
        System.out.println(powViaLambda.pow(6, 6));
        System.out.println(powViaLambda.pow(9, 7));

    }
}
