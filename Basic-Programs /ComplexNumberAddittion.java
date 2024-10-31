// Java program to add two complex numbers

class ComplexNumber {

    int real, image;

    // Constructor to initialize complex number
    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    // Method to display the complex number
    public void show() {
        System.out.println(real + " + i" + image);
    }

    // Method to add two complex numbers
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        return new ComplexNumber(n1.real + n2.real, n1.image + n2.image);
    }

    public static void main(String[] args) {

        // Creating two complex numbers
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);

        // Displaying the complex numbers
        System.out.print("First Complex Number: ");
        c1.show();
        System.out.print("Second Complex Number: ");
        c2.show();

        // Adding and displaying the result
        ComplexNumber result = add(c1, c2);
        System.out.print("Sum: ");
        result.show();
    }
}

// SAMPLE OUTPUT
/*
First Complex Number: 4 + i5
Second Complex Number: 10 + i5
Sum: 14 + i10
*/
