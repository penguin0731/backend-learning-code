package rely;

public class Motor {
    private int oilConsumption;

    public Motor(int oC) {
        oilConsumption = oC;
    }

    public void calcRunTime(Oil oil) {
        int runTime = oil.getVolume() / oilConsumption;
        System.out.println("The motor can run " + runTime + " hours");
    }
}
