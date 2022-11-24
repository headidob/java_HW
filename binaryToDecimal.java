public class binaryToDecimal {

    int bin1;
    int bin2;
    int bin3;
    int bin4;
    int bin5;
    int bin6;

    public binaryToDecimal(int number1, int number2,int number3, int number4, int number5, int number6) {
        bin1 = number1;
        bin2 = number2;
        bin3 = number3;
        bin4 = number4;
        bin5 = number5;
        bin6 = number6;
    }

    public int getDecimal(){
        double decimal = bin1*Math.pow(2,5) + bin2*Math.pow(2,4) + bin3*Math.pow(2,3) + bin4*Math.pow(2,2) + bin5*Math.pow(2,1) + bin6*Math.pow(2,0);
        return (int) decimal;
    }
}
