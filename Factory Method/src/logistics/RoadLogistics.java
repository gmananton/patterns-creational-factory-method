package logistics;

import transport.Transport;
import transport.Truck;

/**
 * Created by Anton Mikhaylov on 17.11.17.
 */
public class RoadLogistics extends Logistics {
    @Override
    public Transport getTransport() {
        return new Truck();
    }
}
