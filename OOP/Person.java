package OOP;
public class Person {
    String name;
    int age;
    String email;
    String job;

    Person(){}
    
    Person(String name, int age, String email, String job) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.job = job;
    }
    Person(String firstname, String lastname){
        this.name = firstname + " " + lastname;
    }
    Person(int birthYear, int currentYear){
        this.age = currentYear - birthYear;
    }
    void changename(String name) {
        this.name = name;
    }
    void changeage(int age) {
        this.age = age;
    }
    void changeemail(String email) {
        this.email = email;
    }
    void changejob(String job) {
        this.job = job;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
        System.out.println("Job: " + this.job);
    }
    public static void show(){
        System.out.println("Hello, I am a static method in the Person class.");
        
    }

    public void a(){}
    static class P{

        void methodd(){
            System.out.println("Hi I'm P class in person");
        }
    }
}

