public class Hero {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    private String superPower;

    public Hero(int health, int damage,String superPower){
        this.damage = damage;
        this.health = health;
        this.superPower = superPower;
    }
    public Hero(int health, int damage){
        this.damage = damage;
        this.health = health;
    }
}
