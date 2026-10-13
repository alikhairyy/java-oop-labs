import java.util.Scanner;
 public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter grams of carbohydrates");
            double carbohydartes = input.nextDouble();
            
            System.out.print("Enter grams of fats");
            double fats = input.nextDouble();
            
            System.out.print("Enter grams of Protein");
            double protein = input.nextDouble();
            
            
            double totalCalories = (3* carbohydartes)+(15* fats)+(6* protein);
            
            System.out.println("Total Calories= " + totalCalories);
        }
      
      
    }
    }


public class BMICalculator {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        
        double heightM = heightCm / 100;

     
        double bmi = weight / (heightM * heightM);

        
        System.out.println("Your BMI is: " + bmi);

        input.close();
    }
    import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Display the results
        System.out.println("Area of the circle = " + area);
        System.out.println("Circumference of the circle = " + circumference);

        input.close();
    }
}

}

    
}
