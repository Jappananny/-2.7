
import Draiver.AllDriver;
import Draiver.DriverLicensesB;
import Draiver.DriverLicensesC;
import TransportPack.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Вводные данные 1
        Car lada = new Car("Lada", "Vesta", 2.0, TypeOfBody.SEDAN);
        Car kia = new Car("KIA", "Cerato", 2.5, TypeOfBody.COUPE);
        Car skoda = new Car("Skoda", "Octavia", 3.0, TypeOfBody.CROSSOVER);
        Car audi = new Car("Audi", "A3", 3.0, TypeOfBody.JEEP);
        Bus man = new Bus("MAN", "Lion’s Coach", 5.0, CapacityPeople.SMALL);
        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3, CapacityPeople.ESPECIALLY_SMALL);
        Bus maz = new Bus("MAZ", "232", 3.5, CapacityPeople.ESPECIALLY_BIG);
        Bus setra = new Bus("Setra", "Provate", 3.8, CapacityPeople.AVERAGE);
        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0, LoadCapacity.N3);
        Truck mon = new Truck("MON", "41.410 8x4", 10.0, LoadCapacity.N2);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0, LoadCapacity.N3);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2, LoadCapacity.N1);
        //Вводные данные 2
        Mechanic<Car> sanich = new Mechanic<>("Саныч","Вологда",
                "Охраник ГСК № 20");
        Mechanic<Truck> vasja = new Mechanic<>("Вася","Краматорск",
                "'ООО' Синяя изолента ");
        Sponsor azino777 = new Sponsor("Азино три топора",777777777);
        //Вывод результата
        System.out.println("===============================================================================");
        lada.info();
        man.info();
        iveco.info();
        System.out.println("===============================================================================");
        gaz.info();
        gaz.allInfoTransport();
        System.out.println("===============================================================================");
        List<Transport> allTransportCar = List.of(lada,kia,skoda);
        lada.addDriver(new DriverLicensesB("Евпатий Коловрат",
                "выданные боженькой", 13, lada));
        lada.addMechanic(new Mechanic<>("Петрович", "с соседнего гаража", "ГСК № 20"));
        lada.addSponsor(azino777);
        for (Transport allTransportCars : allTransportCar){
            info(allTransportCars);
        }
        ServiseStation serviceStation = new ServiseStation();
        serviceStation.addTransportQueue(lada);
        serviceStation.service();



    }
    private static void info(Transport allTransportCar){
        System.out.println("Автомобиль " + allTransportCar.getBrand() + ", с водителем " + allTransportCar.getDriver()
                + ", \nс мешаником " + allTransportCar.getMechanics() + " \nи спонсором " +allTransportCar.getSponsor() + ".");
    }
}