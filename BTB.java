import java.util.Scanner;

public class BTB {

    public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (countSetBits(i) == k) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    private static int countSetBits(int i) {
        if (i == 0)
            return 0;
        else
            return 1 + countSetBits(i & (i-1));
}

}