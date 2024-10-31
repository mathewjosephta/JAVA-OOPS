// Java Program to Check if Given Integer is Odd or Even

import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number to be Checked : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
        sc.close();
    }
    
}

// SAMPLE OUTPUT
/*
Enter a number to be Checked : 3
The number is odd
*/
