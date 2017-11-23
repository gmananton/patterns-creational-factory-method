package logistics;

import transport.Plane;
import transport.Transport;

/**
 * Created by Anton Mikhaylov on 17.11.17.
 */
public class PlaneLogistics extends Logistics {
    @Override
    public Transport getTransport() {
        return new Plane();
    }
}
