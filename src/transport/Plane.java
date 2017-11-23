package transport;

/**
 * Created by Anton Mikhaylov on 17.11.17.
 */
public class Plane implements Transport {

    private int goodsAmount;
    private final String name = "MEGA PLANE";

    @Override
    public void deliver() {
        System.out.println("Goods were delivered by the plane");
    }

    @Override
    public void load(int amount) {
        this.goodsAmount = amount;
        System.out.println("Plane was loaded with amount of " + amount);
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
