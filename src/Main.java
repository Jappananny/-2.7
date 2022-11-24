
import Draiver.AllDriver;
import Draiver.DriverLicensesB;
import Draiver.DriverLicensesC;
import TransportPack.*;

import java.util.*;


public class Main {
    private static final List<String> NAME = List.of(
            "Петрович",
            "Васильичь",
            "Саныч",
            "Николаичь",
            "Сусана Жоржовна",
            "Михалыч",
            "Даша",
            "Анжела Игоревна",
            "Бомж 'Димон'"
    );

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    public static void main(String[] args) {

        /*
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
    System.out.println("===============================================================================");
    */
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();

        random(queue1);
        random(queue2);

        System.out.println(queue1);
        System.out.println(queue2);

        add("Дуся",queue1,queue2);
        System.out.println(queue1);
        System.out.println(queue2);

        remove(queue1,queue2);
        System.out.println(queue1);
        System.out.println(queue2);

        example();



    }
    private static void info(Transport allTransportCar){
        System.out.println("Автомобиль " + allTransportCar.getBrand() + ", с водителем " + allTransportCar.getDriver()
                + ", \nс мешаником " + allTransportCar.getMechanics() + " \nи спонсором " +allTransportCar.getSponsor() + ".");
    }
    private static void random(Queue<String> queue){
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i < size; i++ ){
            queue.offer(NAME.get(RANDOM.nextInt(NAME.size())));
        }
    }
    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, ((i+j) %2==1?"●" : "◯"));;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }
    public static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

}