import java.util.Scanner;

 class MinimumSwaps {

    public static int minSwaps(int[] arr, int n, int K) {
        
        int count = 0;
        for (int num : arr) {
            if (num < K) {
                count++;
            }
        }

        
        int minSwapsNeeded = Integer.MAX_VALUE;
        int currentSwaps = 0;
        int i = 0;
        int j = count; 

      
        for (int k = i; k < j; k++) {
            if (arr[k] >= K) {
                currentSwaps++;
            }
        }

        minSwapsNeeded = Math.min(minSwapsNeeded, currentSwaps);

        
        while (j < n) {
            if (arr[i] >= K) {
                currentSwaps--;
            }
            if (arr[j] >= K) {
                currentSwaps++;
            }

            minSwapsNeeded = Math.min(minSwapsNeeded, currentSwaps);

            i++;
            j++;
        }

        return minSwapsNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int K = scanner.nextInt(); 

        
        int result = minSwaps(arr, n, K);
        System.out.println(result);

        scanner.close();
    }
}
