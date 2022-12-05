public class Kettle {
    boolean isMasterAtHome;
    int currentTime;
    boolean kettleStatus;

    public Kettle(boolean isMasterAtHome, int currentTime){
        this.isMasterAtHome = isMasterAtHome;
        this.currentTime = currentTime;

    }

    public String kettleStatusInWords(boolean kettleStatus){
        if(kettleStatus){
            return "Kettle is ON";
        }else{
            return "Kettle is OFF";
        }

    }

    public String checkKettleStatus(){
        if(!this.isMasterAtHome && currentTime==20){
          kettleStatus = true;
        }else{
            kettleStatus = false;
        }
        return kettleStatusInWords(kettleStatus);

    }



}
