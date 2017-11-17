package logistics;

import transport.Transport;

/**
 *  Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 *  дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 *  которой требуется создание разнообразных продуктов.
 */
public abstract class Logistics {

    /**
     * Мы выносим весь код создания продуктов в особый Фабричный метод.
     * Тут он абстрактный, чтобы дочерние классы обязательно переопредили его.
     * Однако можно сделать и возвращение какого-то типа по-умолчанию
     */
    public abstract Transport getTransport();

    public void prepareAndMakeDelivery(int amountToTransfer) {
        Transport t = getTransport();
        t.load(amountToTransfer);
        if (isTransportLoaded(t)) {
            t.deliver();
        } else {
            System.out.println("Sorry, " + t.getName() + " is not ready, because it wasn't loaded");
        }

    }

    public boolean isTransportLoaded(Transport t) {
        return t.isReady();
    }
}
