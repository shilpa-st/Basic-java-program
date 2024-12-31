class StarTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns (stars in each row)
                System.out.print("*"); // Print star on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

