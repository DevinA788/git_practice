/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dalbishi
 */
import java.util.Scanner;

public class UserInput_Math {
    
    static Scanner userInput = new Scanner(System.in);
 
    public static void main(String args[]) {
        
        System.out.print("Your favorite number: ");
        
        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();
            
            System.out.println("You entered " + numberEntered);
        }
    }
}

