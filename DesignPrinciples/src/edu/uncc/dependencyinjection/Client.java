package edu.uncc.dependencyinjection;

public class Client {
    private Service service;

    // Injecting dependency through constructor
    public Client(Service service) {
        this.service = service;
    }

    public Client() {
    }

    public void work(){
        try {
            service.writeMessage("Hello World");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // this is a setter injection
    public void setService(Service service){
        this.service = service;
    }

    // this is the injector, this could be in separate class
    public static void main(String[] args) {
        Service newService = new ServiceImp();

        // Injecting through setter
        Client client = new Client();
        client.setService(newService);
        client.work();

        // Injecting through constructor
        Client client1 = new Client(newService);
        client1.work();
    }
}
