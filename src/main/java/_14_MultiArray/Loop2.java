package _14_MultiArray;

public class Loop2 {
    public static void main(String[] args) {
        String department[] = {"인사부","행정부","사업부"};

        //부서의 인덱스와 직원들의 인덱스는 동기화 되어있음.
        String employees[][] = {
                {"김길동","고길동","박길동"}, //인사부
                {"김영희","이영희","최영희"}, //행정부
                {"김철수","박철수","김길동"}  //사업부
        };
        //(문제1) 모든부서를 통틀어 김씨성 출력.
        for(String employee[] : employees){
            for(String e : employee){
                if(e.startsWith("김")){
                    System.out.print(e + "\t");
                }
            }
        }
        System.out.println();
        //(문제2) 사업부이면서 김길동 있는지 확인.
        boolean found = false; // 있으면 true로 변경
        int deptIndex = -1; // 사업부 있는지 확인하는변수(0인덱스 존재해서 -1로 설정함)

        for(int i = 0; i < department.length; i++){
            String deptName = department[i];
            if(deptName.equals("사업부")){
                deptIndex = i; // 사업부가 있는 인덱스 번호 뽑아서 deptIndex에 넣음.
                break;
            }
        }
        if (deptIndex == -1) { // 사업부 없을 경우
            System.out.println("사업부 없다");
            return;
        }
        String[] busiDept = employees[deptIndex]; // 사업부에 속한 직원들을 busiDept에 넣음.
        for(String b : busiDept){
            String name = b;
            if(name.equals("김길동")){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("김길동 있다");
        }else{
            System.out.println("김길동 없다");
        }
    }
}
