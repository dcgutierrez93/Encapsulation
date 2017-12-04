// Encapsulaiton: Restrict access to some of the classes in your project.
public class Main {
    public static void main(String[] args) {
//         Player player = new Player();
//         // Initializing Player.
//         player.fullName = "David";
//         player.health = 20;
//         player.weapon = "Sword";
//
//         int damage = 10;
//         player.loseHealth(damage);
//         System.out.println("Remaining health = " + player.healthRemaining());
//
//         damage = 11;
//         // access in ways you don't want it to (Encapsulaiton)
//         player.health = 200;
//         player.loseHealth(damage);
//         System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("David", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
     }
}
