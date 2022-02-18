package io.github.venkyhegde.adapter.objectad;

public interface Turkey {
    void gobble();
    void fly();
}

class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble ...");
    }

    @Override
    public void fly() {
        System.out.println("Flying ...");
    }
}
