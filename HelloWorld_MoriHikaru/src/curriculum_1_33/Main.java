package curriculum_1_33;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		/*問題4 Carクラスのインスタンスcarの所有者をperson1
		Personクラスのインスタンスからフルネームを取得し、ownerにセット*/
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());//bicycleの所有者をperson2

		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		System.out.println("合計" + Person.count + "人です");

		Person.printCount();

		//問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
		person1.buy(car);
		person2.buy(bicycle);
	}
}
