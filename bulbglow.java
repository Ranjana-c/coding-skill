import java.util.*;

public class GlowingBulbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String switchStates = scanner.nextLine();
        int k = scanner.nextInt();
        
        
        List<Integer> primeIndices = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37);
        
        
        List<Integer> onSwitches = new ArrayList<>();
        for (int prime : primeIndices) {
            if (switchStates.charAt(prime - 1) == '1') {
                onSwitches.add(prime);
            }
        }
        
    
        int glowingBulb = findKthGlowingBulb(onSwitches, k);
        System.out.println(glowingBulb);
    }
    
    private static int findKthGlowingBulb(List<Integer> onSwitches, int k) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = countGlowingBulbs(onSwitches, mid);
            
            if (count >= k) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }
    
    private static int countGlowingBulbs(List<Integer> onSwitches, int x) {
        int count = 0;
        int n = onSwitches.size();
        
        
        for (int i = 1; i < (1 << n); i++) {
            int lcm = 1;
            int bits = Integer.bitCount(i);
            
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    lcm = lcm(onSwitches.get(j), lcm);
                    if (lcm > x) break;
                }
            }
            
            if (lcm <= x) {
                if (bits % 2 == 1) {
                    count += x / lcm;
                } else {
                    count -= x / lcm;
                }
            }
        }
        
        return count;
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
