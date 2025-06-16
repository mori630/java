package curriculam_1_29_prosess;

//インスタンスフィールドを定義
public class Prefectures {
	private String name;
	private String capital;
	private double area;

	//コンストラクタを定義
	public Prefectures(String name, String capital, double area) {
		this.name = name; // 引数 name をフィールドnameに代入
		this.capital = capital; // 引数 capital をフィールドcapitalに代入
		this.area = area; // 引数 area をフィールドareaに代入
	}

	//ゲッターメソッド
	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	//Prefectures クラスの情報を画面に表示するためのメソッド
	public void printInfo() {
		System.out.println("都道府県 :" + name);
		System.out.println("県庁所在地 :" + capital);
		System.out.println("面積 :" + area + "km2");
	}
}
