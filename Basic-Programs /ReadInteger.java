/* Program Read and Print an Integer value in Java */

import java.util.Scanner;
public class ReadInteger{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a Number : ");
     int num=sc.nextInt();
     System.out.println("The number given by user is "+ num);
     sc.close();
  }
}

//SAMPLE OUTPUT
/*
Enter a Number : 10
The number given by user is 10
*/
