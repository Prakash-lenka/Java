package PracticeProblems.OOPsPrograms;

/* 17.	Create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that implement these methods.

Car
  void  startEngine() – “Car engine started” 
  void  stopEngine() -  “Car engine stopped”

MotorCycle
   void  startEngine() – “MotorCycle engine started” 
   void  stopEngine() -  “MotorCycle engine stopped” 
*/

public abstract class Vehicle {

    public abstract void startEngine();
    public abstract void stopEngine();
}
