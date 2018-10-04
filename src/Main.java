public class Main {
    public static void main(String[] args) {
            GreenCard green1 = new GreenCard();
        try {
            green1.topUp(-200);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
            System.out.println(green1.getBalance());
            green1.topUp(100);
            System.out.println(green1.getBalance());
            Card card = new BlueCard();
            ((BlueCard) card).getPoint(); // explicit casting = big to small

    }
}
