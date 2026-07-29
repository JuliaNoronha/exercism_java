public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRatePerHour = 221;
        if(speed >= 1 && speed <= 4){
            productionRatePerHour *= speed;
            return productionRatePerHour;
        }
        else if(speed >= 5 && speed <= 8){
            productionRatePerHour *= speed;
            return productionRatePerHour * 0.90;
        }
        else if(speed == 9){
            productionRatePerHour *= speed;
            return productionRatePerHour * 0.80;
        }
        else if(speed == 10){
            productionRatePerHour *= speed;
            return productionRatePerHour * 0.77;
        }
        else if(speed == 0){
            return productionRatePerHour = 0.0;
        }
        return productionRatePerHour;
    }

    public int workingItemsPerMinute(int speed) {
        int workingItemsPerMinute = 0;
        workingItemsPerMinute = (int)(productionRatePerHour(speed) / 60.0);
        return workingItemsPerMinute;
    }
}