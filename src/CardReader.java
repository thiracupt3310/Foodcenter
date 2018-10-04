public class CardReader {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void read(Card card){
        card.spend(price);
        System.out.println("Balance: " + card.getBalance());
        this.price = 0;
    }
}
