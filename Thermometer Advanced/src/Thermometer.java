public class Thermometer {

    double tempCel;
    double tempFar;

    public Thermometer(double inputTempCel, double inputTempFar) {
        tempCel = inputTempCel;
        tempFar = inputTempFar;
    }


    private int roundTemp(double inputTemp){

        return (int) Math.round(inputTemp);

    }

    public int getFahrenheit(double inputTempCel){

        double convertCtoF = ((tempCel * 9) / 5) + 32;

        int roundedF = roundTemp(convertCtoF);

        return roundedF;
    }

        public int getCelsius(double inputTempFar){
            double convertCtoF = ((tempFar - 32)*5/9);

            int roundedC = roundTemp(convertCtoF);

            return roundedC;

        }




    }


