// Java Program to Find the Largest of three Numbers

import java.util.Scanner;
public class LargestOfThree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the First number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+"is the Largest Number");
        }
        else if(b>a && b>c){
            System.out.println(b+"is the Largest Number");
        }
        else{
            System.out.println(c+"is the Largest Number");
        }
        
        sc.close();
    }
    
}

//SAMPLE OUTPUT
/*
Enter the First number : 20
Enter the Second number : 30
Enter the Third number : 10
30is the Largest Number
*/
