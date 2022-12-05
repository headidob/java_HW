import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
       // текущее время (в часах от 0 до 23)
        System.out.println("Enter current time in full hours: ");
        int currentTime1 = scanner.nextInt();

       // текущий день недели
        System.out.println("Today is working day? ");
        boolean weekDay1 = scanner.nextBoolean();


       System.out.println("Is master at home? ");
        boolean masterAtHome1 = scanner.nextBoolean();;

        Curtains curtainsStatus= new Curtains(weekDay1, masterAtHome1, currentTime1);
        Alarm alarmStatus = new Alarm(masterAtHome1);
        Kettle kettleStatus = new Kettle(masterAtHome1, currentTime1);


        System.out.println("Curtains status: " + curtainsStatus.activateCurtains() + " Alarm status: " + alarmStatus.checkAlarmStatus() + " Kettle status: " + kettleStatus.checkKettleStatus());

        System.out.println("----new curtain status: Curtains are UP!--Я до конца не понял как правильно реализовать условие с поднятыми шторами и какой статус у штор по умолчанию?------------");
        curtainsStatus.areCurtainsUp = true;
        System.out.println(curtainsStatus);

        System.out.println("Curtains status: " + curtainsStatus.activateCurtains() + " Alarm status: " + alarmStatus.checkAlarmStatus() + " Kettle status: " + kettleStatus.checkKettleStatus());



       // 1) В будний день в 8ч поднять шторы, если хозяева дома (сигнализация отключена)
       // 2) В выходной день в 11ч поднять шторы, если хозяева дома
       // 3) В будний день в 20ч вечера включить чайник, если хозяев нет дома
       // 4) В будний день в 23ч опустить шторы, если шторы были подняты
       // Выполнение действия обозначать выводом соответствующего сообщения на экран.
    }
}