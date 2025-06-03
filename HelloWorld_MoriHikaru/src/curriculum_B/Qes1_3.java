package curriculum_B;

import java.util.Random;
import java.util.Scanner; //JavaにScannerを使うと宣言

public class Qes1_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //入力をできるようにする
		Random random = new Random();

		/**********************************************************************************	
		1 ログイン時の入力チェックシステムを下記条件で作成してください・コンソールにユーザー名を入力できるようにしてください
		・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		・ユーザー名が正常な値だった場合「ユーザー名「入力したユーザー名」を登録しました」
		と出力してください
		-------------------------------------------------------------------------*/
		String name = scanner.nextLine(); //名前を入力できるようにする
		String regex = "^[a-zA-Z0-9]+$"; //半角英数字のみ受け付ける

		if (name.length() > 10) { //lengthを使い文字列の長さを整数にする
			System.out.println("名前を10文字以内にしてください");
		} else if (name == null || name.isEmpty()) { //空白の場合、「名前を入力してください」と表示
			System.out.println("名前を入力してください");

			/**********************************************************************************
			2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」
			と出力してください
			-------------------------------------------------------------------------*/

		} else if (!name.matches(regex)) {
			System.out.println("名前は半角英数字のみで入力してください");
		} else {
			System.out.println("ユーザー名「" + name + "」を登録しました"); //ユーザー名が正常な値なら表示

			/**********************************************************************************
			3 じゃんけんのシステムを下記の条件で作成してください・「0 はグー、1：チョキ、2：パー」とすること・じゃんけんに勝つまでループすること・
			一回ごとに自分の手と相手の手を下記の通り出力してください ユーザー名「name」
			を登録しました nameの手は「パー」相手の手は「グー」
			
			・条件分岐の設定・自分がじゃんけんに勝った場合、
			下記が出力されるようにしてください やるやん。次は俺にリベンジさせて
			
			・自分がじゃんけんでグーに負けた場合、
			下記が出力されるようにしてください 俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！
			
			・自分がじゃんけんでチョキに負けた場合、
			下記が出力されるようにしてください 俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ
			
			・自分がじゃんけんでパーに負けた場合、
			下記が出力されるようにしてください 俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです
			
			・あいこの場合、
			下記が出力されるようにしてください DRAW
			あいこ もう一回しましょう！
			
			じゃんけんを行った回数を表示してください 勝つまでにかかった合計回数は1回です
			
			ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
			
			下記見本（青字が入力した値）
				-------------------------------------------------------------------------*/
			String[] hand = { "グー", "チョキ", "パー" };
			int count = 0;

			while (true) {
				int playerHand = scanner.nextInt(); //playerの手
				int cpuHand = random.nextInt(3); ////cpuの手
				count++;
				System.out.println(name + "の手は" + hand[playerHand]);
				System.out.println("cpuの手は" + hand[cpuHand]);

				//勝敗の結果

				//playerが勝った場合
				if ((playerHand == 0 && cpuHand == 1) || (playerHand == 1 && cpuHand == 2)
						|| (playerHand == 2 && cpuHand == 0)) {
					System.out.println("やるやん");
					System.out.println("次は俺にリベンジさせて");
					break; //playerが勝ったのでループ終了

					//自分がグーに負けたとき
				} else if (playerHand == 1 && cpuHand == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
					//自分がチョキに負けたとき
				} else if (playerHand == 2 && cpuHand == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
					//自分がパーに負けたとき
				} else if (playerHand == 0 && cpuHand == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("何で負けたか、明日までに考えといてください");
					System.out.println("そしたら何かが見えてくるはずです");
					//あいこの場合
				} else {
					System.out.println("DRAW あいこ もう一回しましょう！");
				}
			}
			//player勝利後に回数を表示
			System.out.println("勝つまでにかかった回数は" + count + "です");

			scanner.close();
		}
	}
}
