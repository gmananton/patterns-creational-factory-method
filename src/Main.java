import logistics.Logistics;
import logistics.PlaneLogistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */
public class Main {

    static Logistics logistics;

    // Приложение создаёт определённую фабрику в зависимости от конфигурации или окружения
    static String type = "road";

    // Весь остальной клиентский код работает с фабрикой и продуктами только
    // через общий интерфейс, поэтому для него неважно какая фабрика была создана.
    public static void main(String[] args) {
        System.out.println("--- Factory Method ---");
        configure();
        logistics.prepareAndMakeDelivery(10);
    }


    public static void configure() {

        switch (type) {
            case "sea":
                logistics = new SeaLogistics();
                break;
            case "road":
                logistics = new RoadLogistics();
                break;
            default:
                logistics = new PlaneLogistics();
        }
    }
}
