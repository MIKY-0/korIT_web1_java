package _03_Operator;

public class Operator3 {
    public static void main(String[] args) {
        boolean hasLicense = true;
        int age = 25;
        boolean canDrive = (age >= 20) && hasLicense;

        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestDay = isWeekend || isHoliday;

        boolean isOnline = true;
        boolean isOffLine = !isOnline;
    }
}
