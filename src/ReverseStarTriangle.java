class ReverseStarTriangle {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for stars in the row
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

