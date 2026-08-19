package OOP;

class Athread implements Runnable{ // we can also extends Thread but java won't support if we wanna extend another class by A (multiple inheritance).

    @Override
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("hi");
        }
        try{Thread.sleep(10);}
        catch(Exception e){}
    }
}

class Bthread implements Runnable{

    @Override
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("hello");
        }
        try{Thread.sleep(10);}
        catch(Exception e){}
    }
}

public class ThreadDemo {

    public static void main(String[] args){

        // Runnable a = new Athread();
        // Runnable b = new Bthread();

        Runnable a = ()->{
            for(int i=0;i<5;i++){System.out.println("Hi");}
            try{Thread.sleep(10);}
            catch(Exception e){}
            
        };
        Runnable b = ()->{
            for(int i=0;i<5;i++){System.out.println("Hello");}
            try{Thread.sleep(10);}
            catch(Exception e){}
        };


        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }

}
