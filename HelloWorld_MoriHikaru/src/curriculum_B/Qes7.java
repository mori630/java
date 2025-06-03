package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/**********************************************************************************
		
		7 N人の生徒の成績を管理するプログラムを下記条件で作成してください・
		N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください・このプログラムの実行は必ず1回以上行われるようにしてください・
		出力例を参考にプログラミングを作成してください
		
		入力・
		出力例 生徒の人数を入力してください（2 以上）:2 1 人目の『英語』の点数を入力してください:10 1 人目の『数学』の点数を入力してください:10 1 人目の『理科』の点数を入力してください:10 1 人目の『社会』の点数を入力してください:10
		
		2 人目の『英語』の点数を入力してください:10 2 人目の『数学』の点数を入力してください:10 2 人目の『理科』の点数を入力してください:10 2 人目の『社会』の点数を入力してください:10
		
		1 人目の平均点は10.00点です。2 人目の平均点は10.00点です。
		
		英語の平均点は10.00点です。数学の平均点は10.00点です。理科の平均点は10.00点です。社会の平均点は10.00点です。全体の平均点は10.00点です。
		
		下記見本（青字が入力した値）
			-----------------------------------------------------------*/
		System.out.println("生徒の人数を入力してください");
		int ninzu = scanner.nextInt();

		int totalEnglish = 0;
		int totalMath = 0;
		int totalScience = 0;
		int totalSocial = 0;

		double[] studentAvg = new double[ninzu];

		for (int i = 0; i < ninzu; i++) {

			System.out.println((i + 1) + "人目の英語の点数を入力してください");
			int english = scanner.nextInt();

			System.out.println((i + 1) + "人目の数学の点数を入力してください");
			int math = scanner.nextInt();

			System.out.println((i + 1) + "人目の理科の点数を入力してください");
			int science = scanner.nextInt();

			System.out.println((i + 1) + "人目の社会の点数を入力してください");
			int social = scanner.nextInt();

			int sum = english + math + science + social;
			double avg = sum / 4.0;
			studentAvg[i] = avg;

			totalEnglish += english;
			totalMath += math;
			totalScience += science;
			totalSocial += social;
		}
		// 各生徒の平均点をまとめて出力
		System.out.println("\n--- 各生徒の平均点 ---");
		for (int i = 0; i < ninzu; i++) {
			System.out.println((i + 1) + "人目の平均点は " + studentAvg[i] + " 点です");
		}

		int totalAll = totalEnglish + totalMath + totalScience + totalSocial;
		double totalAvg = totalAll / (4.0 * ninzu);

		double avgEnglish = (double) totalEnglish / ninzu;
		double avgMath = (double) totalMath / ninzu;
		double avgScience = (double) totalScience / ninzu;
		double avgSocial = (double) totalSocial / ninzu;

		System.out.println();
		System.out.printf("英語の平均点は%.2f点です。\n", avgEnglish);
		System.out.printf("数学の平均点は%.2f点です。\n", avgMath);
		System.out.printf("理科の平均点は%.2f点です。\n", avgScience);
		System.out.printf("社会の平均点は%.2f点です。\n", avgSocial);
		System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);
	}
}