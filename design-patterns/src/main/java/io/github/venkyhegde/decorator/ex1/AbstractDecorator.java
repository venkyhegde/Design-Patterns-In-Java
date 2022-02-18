package io.github.venkyhegde.decorator.ex1;

public abstract class AbstractDecorator extends Component{
    private Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    @Override
    void mainTask() {
        if (component != null)
            component.mainTask();
    }
}

class ConcreteDecorator extends AbstractDecorator{

    public ConcreteDecorator(Component component){
        super(component);
    }
    @Override
    void mainTask() {
        super.mainTask();
        System.out.println("Additional Functionality  from ConcreteDecorator");
    }
}

class NewConcreteDecorator extends AbstractDecorator{

    public NewConcreteDecorator(Component component){
        super(component);
    }

    @Override
    public void mainTask(){
        System.out.println("Additional Functionality from NewConcreteDecorator");
        super.mainTask();
    }
}


