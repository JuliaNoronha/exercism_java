public class Lasagna {
    int camadasAdicionadas;
    int minutosGastos;
    int tempoReal;
    
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int tempoReal){
        int minutosFaltantes = expectedMinutesInOven() - tempoReal;
        return minutosFaltantes;
    }
    public int preparationTimeInMinutes(int camadasAdicionadas){
        minutosGastos = camadasAdicionadas * 2;
        return minutosGastos;
    }
    public int totalTimeInMinutes(int camadasAdicionadas, int tempoReal){
        int tempoTotal = preparationTimeInMinutes(camadasAdicionadas) + tempoReal;
        return tempoTotal;
    }
}
