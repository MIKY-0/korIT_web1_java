package _30_Singleton;

public class LogManager {
    //아래 코드는 싱글톤 코드
    private static LogManager instance; /*외부에서 접근을 막으면서 전역에서 하나를 공유할 필드. 메서드 영역에 저장될 변수.
    instance변수에 공유할 객체의 힙주소 저장. */

    private LogManager() {}

    public static LogManager getInstance() {//그래도 외부용 접근 메서드 하나를 만들어줘야됨. 길을 하나 만들어줘야됨. 객체 생성 전에도 호출되야하니까 static.
        //단 하나의 객체를 사용하도록 코드 구현
        if (instance == null) {    //저장된 힙주소가 없으면 새로 하나 힙에서 메모리 만들어서 주소를 삽입! 이 if문 코드는 최초 1회만 실행됨. 한번 만들어지면 계속 메모리에 올라가 있으니까.
            instance = new LogManager();
        }
        return instance; // 이제 저장된 힙주소를 리턴
    }

    public void log(String msg) {
        System.out.println("LOG : " + msg);
    }
    //스프링 프레임워크에서는 객체를 싱글톤으로 관리. 기능적 서비스(service , repo- , controller) -> 템플릿화. 왜 이렇게 사용? -> 여러 요청마다 new로 생성하면 메모리 낭비.
}