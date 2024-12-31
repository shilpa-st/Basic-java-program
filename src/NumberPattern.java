class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for numbers in each row
                System.out.print(j + " "); // Print numbers
            }
            System.out.println(); // Move to the next line
        }
    }
}

