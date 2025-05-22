class Car {
    private String plateNumber;
    private String owner;
    private int parkedHours;

    Car(String plate, String ownerName, int hours) {
        plateNumber = plate;
        owner = ownerName;
        parkedHours = hours;
    }

    String getPlateNumber() {
        return plateNumber;
    }

    void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    String getOwner() {
        return owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    int getParkedHours() {
        return parkedHours;
    }

    void setParkedHours(int parkedHours) {
        this.parkedHours = parkedHours;
    }

    void showInfo() {
        System.out.println("Plate Number: " + plateNumber + ", Owner: " + owner + ", Parked Hours: " + parkedHours);
    }
}

class ParkingGarage {
    private Car[] parkedCars;
    private int carCount;

    ParkingGarage() {
        parkedCars = new Car[5];
        carCount = 0;
    }

    void addCar(Car car) {
        if (carCount < 5) {
            parkedCars[carCount] = car;
            carCount++;
            System.out.println("Car added: " + car.getPlateNumber());
        } else {
            System.out.println("Garage is full. Can't add car: " + car.getPlateNumber());
        }
    }

    void removeCar(String plateNumber) {
        int index = -1;
        for (int i = 0; i < carCount; i++) {
            if (parkedCars[i].getPlateNumber().equalsIgnoreCase(plateNumber)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Car with plate number " + plateNumber + " not found.");
            return;
        }
        for (int i = index; i < carCount - 1; i++) {
            parkedCars[i] = parkedCars[i + 1];
        }
        parkedCars[carCount - 1] = null;
        carCount--;
        System.out.println("Car with plate number " + plateNumber + " removed");
    }

    void showAllCars() {
        if (carCount == 0) {
            System.out.println("Garage is empty");
            return;
        }
        System.out.println("Parked Cars: ");
        for (int i = 0; i < carCount; i++) {
            parkedCars[i].showInfo();
        }
    }
}

class Main {
    public static void main(String[] args) {
        ParkingGarage garage = new ParkingGarage();

        garage.addCar(new Car("ABC123", "John ", 2));
        garage.addCar(new Car("XYZ789", "Smith", 4));
        garage.addCar(new Car("LMN456", "Bob", 1));

        garage.removeCar("ABC123");

        garage.showAllCars();
    }
}
