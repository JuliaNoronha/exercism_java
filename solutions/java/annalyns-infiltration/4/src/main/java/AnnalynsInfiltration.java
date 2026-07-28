class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean canFastAttack = true;
        return canFastAttack = !knightIsAwake;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = true;
        return canSpy = knightIsAwake || archerIsAwake || prisonerIsAwake; 
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignalPrisoner = true;
        return canSignalPrisoner = prisonerIsAwake && !archerIsAwake;
    }
    
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFreePrisoner = true;
        return canFreePrisoner = (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake);
        // if(petDogIsPresent && !archerIsAwake)                      
        //     canFreePrisoner = true;
        // else if(!petDogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake)
        //     canFreePrisoner = true;
        // else
        //     canFreePrisoner = false;
        // return canFreePrisoner;
}
}
