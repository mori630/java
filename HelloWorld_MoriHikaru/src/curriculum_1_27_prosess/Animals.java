package curriculum_1_27_prosess;

//スーパークラス
public class Animals {
	private String name;
	private double height;
	private int speed;
	private String latinName;

	public Animals(String name, double height, int speed) {
		this.name = name; //動物名
		this.height = height; //体長
		this.speed = speed; //速度
		this.latinName = latinName(name);//学名
	}

	protected String latinName(String name) {
		return "不明";
	}

	public void display() {
		System.out.println("動物名 : " + name);
		System.out.println("体長   : " + height + "m");
		System.out.println("速度   : " + speed + "km/h");
		System.out.println("学名   : " + latinName);
	}
}
