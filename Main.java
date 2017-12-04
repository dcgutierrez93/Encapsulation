// Encapsulaiton: Restrict access to some of the classes in your project.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "David";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
