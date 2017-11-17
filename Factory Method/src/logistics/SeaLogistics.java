package logistics;

import transport.Boat;
import transport.Transport;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */
public class SeaLogistics extends Logistics {


    @Override
    public Transport getTransport() {
        return new Boat();
    }
}
