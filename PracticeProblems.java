import java.util.Scanner;
import java.util.Arrays;
public class PracticeProblems {

    public static void main(String[] args) {
        /* 1).
        System.out.print("Fibonacci sequence with recursion: ");
        fibrecur(8);
        System.out.println();
        System.out.print("Fibonacci sequence without recursion: ");
        fibnonrecur(8);
        */

        /* 2).
        System.out.print("prime numbers :");
        prime(100);
        */
        
        /* 3).
        System.out.println("Swapping two variables without using temp variable :");
        swap(10,20);
        */

        /* 4).
        Scanner sc = new Scanner(System.in);
        int fin = sc.nextInt();
        System.out.println("factorial of "+fin+" with recursion: "+factrecur(fin));
        System.out.println("factorial of "+fin+" without recursion: "+factnonrecur(fin));
        sc.close(); 
        */

        /* 5).
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println("reverse of "+in+": "+strrev(in));
        sc.close(); 
        */
    
        /* 6).
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        VowelsAndConsonents(in);
        sc.close(); 
        */

   }
    /* 1. Write a program to print fibonacci sequence upto n'th term.
            a) with recursion
            b) without recursion
            input: n, where n is int value
            output: 1 1 2 3 5 8 13 21 ... 
    */ 
   // a) with recursion
   static int fibrecur(int n){
        if (n==1 || n==2){
            System.out.print("1 ");
            return 1;
        }
        else{
            int k = fibrecur(n-1) + fibrecur(n-2);
            System.out.print(k + " ");
            return k;
        }

   }
   // b)without recursion
   static void fibnonrecur(int n){
        int fib1 = 1, fib2 = 1, fib3 = 0,i = 2;
        String s = "1 1";
        while(i<n){
            fib3 = fib1+fib2;
            s+=" "+fib3;
            fib1 = fib2;
            fib2 = fib3;
            i+=1;
        }
        System.out.println(s);
   }

   /*
   2.	Write a program to print prime numbers between 1 to 100.
           output: 1 2 3 5 7 11 13 17 19 23 29 ...
    */
   static void prime(int n){
       String s = "1";
       int k = 0;
       for(int i = 2;i<=n;i++){
          k = 0;
          for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j == 0){
                k=1;
                break;
            }
          }
          if(k == 0){
            s+=" "+i;
          }
       }
       System.out.println(s);
   }

   /* 3.  Write a program to swap two numbers without temp variable.
            input:  x=10 & y=6
            output: x=6 & y=10 
   */
    static void swap(int a, int b){
        System.out.println("before Swap: a = "+a+", b = "+b);
        a+=b;
        b = a-b;
        a = a-b;
        System.out.println("after Swap: a = "+a+", b = "+b);
    }

    /* 4. Write a program to return factorial of a given number
            hint: n! = n(n-1)(n-2)(n-3)...
            a) with recursion
            b) without recursion
    */
    // a) with recursion
    static int factrecur(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*factrecur(n-1);
    }
    // b) without recursion
    static int factnonrecur(int n){
        int factorial = 1;
        while (n>1){
            factorial*=n;
            n-=1;
        }
        return factorial;
    }

    // 5. Write a program to reverse a given string without using built-in functions.
    static String strrev(String str){
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    // 6. Write a program to count the number of vowels and consonants in a given string.
    static void VowelsAndConsonents(String str){
        String vowel = "aeiou";
        int vcount = 0;
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++){
            for(int j=0;j<=4;j++){
                if(str.charAt(i)==vowel.charAt(j)){
                    vcount++;
                    break;
                } 
            }
        }
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + (str.length() - vcount));

    }

}
