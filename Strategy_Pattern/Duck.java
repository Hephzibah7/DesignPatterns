package Strategy_Pattern;

public class Duck {

    /*Even if you dont give any constructor this will be default constructor
     Duck(){  }
    */ 

     //Every duck has different size they can put there own values here when they inherit Duck class.
     int size;


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


    /*
    Design 3- 
    So as we know now that inheritance hasn't worked well.Design 2 looks promising at first, but we need to implement the interfaces in all 
    Duck class that have quack or fly ability since Java interface typically have no implementation code, so no code reuse.
    In either designs if you have to track down the classes and change their behaviours introducing new bugs.

    Luckily there is a design principle for just this situation.

    Design Principle-
    Identify the aspects of your application that vary and separate them from that which stays the same.

    Okay! Now other than fly and quack interface the Duck class has no issue, so we are going to remove fly and quack behaviours from the Duck class.

    Now, In order to separate the "parts that change from those that stays the same", we are going to create two sets of classes, one for fly
    and other for quack. And each behaviour types of individual behaviours will overide this classes. 

    And we know that now we have to assign behaviours to the instances of the Duck. For example, we might want to instantiate new MallardDuck object
    with specific flying behaviour. And while we are here why not make sure that we change dynamically the behaviour of a class.
    Dynamically in the sense we should be able to change the flying behaviour of the Mallard instance while creating the instance, so technically,
    we should have setter method also that would help us to change the flybehaviour of the Mallard instance.


    Okay so we will make two interfaces, FlyInterface and Quack Interface, and the Duck class will not be implementing this interfaces, but instead
    the each implementation of the behaviours or the behaviour class in other words will be implementing this interfaces.

    This is in contrast of what we used to do earlier where behaviour used to come out of the class Duck, but now we have separate class only
    represent this behaviours. Like squeaking class that represent a kind of fly behaviour and implements fly interface.
    So with our new design the behaviour will not be locked inside the implementation of the Duck class, and we will be able to change the
    behaviour dynamically.
     */

    

    /*

     */

     public void quack(){
        System.out.println("I can quack");
    }

    public void fly(){

    }

}
