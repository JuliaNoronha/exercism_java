
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int [] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        int lastIndex = birdsPerDay.length - 1;
        int getToday = birdsPerDay[lastIndex];
        return getToday;
    }

    public void incrementTodaysCount() {        
        int lastIndex = birdsPerDay.length - 1;
        birdsPerDay[lastIndex] += 1;
        return;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int contagem = 0;

        for(int i = 0; i < numberOfDays && i < birdsPerDay.length; i++){
            contagem = contagem + birdsPerDay[i];
        }
        return contagem;
    }

    public int getBusyDays() {
        int contagem = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5){
                contagem = contagem + 1;
            }      
        }
        return contagem;
    }
}
