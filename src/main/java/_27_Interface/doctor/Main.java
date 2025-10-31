package _27_Interface.doctor;

public class Main {
    public static void main(String[] args) {
        //(문제1)아래 코드 정상 작동 하도록 DoctorLicense와 GeneralDoctor , Surgeon 완성
        DoctorLicense d1 = new GeneralDoctor();
        DoctorLicense d2 = new Surgeon();
        DoctorLicense m1 = new GeneralDoctor();
        DoctorLicense m2 = new Surgeon();
        String patient = "홍길동";
        String medicine[] = {"감기약" , "항생제"}; //(번외1)
        DoctorLicense doctor[] = {d1 , d2};
        int i = 0;//(번외1)
        //(문제2)출력예시 - 일반의가 환자를 진단합니다 : 홍길동 / 일반의가 약을 처방합니다 : 감기약 / 외과의가 환자를 진단합니다 : 홍길동 / 외과의가 수술하고 약을 처방합니다 : 항생제
        //(번외 하드코딩 1방법 , 2방법) 약을 외부에서 주입하는 코딩.
        for(DoctorLicense d : doctor){
            d.diagnose(patient);
            d.prescribe(medicine[i]); //(번외1)
            i++; //(번외1)
        }
    }
}
