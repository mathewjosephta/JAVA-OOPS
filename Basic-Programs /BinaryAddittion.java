// Java program to add two binary strings
 
public class BinaryAddittion {
    // Function to add two binary strings
    static String add_Binary(String x, String y)
    {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);// Converting that resultant decimal into binary String
        return result;
    }
    public static void main(String args[])
    {
        String x = "011011", y = "1010111";
        System.out.print(add_Binary(x, y));
    }
}

//SAMPLE OUTPUT
/* 1110010 */
