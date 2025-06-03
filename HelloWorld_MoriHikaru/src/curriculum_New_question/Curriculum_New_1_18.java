package curriculum_New_question;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello() {
		String msg = "Hello JavaSE";
		int num = 11;
		System.out.println(msg + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void wa(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void array(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void decimaru(double a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] generaterRandomNum(int count) {

		java.util.Random rand = new java.util.Random();
		int[] number = new int[count];

		for (int i = 0; i < count; i++) {
			int randomNum = rand.nextInt(100) + 1;
			number[i] = randomNum;
			System.out.println(number[i]);
		}
		return number;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double printAvg(int[] i) {

		int sum = 0;
		for (int n : i) {
			sum += n;
		}
		double avg = (double) sum / i.length;
		System.out.println(avg);

		return (double) sum / i.length;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isAvg50(double avg) {

		boolean result = avg >= 50;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		hello();
		wa(6, 3);
		array(new int[] { 1, 2, 3, 4, });
		decimaru(6.1, 6.2);
		int[] num = generaterRandomNum(5);
		double avg = printAvg(num);
		isAvg50(avg);
	}
}
