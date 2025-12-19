public class Main{
    public static void main(String[] args){
        //インスタンス生成
        Hero h1 = new Hero("Minato",100,20);
        Matango m1 = new Matango(50, 'A');
        PoisonMatango p1 = new PoisonMatango(100, 'B');
        //メソッド呼び出し
        h1.attack();
        m1.run();
        m1.attack();
        p1.attack();
        p1.run();
    }
}

class Hero{
    //フィールド
    String name;
    int hp;
    int attack;

    //コンストラクタ
    Hero(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    
    //メソッド
    void attack(){
        System.out.println(this.name + "は攻撃した！ ダメージ:" + this.attack);
    }
}

class Matango{
    int hp;
    char suffix;

    Matango(int hp, char suffix){
        this.hp = hp;
        this.suffix = suffix;
    }

    void run(){
        System.out.println("お化けキノコ"+this.suffix+"は逃げ出した！");
    }

    void attack() {
        System.out.println("お化けキノコ" + this.suffix + "の攻撃！");
    }
}

class PoisonMatango extends Matango{

    PoisonMatango(int hp, char suffix){
        super(hp, suffix);
    }

    @Override
    void attack(){
        System.out.println("お化けキノコ" + this.suffix + "は毒を吐いた！");
    }
}