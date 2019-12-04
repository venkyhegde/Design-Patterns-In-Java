package edu.uncc.decorator.ex1;

public abstract class Component {
    abstract void mainTask();
}

// additional functionality will be added to this class method
class ConcreteComponent extends Component{
    public void mainTask(){
        System.out.println("Main Task of ConcreteComponent");
    }
}
