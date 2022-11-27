public class Thermometer {

    private int tempRound(double tempInput) {

        return (int) (Math.round(tempInput));

    }

    public static int tempConverterTempCtoF(double tempCel) {

        double tempFar = ((tempCel * 9) / 5) + 32;

        Thermometer thermometer = new Thermometer();
        int tempFarRound = thermometer.tempRound(tempFar);

        return tempFarRound;

    }

    public static int tempConverterTemFtoC(double tempFar) {

        double tempCel2 = ((tempFar - 32)*5/9);

        Thermometer thermometer = new Thermometer();
        int tempCelRound = thermometer.tempRound(tempCel2);

        return tempCelRound;

    }

}

