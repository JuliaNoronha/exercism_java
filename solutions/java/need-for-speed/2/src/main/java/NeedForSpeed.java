class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int battery = 100;
    private int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(battery < batteryDrain){
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(battery != 0){
            distanceDriven = distanceDriven + speed; 
            battery = battery - batteryDrain;
        }
        else if(batteryDrain > battery){
            distanceDriven = distanceDriven;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50,4);
        return nitro;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
