 class PrintEvenNumbers {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Even numbers from 1 to 10:");

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

