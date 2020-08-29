package Exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Cryptopangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T= sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int L= sc.nextInt();
            int[] message= new int[L];
            for (int j = 0; j < L ; j++) {
                message[j]= sc.nextInt();
            }
            System.out.println(Arrays.toString(sieveOfEratosthenes(129)));
            System.out.println("Case #"+ i + ": "  );
        }
    }

    public static int[] sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int[] Result= new int[n];
        int cont=0;
        // Print all prime numbers
        for(int i = 2; i <= n; i++) {
            if (prime[i] == true){
                Result[cont] = i;
                cont++;
            }

        }

        return  Result;
    }
}
