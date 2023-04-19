import java.util.Scanner;

public class Player {
    private String nama, senjata;
    private int level, exp, skill;

    // contructor awal
    public Player(String nama, String senjata, int level, int exp, int skill) {
        this.nama = nama;
        this.senjata = senjata;
        this.level = level;
        this.exp = exp;
        this.skill = skill;
    }

    // contructor overloading
    public Player(String nama, String senjata) {
        this(nama, senjata, 0, 0, 0);
    }

    public Player(String nama) {
        this(nama, null, 0, 0, 0);
    }

    // method void untuk menampikan info player
    public void showInfo() {
        System.out.println("Nama player: " + this.nama);
        System.out.println("Senjata: " + this.senjata);
        System.out.println("Level player: " + this.level);
        System.out.println("Exp : " + this.exp + " poin");
        System.out.println("Poin skill: " + this.skill + " poin");
    }

    // non-void method yang akan mengembalikan nilai berupa int
    public int levelUp(int level, int exp){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Apakah anda ingin menaikkan level anda? (y/n)");
        String ans = scanner.nextLine();

        switch (ans) {
            case "y":
                if (this.exp >= 2000) {
                    System.out.println("Selamat anda naik level!");
                    this.level++;
                    this.exp -= 2000;
                } else System.out.println("Exp anda saat ini tidak cukup untuk menaikkan level! Silahkan naikkan exp anda terlebih dahulu.");
                break;
            case "n":
                System.out.println("Silahkan datang kembali jika ingin meningkatkan level anda.");
                break;
        }

        return this.level;
    }

    // getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
