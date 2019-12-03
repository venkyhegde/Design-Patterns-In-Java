package edu.uncc.adapter.classad;

// here, Duck is target interface and WildTurkey is an adaptee
public class TurkeyAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    public void fly(){
        super.fly();
    }

}
