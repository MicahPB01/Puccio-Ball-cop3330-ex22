package oop.example;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int numOne;
        int numTwo;
        int numThree;
        int maxNum;

        System.out.print("Enter the first number: ");
        numOne = Integer.parseInt(input.nextLine());

        System.out.print("Enter the second number: ");
        numTwo = Integer.parseInt(input.nextLine());

        System.out.print("Enter the third number: ");
        numThree = Integer.parseInt(input.nextLine());
        
        maxNum = findMax(numOne, numTwo, numThree);

        if(maxNum != -1)   {
            System.out.printf("The largest number is %d\n", maxNum);
        }
    }
    public static int findMax(int numOne, int numTwo, int numThree)   {
        int currentMax = numOne;
        if(numOne == numTwo || numOne == numThree || numTwo == numThree)   {
            return -1;
        }

        if(numTwo > currentMax)   {
            currentMax = numTwo;
        }
        if(numThree > currentMax)   {
            currentMax = numThree;
        }
        return currentMax;
    }
}
