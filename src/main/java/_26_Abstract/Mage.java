package _26_Abstract;
//(문제1)mage클래스,archer클래스 생성
//mage는 체력 80 , 공격력 30. 공격시에 "name이 targetname에게 마법 미사일을 발사합니다" 출력
//archer는 체력 100 , 공격력 20. 공격시에 "name이 targetName에게 관통 화살을 발사합니다" 출력

public class Mage extends Character{

    public Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이 " + targetName + "에게 마법 미사일을 발사합니다");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이 " + attackDamage + "의 데미지를 받았습니다");
    }
}
