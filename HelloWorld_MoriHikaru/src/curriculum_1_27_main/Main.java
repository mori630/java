package curriculum_1_27_main;

import java.util.Scanner;

import curriculum_1_27_prosess.SubAnimals;//SubAnimalsのサブクラスを使用

public class Main {
	public static void main(String[] args) {

		//入力例(ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50)
		Scanner scanner = new Scanner(System.in);
		String input;

		while (true) {
			System.out.println("文字を入力してください");
			input = scanner.nextLine();

			//null check
			if (input == null || input.trim().isEmpty()) {
				System.out.println("入力が空です。もう一度入力してください");
				continue;
			}

			//終了処理
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("終了します。");
				break;
			}

			//処理
			String[] entries = input.split(",");//各動物のデータをコンマで分割

			for (String entry : entries) {
				String[] parts = entry.split(":");//各動物のデータをコロンで分割
				if (parts.length != 3) {
					System.out.println("正しく入力してください");
					continue;
				}

				try {
					String name = parts[0]; //動物名
					double length = Double.parseDouble(parts[1]);//体長
					int speed = Integer.parseInt(parts[2]); //速度

					SubAnimals animals = new SubAnimals(name, length, speed);
					System.out.println("----- 動物の情報 -----");
					animals.display();
					System.out.println("----------------------");
				} catch (NumberFormatException e) {
					System.out.println("数値の形式が正しくありません" + entry);
				}
			}
		}
		scanner.close();
	}
}
