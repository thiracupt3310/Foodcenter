public class BlueCard extends Card{
    private int point;

    public int getPoint(){
        return this.point;
    }

    public void usePoint(int point){
        if (point > this.point)
            throw new IllegalArgumentException("point not enough");
        this.point -= point;
    }
    @Override
    public void topUp(double money){
        super.topUp(money);
        this.point += ((int) money / 200) * 10;
        // implicit type casting  = small to big
    }

    @Override
    public void spend(double purchase){
        super.spend(purchase);
         point += ((int) purchase / 50 * 2);
    }
}
