package transport;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */
public class Boat implements Transport {

    private int goodsAmount;
    private final String name = "MEGA BOAT";

    @Override
    public void deliver() {
        System.out.println("Goods were delivered by the boat");
    }

    @Override
    public void load(int amount) {
        this.goodsAmount = amount;
        System.out.println("Boat was loaded with amount of " + amount);
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
