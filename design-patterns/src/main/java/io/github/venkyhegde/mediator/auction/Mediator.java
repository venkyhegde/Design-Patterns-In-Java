package io.github.venkyhegde.mediator.auction;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the mediator interface for the auction
 * it will add new buyer to auction
 * it also finds highest bidder
 */
public interface Mediator {
    void addBuyer(Buyer buyer);
    void findHighestBidder();
}

class AuctionMediator implements Mediator{
    private List<Buyer> buyerList;

    public AuctionMediator() {
        this.buyerList = new ArrayList<>();
    }


    @Override
    public void addBuyer(Buyer buyer) {
        this.buyerList.add(buyer);
    }

    @Override
    public void findHighestBidder() {
        double highBid = Double.MIN_VALUE;
        Buyer winner = null;

        for (Buyer buyer : buyerList){
            if (buyer.price > highBid){
                highBid = buyer.price;
                winner = buyer;
            }
        }

        System.out.println("Auction winner - "+winner.name+". Price - "+winner.price);

        for (Buyer buyer: buyerList){
            buyer.postAuction();
        }
    }
}
