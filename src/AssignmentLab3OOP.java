import java.util.Scanner
    public class AssignmentLab3OOP {
        public static void main(String[] args){
            public class ConversionCalculator {

  
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    
    public static double gramsToKilograms(double g) {
        return g / 1000.0;
    }

   
    public static double minutesToHours(double m) {
        return m / 60.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        System.out.println(km + " km = " + kmToMiles(km) + " miles");

        System.out.print("Enter weight in grams: ");
        double grams = input.nextDouble();
        System.out.println(grams + " g = " + gramsToKilograms(grams) + " kg");

        System.out.print("Enter time in minutes: ");
        double minutes = input.nextDouble();
        System.out.println(minutes + " minutes = " + minutesToHours(minutes) + " hours");

        input.close();
    }
}
 
    }


public class MultipleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        input.close();
    }
}
   
}
