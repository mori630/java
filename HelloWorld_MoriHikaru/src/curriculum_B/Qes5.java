package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {

		/**********************************************************************************
		5,for文を使用して下記の通りに出力してください
		
		下記が見本
			-------------------------------------------------------------------------*/
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 21; j++) {
				//printfを使い整える
				//%03dで幅3文字で表示
				System.out.printf("%03d * %03d = %03d" + "||", j, i, i * j);
			}
			System.out.println(); //行ごとに改行し整える
		}
	}
}
