/**
 * The program simply returns area value of Circle, Rectangle and Triangle based on user input.
 * @author Mohammad Seeam
 */

// To get user imput
import java.util.Scanner;
//To do mathematical calculation, and to get PI value
import java.lang.Math;

/* Geometry class contains all necessary methods to get area of Circle, Rectangle and Triangle*/
class Geometry{

    /* circle_area() method returns the area value for circle */
    public static double circle_area(double radius){
        //circle_area_value is the value of the area of circle
        double circle_area_value = Math.PI*(radius*radius);
        return circle_area_value;
    }

    /* rectangle_area() method returns the area value for rectangle */
    public static double rectangle_area(double length, double width){
        //rectangle_area_value is the value of the area of the rectangle
        double rectangle_area_value = length*width;
        return rectangle_area_value;
    }

    /* triangle_area() method returns the area value for triangle */
    public static double triangle_area(double base, double height){
        //triangle_area_value is the value of the area of the triangle
        double triangle_area_value = base*height*(0.5);
        return triangle_area_value;
    }

}

/* Below class contains main function from where we use the Geometry class */

class Geometry_Main {

    /* main function is below */
    public static void main(String[] args) {

        //sc object will be used to get user input
        Scanner sc = new Scanner(System.in);

        //Created obj_geometry object to use the Geometry class
        Geometry obj_geometry = new Geometry();

        //This boolean will continue the prompt again and again until false or exit the program
        boolean continue_prompt = true;

        //This while loop will be used to display prompt again and again using boolean
        while(continue_prompt==true) {
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            System.out.println("Enter your choice (1-4): ");
            // option is the value taken from used from 1 to 4 (included)
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter the value of radius: ");
                // radius is the radius value from user
                double radius = sc.nextDouble();
                // final_circle_value is the area value of circle
                double final_circle_value = obj_geometry.circle_area(radius);
                System.out.println("The area of the Circle is " + final_circle_value);
                System.out.println("\n");
            } else if (option == 2) {
                System.out.println("Enter the value of length: ");
                // length is the length value from user
                double length = sc.nextDouble();
                System.out.println("Enter the value of width: ");
                // width is the width value from user
                double width = sc.nextDouble();
                //final_rectangle_value is the area of rectangle
                double final_rectangle_value = obj_geometry.rectangle_area(length, width);
                System.out.println("The area of the Rectangle is " + final_rectangle_value);
                System.out.println("\n");
            } else if (option == 3) {
                System.out.println("Enter the value of base: ");
                //base is the base value of triangle from user
                double base = sc.nextDouble();
                System.out.println("Enter the value of height: ");
                //height is the height value of triangle from user
                double height = sc.nextDouble();
                //final_triangle_value is the area of triangle
                double final_triangle_value = obj_geometry.triangle_area(base, height);
                System.out.println("The area of the Triangle is " + final_triangle_value);
                System.out.println("\n");
            } else if (option == 4) {
                System.out.println("The program ends...");
                System.exit(1);
            } else {
                System.out.println("Invalid choice. Please enter a number from 1 to 4");
                System.out.println("\n");
            }
        }
    }
}

//Output is given below:

/*
Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1-4): 
1
Enter the value of radius: 
5
The area of the Circle is 78.53981633974483


Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1-4): 
2
Enter the value of length: 
4
Enter the value of width: 
2
The area of the Rectangle is 8.0


Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1-4): 
3
Enter the value of base: 
3
Enter the value of height: 
9
The area of the Triangle is 13.5


Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1-4): 
6
Invalid choice. Please enter a number from 1 to 4


Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1-4): 
4
The program ends...
*/