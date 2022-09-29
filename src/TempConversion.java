import java.util.Objects;
import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);


    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }

    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) {
        return convertC2K(convertF2C(fahrenheit));
    }

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertK2F(double kelvin) { return convertC2F(convertK2C((kelvin))); }
    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {

        while(true) {
            String fromUnit = getUnitChoice();
            String toUnit = getUnitChoice();
            double value = getTemp(fromUnit);

            String myCase = fromUnit + toUnit;
            double result;
            switch(myCase.toUpperCase()) {
                case "CF":
                    result = convertC2F(value);
                    break;
                case "CK":
                    result = convertC2K(value);
                    break;
                case "FC":
                    result = convertF2C(value);
                    break;
                case "FK":
                    result = convertF2K(value);
                    break;
                case "KC":
                    result = convertK2C(value);
                    break;
                case "KF":
                    result = convertK2F(value);
                    break;
                case "QQ":
                    System.exit(0);
                default:
                    result = value;
                    break;
            }
            System.out.printf("Result %f%s is %f%s%n", value, fromUnit, result, toUnit);

        }
    }
}