
class ParkingSystem {
    int[] all_parking;
    int[] car_parking = { 0, 0, 0 };

    public ParkingSystem(int big, int medium, int small) {
        this.all_parking[0] = big;
        this.all_parking[1] = medium;
        this.all_parking[2] = small;

    }

    public boolean addCar(int carType) {
        for (int i = 0; i < 3; i++) {
            if (carType == i + 1) {
                car_parking[i] = car_parking[i] + 1;
                if (car_parking[i] > all_parking[i]) {
                    return false;
                }
            }
        }
        return true;

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */