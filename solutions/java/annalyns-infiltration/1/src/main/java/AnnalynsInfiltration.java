class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean canFastAttack = true;

        if(knightIsAwake == true){
            canFastAttack = false;
        }
        else if(knightIsAwake == false){
             canFastAttack = true;   
        }
        return canFastAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = true;;
        if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            canSpy = true;
        }
        else if(knightIsAwake == false || archerIsAwake == false || prisonerIsAwake == false){
            canSpy = false;
        }
        return canSpy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignalPrisoner = true;
        if(archerIsAwake == true && prisonerIsAwake == false){
            canSignalPrisoner = false;
        }
        else if(archerIsAwake == false && prisonerIsAwake == true){
            canSignalPrisoner = true;
        }
        else{
            canSignalPrisoner = false;
        }
        return canSignalPrisoner;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFreePrisoner = true;
        if(petDogIsPresent == true && archerIsAwake == false){
            canFreePrisoner = true;            
        }
        else if(petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false){
            canFreePrisoner = true;
        }else{
            canFreePrisoner = false;
        }
        return canFreePrisoner;
    }
}
