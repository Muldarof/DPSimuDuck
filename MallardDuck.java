import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallardDuck extends Duck {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();

    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
