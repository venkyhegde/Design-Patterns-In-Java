package io.github.venkyhegde.adapter.objectad;

// This is an adapter to adapt Turkey to Duck.
// Duck is the target interface, Turkey is Adaptee
public class TurkeyAdapter implements Duck {
    Turkey turkey; // adaptee, Turkey being adapted as Duck.
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // here, invoking turkey's gobble which adapts quack
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
