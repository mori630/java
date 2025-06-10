package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sushi {
	private String greeting;
	private String taste;
	private String category;
	private String now;

	public Sushi() {
		this.greeting = "こんにちは！ここは日本です！";
		this.taste = "この寿司はうまい";
		this.category = "寿司は和食です";

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.now = now.format(formatter);
	}

	public void printMessage() {
		System.out.println(this.greeting);
		System.out.println(this.taste);
		System.out.println(this.category);
		System.out.println(now);
	}
}
