package curriculum_1_23;

public class User { //動物の情報
	/*
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 */
	private String name;
	private double height;
	private int speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) { //null check
			this.name = name;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	public void printinfo() {
		System.out.println("動物名:" + getName());
		System.out.println("体長:" + getHeight() + "m");
		System.out.println("速度:" + getSpeed() + "km/h");
	}
}
