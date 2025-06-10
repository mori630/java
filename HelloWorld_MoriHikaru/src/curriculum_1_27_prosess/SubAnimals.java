package curriculum_1_27_prosess;

public class SubAnimals extends Animals {

	//サブクラス
	public SubAnimals(String name, double length, int speed) {
		super(name, length, speed);
	}

	//Animalsからオーバーライド
	protected String latinName(String name) {
		switch (name) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディクス";
		case "シマウマ":
			return "チャップマンシマウマ";
		case "インコ":
			return "不明";
		default:
			return super.latinName(name);
		}
	}
}
