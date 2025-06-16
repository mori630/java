package curriculum_1_33;

public class Vehicle {
	//問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	private String owner;

	public String getOwner() { //問題3 getOwnerを定義
		return this.owner;
	}

	public void setOwner(String owner) { //問題3 setOwnerを定義
		this.owner = owner;
	}
}
