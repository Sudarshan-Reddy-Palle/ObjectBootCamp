import java.util.*;

public class UserIO {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Please select your option:");
            System.out.println("1. Convert feet to inches");
            System.out.println("2. Convert yards to feet");
            System.out.println("3. Convert inches to yards");
            Scanner s = new Scanner(System.in);
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Please enter value in feet: ");
                    float feet = s.nextFloat();
                    float convertedInches = ConversionDevice.convertFeetToInches(feet);
                    System.out.println(feet + " feet in inches are " + convertedInches + " inches");
                    break;
                case 2:
                    System.out.print("Please enter value in yards: ");
                    float yards = s.nextFloat();
                    float convertedFeet = ConversionDevice.convertYardsToFeet(yards);;
                    System.out.println(yards + " yards in feet are " + convertedFeet + " feet");
                    break;
                case 3:
                    System.out.print("Please enter value in Inches: ");
                    float inches = s.nextFloat();
                    float convertedYards = ConversionDevice.convertInchesToYards(inches);;
                    System.out.println(inches + " inches in yards are " + convertedYards + " yards");
                    break;
                default:
                    System.out.print("Invalid option");
                    break;
            }
        }
    }
}
