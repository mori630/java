package curriculum_1_30_self_introduction;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;

	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // 問題4

		count++;//人数カウント
	}

	//BMIを計算して返すメソッド
	public double bmi() {
		return 20.0;
	}

	//情報を表示するメソッド
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println();

		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です"); //問題4
		System.out.println();

		System.out.println("合計" + count + "人です");
	}
}
