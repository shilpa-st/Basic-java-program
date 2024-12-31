public class SimpleStar {
    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces to center the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");//print space
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");//print star
            }

            // Move to the next line
            System.out.println();
        }
    }
}

