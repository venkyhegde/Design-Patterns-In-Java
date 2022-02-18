package io.github.venkyhegde.mediator.auction;

public class Client {
    public static void main(String[] args) {
        // creating mediator
        Mediator mediator = new AuctionMediator();

        Buyer buyer1 = new AuctionBuyer(mediator, "Buyer 1");
        Buyer buyer2 = new AuctionBuyer(mediator, "Buyer 2");
        Buyer buyer3 = new AuctionBuyer(mediator, "Buyer 3");
        Buyer buyer4 = new AuctionBuyer(mediator, "Buyer 4");

        // add buyer to auction
        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        mediator.addBuyer(buyer4);

        // making bid
        buyer1.bid(100.01);
        buyer2.bid(400.51);
        buyer3.bid(350.23);
        buyer4.bid(500);
        buyer4.cancelBid();

        mediator.findHighestBidder();

    }
}
