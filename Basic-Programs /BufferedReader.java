// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        
        // Create BufferedReader object for input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read input data using readLine
        String name = reader.readLine();

        // Output the inputted data
        System.out.println(name);
    }
}
