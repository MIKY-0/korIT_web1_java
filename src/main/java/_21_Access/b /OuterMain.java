package _21_Access.b;

import _21_Access.a.AccessData;

public class OuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicField = 1; //public호출 가능
        accessData.publicMethod();

//        accessData.defaultField = 2;//default 접근불가.다른 패키지라서
//        accessData.defaultMethod();

        //private 접근은 열려있는 메서드로 접근해야한다.
        accessData.inner(); //간접적으로 내부에 접근

        //main을 실행할때 어떤일이 일어나는가
        //1. .java파일 -> .class파일 : 컴파일 - 컴파일시점
        //2. .class파일을 JVM이 읽는다 - 런타임시점
        //3.JVM이 OS와 소통하면서 작동.
    }
}
