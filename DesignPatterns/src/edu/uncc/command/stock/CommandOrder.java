package edu.uncc.command.stock;

// this is the command
public interface CommandOrder {
    void execute();
}

// Two Operations can be
class BuyStock implements CommandOrder{
    // this will have the receiver

    private Stock stock; //  this is receiver

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

class SellStock implements CommandOrder{
    // this will have receiver

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute(){
        stock.sell();
    }
}