package curriculam_1_29_main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import curriculam_1_29_prosess.Prefectures;//curriculam_1_29_prosess というパッケージにある Prefectures クラスを使います

public class Main {
	public static void main(String[] args) {

		//都道府県リスト作成
		List<Prefectures> prefectures = List.of(
				new Prefectures("北海道", "札幌市", 83424),
				new Prefectures("青森県", "青森市", 9646),
				new Prefectures("岩手県", "盛岡市", 15275),
				new Prefectures("宮城県", "仙台市", 7282),
				new Prefectures("秋田県", "秋田市", 11638),
				new Prefectures("山形県", "山形市", 9323),
				new Prefectures("福島県", "福島市", 13784),
				new Prefectures("茨城県", "水戸市", 6097),
				new Prefectures("栃木県", "宇都宮市", 6408),
				new Prefectures("群馬県", "前橋市", 6362),
				new Prefectures("埼玉県", "さいたま市", 3798));

		//入力受付準備
		Scanner scanner = new Scanner(System.in);

		//ユーザーに複数の番号をカンマ区切りで入力してもらう
		System.out.println("番号をカンマ区切りで入力してください");

		String input = scanner.nextLine();
		if (input == null || input.trim().isEmpty()) { //null check
			System.out.println("入力が空です。プログラムを終了します");
			scanner.close();
			return;
		}
		String[] indexStrings = input.split(",");

		//trim()で入力の前後の空白を消去
		//toLowerCase()で入力を小文字に変換
		System.out.println("並び順を入力してください(asc/desc)");

		String sortOrder = scanner.nextLine().trim().toLowerCase();
		if (!sortOrder.equals("asc") && !sortOrder.equals("desc")) { //null check
			System.out.println("並び順は'asc'または'desc'を入力してください。");
			scanner.close();
			return;
		}
		//入力で選ばれたと都道府県のリストを入れるための変数selectedを作成
		List<Prefectures> selected = new ArrayList<>();

		//入力された番号から都道府県リストを作成
		for (String indexStr : indexStrings) {
			int index = Integer.parseInt(indexStr.trim());
			if (index >= 0 && index < prefectures.size()) { //index < prefectures.size()→ index が prefectures リストの要素数より小さいか
				selected.add(prefectures.get(index));
			} else {
				System.out.println("無効な番号 :" + index);
			}
		}

		//昇順、降順に応じたソート

		//Prefectures::getAreaはPrefecturesクラスのgetArea() メソッドを使う意
		Comparator<Prefectures> comparator = Comparator.comparingDouble(Prefectures::getArea);
		if (sortOrder.equals("desc")) { //descと入力した場合は、（降順）に変更
			comparator = comparator.reversed();
		}
		selected.sort(comparator);

		System.out.println("\n--- ソート結果 ---\n");
		for (Prefectures p : selected) {
			p.printInfo();
		}
		scanner.close();
	}
}
