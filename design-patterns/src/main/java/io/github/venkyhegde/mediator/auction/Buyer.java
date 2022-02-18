package io.github.venkyhegde.mediator.auction;

public abstract class Buyer {
    // this holds the mediator
    protected Mediator mediator;
    protected String name;
    protected double price;

    public Buyer(Mediator mediator, String name, double price) {
        this.mediator = mediator;
        this.name = name;
        this.price = price;
    }

    abstract void bid(double price);
    abstract void cancelBid();
    abstract void postAuction();

}

class AuctionBuyer extends Buyer{

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name, 0);
    }

    @Override
    void bid(double price) {
        this.price = price;
        System.out.println(this.name+" has bid for "+this.price);
    }

    @Override
    void cancelBid() {
        this.price = -1;
        System.out.println(this.name+" canceled bid.");
    }

    @Override
    public void postAuction(){
        System.out.println(this.name+" received message that auction ended");
    }

}
