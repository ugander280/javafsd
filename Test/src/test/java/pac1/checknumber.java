package pac1;  // Make sure this file is inside the 'pac1' folder in your project

public class checknumber {
    public static void main(String[] args) {
        // Ensure the user provided an argument
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        // Convert the argument to an integer
        int num = Integer.parseInt(args[0]);

        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
