package _31_NestedClass.Annonymous;

public abstract class Character {
    protected String name;
    protected int HP;
    protected int attackDamage;

    public Character(String name, int HP, int attackDamage) {
        this.name = name;
        this.HP = HP;
        this.attackDamage = attackDamage;
    }
    public abstract void attack(Character target); // 캐릭터마다 공격 방식 다르게(원거리 , 근거리)
    public void showStatus(){
        System.out.println(this.name + " 체력 : " + this.HP);
    }
    //데미지를 받는 공통 메서드
    public void receiveDamage(int damage){
        this.HP -= damage;
        if(this.HP <= 0){
            this.HP = 0;
            System.out.println(name + "가 쓰러졌습니다");
        }
    }
    public String getName() {
        return name;
    }
}
