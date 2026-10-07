package _21_Access.a;

public class InnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicField = 1; //public호출 가능
        accessData.publicMethod();

        accessData.defaultField = 2;//default 호출가능
        accessData.defaultMethod();

        //private 접근은 열려있는 메서드로 접근해야한다.
        accessData.inner(); //간접적으로 내부에 접근

    }
}
