class StarPattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");// prints a space
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");//prints a star
            }
            System.out.println();
        }
    }
}

