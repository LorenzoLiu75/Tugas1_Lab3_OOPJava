public class PlayerApp {
    public static void main(String[] args) {
        Player player1 = new Player("Anton", "Light Sword", 10, 10000, 20);

        Player player2 = new Player("Riku", "Sacred Bow");
        player2.setLevel(5);
        player2.setExp(7000);
        player2.setSkill(15);

        player1.showInfo();
        System.out.println("\n");
        player2.showInfo();
        System.out.println("\n");

        Enemy enemy1 = new Enemy("Kraus", "sword n shield", 15, 5000, 10);
        enemy1.showInfo();
        System.out.println("\n");

        int newLvl = player1.levelUp(player1.getLevel(), player1.getExp());
        player1.showInfo();
    }
}
