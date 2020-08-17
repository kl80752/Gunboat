import java.util.Scanner;
// this is used to import the scanner function below
public class Main
{
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // System.in is input System.out is output
        // Scanner reader = new Scanner creates a new Scanner instance which points to the input stream passed as argument
        System.out.println("Enter distance to target.\n");
        // backslash n or \n tells the program to start a new line
        double d = reader.nextDouble();
        // d is being declared as a variable that is a double--any decimal number
        // D is distance
        System.out.println("enter the height of the battery relative to the water line\n");
        double h = reader.nextDouble();
        // H is height above sea level
        System.out.println("Enter the initial velocity of the shell\n");
        double v = reader.nextDouble();
        // reader.nextDouble prints out the value the user input as a placeholder for the variable
        // V is Velocity
        
        double a = -4.9*(d/v)*(d/v);
        double b = d;
        double c = a + h;
        
        double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        // The Quadratic Formula solves for the tangent of an angle
        // Remember to add more parentheses so it aligns with the order of operations and multiplication signs
        double angle = Math.atan(tanTheta)*180/3.1415926536;
        // Java solves in radians so we have to convert it back to degrees
        System.out.println("The angle is " + angle);
     
	}
}
