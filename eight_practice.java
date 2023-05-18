// 聖職者
public class Cleric {
    // フィールド（属性）
    String name;
    int hp=50;
    int mp=10;
    final int MAX_HP=50;
    final int MAX_MP=10;
    // メソッド（行動）
    public void selfAid(){
        this.mp = this.mp-5;
        this.hp = this.MAX_HP;
    }
    public int pray(int sec){
        int recover = new Random().nextInt(3) + sec;
        int recoverActual = Math.min(this.MAX_MP - this.mp,recover);
        this.mp += recoverActual;
        return recoverActual;
    }
}