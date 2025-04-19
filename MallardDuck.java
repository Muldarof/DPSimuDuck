import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallardDuck extends Duck {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();


    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
