package src.model;

public class Hero {
    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;
    public int deadTimes;
    public int killTime;
    public int assistToKillTime;
    public int money;
    public int attackSpeed;
    public String wordsSaidWhenKilling;
    public String wordsSaidWHenBeingKilled;

    public void cheatTeammates(){
        System.out.println("坑队友");
    }

    public float getArmor(){
        return armor;
    }

    public void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }

    public void legendary(){
        System.out.println("恭喜你已超神");
    }

    public float getHp(){
        return hp;
    }

    public void recovery(float blood){
        this.hp = this.hp + blood;
    }
}
