package transport;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */
public interface Transport {
    public void deliver();
    public void load(int amount);
    public boolean isReady();
    public String getName();
}
