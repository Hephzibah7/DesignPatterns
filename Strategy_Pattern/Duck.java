package Strategy_Pattern;

public class Duck {

    /*Even if you dont give any constructor this will be default constructor
     Duck(){  }
    */ 

     //Every duck has different size they can put there own values here when they inherit Duck class.
     int size;

    
    public void quack(){
        System.out.println("I can quack");
    }

    //All ducks can swim
    public void swim(){

    }

    //All ducks can display their respectives sizes
    public void display(){
        System.out.println("My size is" + " " + size);
    }

    /*
    Design 1-
    But all Ducks cannot fly which means this feature is possible in some Duck types and not all.
    Temporary Solution- No Problem we will override fly method to do nothing in those Duck classes which do not have fly ability.
    Even there are certain Duck which do not have either fly or quack ability. So we need to overide this two methods for such ducks to do nothing.

    Problem with above solution-
    Suppose new Ducks will be added periodically, and you have to go on overiding this methods to do nothing for all those classes forever which 
    is practically a lot of unneccessary work and also this leads to unwanted codes.
    
    We need a better design
     */


    /*
    Design 2- (Temporary Solution to above Problem)
    OKay then we can remove fly and quack methods since not all ducks have these abilities and we can have two interface Flyable() interface
    and Quackable() interface which implements fly and quack methods respectively.
    This way only those ducks which require fly and quack ability can implement this interface.

    Okay, this solution solves the problem to an extent but kills the concept of code reuse. Because for all ducks we have to implement fly
    methods, in design 1 we had to override methods for few classes but now we have to implement the fly classes for all duck classes which 
    unintentionally increased our work

    Again, we need a better design
     */
    public void fly(){

    }

}
