public class Enemy extends Player{

    public Enemy(String nama, String senjata, int level, int exp, int skill) {
        super(nama, senjata, level, exp, skill);
    }

    public Enemy(String nama, String senjata) {
        super(nama, senjata);
    }

    public Enemy(String nama){
        super(nama);
    };

    // mengoverride method showInfo dari class Player untuk menampilkan
    // info dari class Enemy
    public void showInfo() {
        System.out.println("Nama enemy: " + super.getNama());
        System.out.println("Senjata: " + super.getSenjata());
        System.out.println("Level enemy: " + super.getLevel());
        System.out.println("Exp : " + super.getExp() + " poin");
        System.out.println("Poin skill: " + super.getSkill() + " poin");
    }
}
