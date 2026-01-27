package Strategy_Pattern;

//child class of Duck
public class RedHeadDuck extends Duck {
    RedHeadDuck(){
        size=5;
    }
    public static void main(String[] args) {
        RedHeadDuck obj=new RedHeadDuck();
        obj.display();
    }

}
