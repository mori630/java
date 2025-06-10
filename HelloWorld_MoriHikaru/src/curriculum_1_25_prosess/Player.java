package curriculum_1_25_prosess;

public class Player extends Character {

	//サブクラス
	public Player(String name) {
		super(name); //Characterクラスのコントラクタを呼ぶ
	}

	public void displayStatus() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP :     " + getHp());
		System.out.println("MP :     " + getMp());
		System.out.println("攻撃力 : " + getPw());
		System.out.println("素早さ : " + getSpd());
		System.out.println("防御力 : " + getDp());
		System.out.println("さあ冒険に出かけよう!!");
	}
}
