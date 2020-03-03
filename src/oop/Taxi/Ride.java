package oop.Taxi;

public class Ride {


    private final int passengers;
    private final int distance;
    private final int duration;
    private final Tariff tariff;

    public Ride(int passengers, int distance, int duration, Tariff tariff) {
        if (passengers <= 0 || distance <= 0 || duration <= 0) {
            throw new IllegalArgumentException("0 is illegal value");
        }
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
        this.tariff = tariff;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public long getPrice() {
        return tariff.calculatePrice(this);
    }

    @Override
    public String toString() {
        return "Ride{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                ", tariff=" + tariff +
                '}';
    }
}
