import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double fTemp;
        double cTemp;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your temperature in Celsius.");

        if(in.hasNextDouble()) {
            cTemp = in.nextDouble();
            in.nextLine();

            fTemp = (cTemp * 1.8) + 32;

            System.out.println("The temperature in fahrenheit is: " + fTemp);
        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid temperature: " + trash);
        }
    }
}
