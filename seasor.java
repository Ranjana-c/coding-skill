
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[] matrix = new int[rows * cols];
       
        for (int i = 0; i < rows * cols; i++) {
            matrix[i] = sc.nextInt();
}

        int staRowSum = 0, cerSum = 0, endRowSum = 0;

         for (int j = 0; j < cols; j++) {
            staRowSum += matrix[j]; 
 }
               for (int j = 0; j < cols; j++) {
            endRowSum += matrix[(rows - 1) * cols + j]; 
      }
            for (int i = 0; i < Math.min(rows, cols); i++) {
                 cerSum += matrix[i * cols + (cols - 1 - i)];
                }
                  int totalSum = staRowSum + cerSum + endRowSum;
        if (cols > 1) { 
            totalSum -= matrix[cols - 1]; 
            totalSum -= matrix[(rows - 1) * cols]; 
        }
          System.out.println("Sum" + totalSum);
    }
