package curriculum_1_25_main;

import java.util.Scanner;

import curriculum_1_25_prosess.Player;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String name = scanner.nextLine(); //名前を入力

		Player player = new Player(name);
		player.displayStatus();

		scanner.close();
	}
}
