package Strategy_Pattern;

/* 
MallardDuck extends from Duck class which means MallardDuck has access to all properties of Duck class and can overide it 
according to its suitability.

 */
public class MallardDuck extends Duck {

    public void quack(){
        System.out.println("I quack mallardly");
    }
    public static void main(String[] args) {

        /*
        You cannot call a non static method from static method since in order to access a non static method you always have 
        to create an object.
        quack(); //compilation error thrown
         */



        MallardDuck obj=new MallardDuck();
        /*
        MallardDuck - reference Type
        obj- reference
        MallardDuck in new MallardDuck() is object Type.

        new MallardDuck create an object space in the heap and when we do obj=new MallardDuck that space is assigned the name MallardDuck
         */

        
        /* 
        That class quack method will work which is lower in inheritance tree.
        Since Duck->MallardDuck , and mallardduck overrides the quack method so mallardduck quack method will be executed.
        */
        
        obj.quack(); //Output-I quack mallardly
       
    }
}
