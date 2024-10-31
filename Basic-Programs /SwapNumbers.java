// Java Program to Swap Two values using third variable using temp variable 

import java.util.Scanner;
public class SwapNumbers{
  static void swap(int m,int n){
    int temp=m;
    m=n;
    n=temp;
    
    System.out.println("After Swapping the value of m is : "+m+" and n is : "+n);
  }

   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the value for m : " );
        m=sc.nextInt();
        System.out.print("Enter the value for n : " );
        n=sc.nextInt();
        
        swap(m,n);
    }
} 

//SAMPLE OUTPUT
/*
Enter the value for m : 10
Enter the value for n : 20
After Swapping the value of m is : 20 and n is : 10
*/
