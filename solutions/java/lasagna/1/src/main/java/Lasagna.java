public class Lasagna {
    int camadasAdicionadas;
    int minutosGastos;
    int tempoReal;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int tempoReal){
        int minutosFaltantes = 40 - tempoReal;
        return minutosFaltantes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int camadasAdicionadas){
        minutosGastos = camadasAdicionadas * 2;
        return minutosGastos;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int camadasAdicionadas, int tempoReal){
        int tempoTotal = (camadasAdicionadas * 2) + tempoReal;
        return tempoTotal;
    }
}
