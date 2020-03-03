package oop.Taxi;

public class TaxiRunner {
    public static void main(String[] args) {

        Tariff standard = new StandardTariff();
        Tariff family = new FamilyTariff();

        Ride ride1 = new Ride(1, 4, 1, standard);
        Ride ride2 = new Ride(3, 1, 1, family);

        RidesHistory ridesHistory = new RidesHistory();
        ridesHistory.addRide(ride1);
        ridesHistory.addRide(ride2);

        System.out.println("Total price of all rides: " + ridesHistory.getTotalPrice());
    }
}
