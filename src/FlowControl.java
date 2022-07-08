import java.util.Scanner;
import java.lang.Exception;

public class FlowControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type first number:");
        Integer param1 = sc.nextInt();
        System.out.println("Type second number:");
        Integer param2 = sc.nextInt();
        sc.close();

        try {
            count(param1, param2);
        }
        catch (InvalidParameterException e) {

        }
        
    }

    static void count(int param1, int param2) throws InvalidParameterException {

        if (param1 > param2) {
            throw new InvalidParameterException("Second number must be higher than first number.");
        }

        else {
            int number = param2 - param1;
            for(int i = 1; i <= number; i++) {
                System.out.println("Printing number " + i);
            }
        }

    }

    static class InvalidParameterException extends Exception {
        public InvalidParameterException(String errorMessage) {
            System.out.println(errorMessage);
        }
    }

}
