public class JedliksToyCar {
    private int metroPercorrido = 0;
    private int bateria = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metroPercorrido + " meters";
    }

    public String batteryDisplay() {
        if(bateria <= 0){
            return("Battery empty");
        }
        else{
            return "Battery at " + bateria + "%";
        }
    }

    public void drive() {
        if(bateria > 0){
            metroPercorrido = metroPercorrido + 20;
            bateria = bateria - 1;
        }
    }
}
