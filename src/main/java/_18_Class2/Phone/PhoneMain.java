package _18_Class2.Phone;
/* (문제1) Phone클래스 정의.
        필드 : battery(int) , isPowerOn(boolean)
        메서드 : turnOn(전원켜기. 배터리 10%이상일때만 가능) , turnOff(전원 끄기) playYoutube(전원 켜지면서 배터리 5% 이상일때만 가능 , 실행시 배터리 5% 소모)
         , charge(충전. 배터리 20% 충전. 최대 100%)

*/
class Phone{
    int battery;
    boolean isPowerOn;

    void turnOn(){
        if(battery >= 10) {
            System.out.println("전원이 켜집니다");
            isPowerOn = true;
        }else{
            System.out.println("배터리 부족. 충전요망");
        }
    }
    void turnOff() {
        System.out.println("전원이 꺼집니다");
        isPowerOn = false;
    }
    void playYoutube(){
        if(isPowerOn && battery >= 5){
            System.out.println("유튜브를 시청합니다");
            battery -= 5;
            if(battery < 0) {battery = 0;}
        }
    }
    void charge(){
        System.out.println("배터리를 충전합니다");
        battery += 20;
        if(battery > 100) {battery = 100;}
    }
}
public class PhoneMain {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.isPowerOn = false;
        p.battery = 50;

        p.turnOn();
        p.playYoutube();
        p.charge();
        p.turnOff();
    }
}
