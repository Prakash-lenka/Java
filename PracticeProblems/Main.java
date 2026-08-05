package PracticeProblems;
import java.util.Scanner;
import java.util.Arrays;
// import PracticeProblems.OOPsPrograms.Shape;
// import PracticeProblems.OOPsPrograms.Triangle;
// import PracticeProblems.OOPsPrograms.Circle;
// import PracticeProblems.OOPsPrograms.Rectangle;
// import PracticeProblems.OOPsPrograms.Animal;
// import PracticeProblems.OOPsPrograms.Basketball;
// import PracticeProblems.OOPsPrograms.Dog;
// import PracticeProblems.OOPsPrograms.Football;
// import PracticeProblems.OOPsPrograms.Cat;
// import PracticeProblems.OOPsPrograms.Sport;
// import PracticeProblems.OOPsPrograms.Tennis;
import PracticeProblems.OOPsPrograms.*;

public class Main {

    public static void main(String[] args) {

        // ***** FOR QUESTIONS(1-13) METHODS WHICH ARE CALLING HERE ARE DECLARED BELOW(OUTSIDE MAIN METHOD).*****

        /* //1).
        System.out.print("Fibonacci sequence with recursion: ");
        fibrecur(8);
        System.out.println();
        System.out.print("Fibonacci sequence without recursion: ");
        fibnonrecur(8);
        */

        /* //2).
        System.out.print("prime numbers :");
        prime(100);
        */
        
        /* //3).
        System.out.println("Swapping two variables without using temp variable :");
        swap(10,20);
        */

        /* //4).
        Scanner sc = new Scanner(System.in);
        int fin = sc.nextInt();
        System.out.println("factorial of "+fin+" with recursion: "+factrecur(fin));
        System.out.println("factorial of "+fin+" without recursion: "+factnonrecur(fin));
        sc.close(); 
        */

        /* //5).
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println("reverse of "+in+": "+strrev(in));
        sc.close(); 
        */
    
        /* //6).
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        VowelsAndConsonents(in);
        sc.close(); 
        */

        /* //7).
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("is "+num+" prime? : "+isPrime(num));
        sc.close(); 
        */
       
        /* //8).
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrongNum(num));
        sc.close();
        */

        /* //9).
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of Digits of the number "+num+" is "+sumOfDigits(num));
        sc.close(); 
        */

        /* //10).
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i = 0;i<3;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The maximum number is: "+maxNumber(nums));
        sc.close(); 
        */

        /* //11).
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOrOdd(num);
        sc.close(); 
        */

        /* //12).
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers you want to sort? : ");
        int totalnums = sc.nextInt();
        int nums[] = new int[totalnums];
        for(int i = 0;i<totalnums;i++){
            System.out.print("num"+1+" : ");
            nums[i] = sc.nextInt();
        }
        bubbleSort(nums);
        sc.close(); 
        */

        /* //13).
        int[] nums = {1,2,4,5,6,8,9};
        linearSearch(nums, 4); 
        */
        
        /* //14).
        Scanner sc = new Scanner(System.in);
        // Area of a Circle
        // System.out.print("raidus: ")
        // double radius = sc.nextDouble();
        // Shape circle = new Circle(radius);
        // System.out.println("Area of a Circle of 'radius' "+radius+" is "+circle.calculateArea());
        
        // Area of a Rectangle
        // System.out.print("length: ");
        // double length = sc.nextDouble();
        // System.out.print("width: ");
        // double width = sc.nextDouble();
        // Shape rectangle = new Rectangle(length, width);
        // System.out.println("Area of a rectangle of 'length' "+length+" and 'width' "+width+" is "+rectangle.calculateArea());
        
        // Area of a Triangle
        // System.out.print("Base: ");
        // double base = sc.nextDouble();
        // System.out.print("Height: ");
        // double height = sc.nextDouble();
        // Shape triangle = new Triangle(height, base);
        // System.out.println("Area of a rectangle of 'height' "+height+" and 'base' "+base+" is "+triangle.calculateArea());
        
        sc.close(); 
        */

        /* //15).
        Animal dog = new Dog();
        System.out.println("How a dog sounds? : "+ dog.makeSound());
        Animal cat = new Cat();
        System.out.println("How a cat sounds? : "+cat.makeSound());
        */

        /* //16).
        Sport football = new Football();
        System.out.println("What are you doing? : "+football.play());

        Sport basketball = new Basketball();
        System.out.println("What are you doing? : "+basketball.play());

        Sport tennis = new Tennis();
        System.out.println("What are you doing? : "+tennis.play()); 
        */

        /* //17).
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new MotorCycle();
        motorcycle.startEngine();
        motorcycle.stopEngine(); 
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

    // 7. Write a program to check if a given number is a prime number.
    static boolean isPrime(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    // 8.	Write a program to check if a given number is an Armstrong number. 
    static boolean isArmstrongNum(int n){
        int numdigits = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        for(int i = 0; i<numdigits;i++){
            sum+=Math.pow(temp%10, numdigits);
            temp/=10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }

    // 9.	Write a program to find the sum of digits of a given number.
    static int sumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    // 10.	Write a program to find the largest of three numbers.
    static int maxNumber(int[] nums){
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    // 11.	Write a program to check if a given number is odd or even.
    static void evenOrOdd(int n){
        if(n%2==0){
            System.out.println(n+" is an even number.");
        }
        else{
            System.out.println(n+" is an odd number.");
        }
    }

    // 12.	Write a program to implement the bubble sort algorithm.
    static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    // nums[i]+=nums[j];
                    // nums[j] = nums[i]-nums[j];
                    // nums[i]-=nums[j];
                    bswap(nums,i,j);
                }
            }
        }
        for (int i:nums) {
            System.out.print(i+" ");
        }
    }
    static void bswap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 13.	Write a program to implement the linear search algorithm.
    static void linearSearch(int[] nums, int n){
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == n){
                System.out.println(n+" found at "+i);
                k = 1;
                break;
            }
        }
        if(k==0){
            System.out.println("Sorry! "+n+" not in the list.");
        }
    }
    
}
