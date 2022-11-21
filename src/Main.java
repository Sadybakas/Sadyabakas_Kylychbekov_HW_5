public class Main {
    public static void main(String[] args) {
        Boss bos = new Boss(1000,50,null);

        System.out.println("Boss health: " + bos.getHealth() + ", damage: " + bos.getDamage()
           + ", defence type: " + bos.getDefenceType());



    }
    public static Hero  [] createHeroes(){
        Hero physicHero = new Hero(350,20,"physycal");
        Hero magicHero = new Hero(300,10,"magical");
        Hero kineticHero = new Hero(300,25,"kinetic");

        Hero heroes[] = new Hero[] {physicHero,magicHero,kineticHero};
        return heroes;
    }
}