package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String passengerName;
    private String passengerSurname;
    private String pilotName;
    private String placeOfDispatch;
    private String destination;
    private String airplaneClass;

    private Plane(PlaneBuilder builder) {
        this.passengerName = builder.newPlane.passengerName;
        this.passengerSurname = builder.newPlane.passengerSurname;
        this.pilotName = builder.newPlane.pilotName;
        this.placeOfDispatch = builder.newPlane.placeOfDispatch;
        this.destination = builder.newPlane.destination;
        this.airplaneClass = builder.newPlane.airplaneClass;
    }

    private Plane() {
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengerName='" + passengerName + '\'' +
                ", passengerSurname='" + passengerSurname + '\'' +
                ", pilotName='" + pilotName + '\'' +
                ", placeOfDispatch='" + placeOfDispatch + '\'' +
                ", destination='" + destination + '\'' +
                ", airplaneClass='" + airplaneClass + '\'' +
                '}';
    }

    public static class PlaneBuilder {
        private Plane newPlane;

        public PlaneBuilder(String passengerName) {
            newPlane = new Plane();
            newPlane.passengerName = passengerName;
        }

        public PlaneBuilder setPassengerName(String passengerName) {
            newPlane.passengerName = passengerName;
            return this;
        }

        public PlaneBuilder setPassengerSurname(String passengerSurname) {
            newPlane.passengerSurname = passengerSurname;
            return this;
        }

        public PlaneBuilder setPilotName(String pilotName) {
            newPlane.pilotName = pilotName;
            return this;
        }

        public PlaneBuilder setPlaceOfDispatch(String placeOfDispatch) {
            newPlane.placeOfDispatch = placeOfDispatch;
            return this;
        }

        public PlaneBuilder setDestination(String destination) {
            newPlane.destination = destination;
            return this;
        }

        public PlaneBuilder setAirplaneClass(String airplaneClass) {
            newPlane.airplaneClass = airplaneClass;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
