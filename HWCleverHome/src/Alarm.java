public class Alarm {


    boolean isMasterAtHome;
    boolean alarmStatus;

    public Alarm(boolean masterAtHome){
       this.isMasterAtHome = masterAtHome;
        }

    public String alarmStatusInWords(boolean alarmStatus){
        if(alarmStatus){
            return "Alarm is ON";
        }else{
            return "alarm is OFF";
        }

    }

    public String checkAlarmStatus (){
        if(this.isMasterAtHome){
            alarmStatus = false;
        }else{
            alarmStatus = true;
        }
        return alarmStatusInWords(alarmStatus);
        }



}
