package OOP;

interface A{
    void sayHi();
}

@FunctionalInterface
interface B{
    // void sayHi();
    // int add(int a, int b);
    int factorial(int n);
}
public class functionalInterface{

    public static void main(String[] args){
        
        // A obj = new A(){

        //     public void sayHi(){
        //         System.out.println("Hi");
        //     }
        // };
        // obj.sayHi();

        // B obj = ()-> System.out.println("Hi");
        // obj.sayHi();

        // B obj = (a,b)-> a+b;
        // System.out.println(obj.add(2, 5));

        // B obj = (n)->{
        //     int a = n;
        //     for(int i = 1;i<n;i++){
        //         a*=i;
        //     }
        //     return a;
        // };
        // System.out.println(obj.factorial(5));
    }
}
