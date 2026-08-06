package OOP;
public class Main {
    public static void main(String[] args) {
        // Person p1 = new Person("prakash",24,"prakash@example.com","Engineer");
        // Person p2 = new Person("manjula",p1.age,"manjula@example.com","Financial Analyst");

        // p1.display();
        // p2.display();
        
        // p1.changeage(25);
        // p1.changeemail("prakash.new@example.com");
        // p1.changejob("Senior Engineer");
        // p1.display();

        // Person.show();
        
        // Me me = new Me();
        // me.dis(); 
        
        // System.out.println(me);

        Prakash man = new Prakash();
        man.height();
        man.weight();



    }
}

class Me{
    void dis(){
        System.out.println("Hello, I am a class in the OOP package.");
    }
    @Override
    public String toString() {
        return "This is the Me class.";
    }
}

