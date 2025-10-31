package _27_Interface.doctor;

public class GeneralDoctor implements DoctorLicense{

    @Override
    public void diagnose(String patient) {
        System.out.println("일반의가 환자를 진단합니다 : " + patient);
    }

    @Override
    public void prescribe(String medicine) {
        System.out.println("일반의가 약을 처방합니다 : " + medicine);
    }
}
