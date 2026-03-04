package com.mycompany.rectangleassignment;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author mishannonabazid
 * 
 * Program Name: Area of Rectangle
 * 
 * Program Purpose: This program will use object oriented principles to create classes and methods.
 * 
 * Part 1: Creating The Class and Method
 *  - Create a class for Rectangle and the proper method to calculate area
 *  - Prompt the user to enter the dimensions, call the method, and return a valid value being sure to check for input and output errors
 * 
 * Part 2: Add volume
 *  - Add and create appropriate classes and methods for calculating volume for containers such as Cylinder, Cube, and Sphere
 *  - Prompt user to enter values to calculate volume for at least one of the shapes
 */
public class RectangleAssignment {
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Part 1: Creating class and method to calculate Rectangle area
        
        try {
            System.out.print("Enter the length of the rectangle: "); 
            int length = input.nextInt(); 
            
            System.out.print("Enter the width of the rectangle: "); 
            int width = input.nextInt(); 

            if (length <= 0 || width <= 0) { 
                System.out.println("Error: Dimensions must be positive whole numbers."); 
            } else { 
                int area = calculateArea(length, width);
                System.out.println("The area of the rectangle is: " + area); 
            }
            
        // Part 2: Calculating the volume of Sphere
            System.out.print("\nEnter the radius of the sphere: ");
            int radius = input.nextInt();
            
            if (radius <=0) {
                System.out.println("Error: Radius must be a positive whole number.");
            } else {
                double volume = Sphere.calculateVolume(radius);
                System.out.println("The volume of the sphere is: " + volume);
            }

        } catch (InputMismatchException e) { 
            System.out.println("Invalid input. Please enter whole numbers only."); 

        } 
        
        input.close(); 
        }
    }
/* Classes for Cube & Cylinder presented below :
public class Cube {
    public static double calculateVolume(int side) {
        return Math.pow(side, 3);
    } 
}

public class Cylinder {
    public static double calculateVolume(int radius, int height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
*/
