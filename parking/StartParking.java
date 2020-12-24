package parking;

public class StartParking {
    public void startCounterProgram(){
        Counter car_park = new Counter();

        Counter entrance, exitDoor;
        entrance = new Counter();
        exitDoor = new Counter();

        entrance.initialize();
        entrance.add();
        entrance.add();

//        entrance.number = 10;

        exitDoor.initialize();

        car_park.initialize();
        int parking = entrance.getNumber() - exitDoor.getNumber();    // park = entrance - exit

        System.out.println("Entrance Value: " + entrance.getNumber());
        System.out.println("Exit value: " + exitDoor.getNumber());
        System.out.println("Car parking value: " + parking);
    }
}
