package curriculum_1_30_self_introduction;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // 問題4

	}

	//BMIを計算して返すメソッド
	public double bmi() {
		return weight / (height * height);
	}

	//情報を表示するメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("合計%.2f です\n ", this.bmi()); //問題4
	}
}
