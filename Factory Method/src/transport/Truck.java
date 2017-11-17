package transport;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */
public class Truck implements Transport {

    int goodsAmount;
    private final String name = "MEGA TRUCK";

    @Override
    public void deliver() {
        System.out.println("Goods were delivered by the truck");
    }

    @Override
    public void load(int amount) {
        this.goodsAmount = amount;
        System.out.println("Truck was loaded with amount of " + amount);
    }

    @Override
    public boolean isReady() {
        return goodsAmount > 0;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    @Override
    public String getName() {
        return name;
    }
}
