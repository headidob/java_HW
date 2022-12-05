public class Curtains {

    boolean isWeekDay;
    boolean isMasterAtHome;
    int currentTime;
    boolean areCurtainsUp;

    public Curtains(boolean weekDay, boolean masterAtHome, int currentTime) {
        this.isWeekDay = weekDay;
        this.isMasterAtHome = masterAtHome;
        this.currentTime = currentTime;
    }

    public String curtainsStatusinWords(boolean areCurtainsUp){
        if(areCurtainsUp){
            return "Curtains are up";
        }else{
            return "Curtains are down";
        }

    }
// 2) В выходной день в 11ч поднять шторы, если хозяева дома

    public String activateCurtains() {
        if (this.isWeekDay && this.isMasterAtHome && this.currentTime == 8) {
            areCurtainsUp = true;
        } else if (!this.isWeekDay && this.isMasterAtHome && this.currentTime == 11) {
            areCurtainsUp = true;
        } else if (areCurtainsUp && this.isWeekDay && this.currentTime == 23) {
            areCurtainsUp = false;
        } else {
            areCurtainsUp = false;
        }
        return curtainsStatusinWords(areCurtainsUp);
    }

    @Override
    public String toString() {
        return "Curtains{" +
                "isWeekDay=" + isWeekDay +
                ", isMasterAtHome=" + isMasterAtHome +
                ", currentTime=" + currentTime +
                ", areCurtainsUp=" + areCurtainsUp +
                '}';
    }
}
