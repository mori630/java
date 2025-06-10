package curriculum_1_25_prosess;

//スーパークラス！！
public class Character {

	private String name;
	private int hp; //体力
	private int mp; //魔力
	private int pw; //攻撃力
	private int spd; //素早さ
	private int dp; //防御力

	public Character(String name) {
		this.name = name;
		this.hp = getRandomStat();
		this.mp = getRandomStat();
		this.pw = getRandomStat();
		this.spd = getRandomStat();
		this.dp = getRandomStat();
	}

	//ランダムなステータス数値を手に入れる
	protected int getRandomStat() {
		return (int) (Math.random() * 1000);
	}

	//getter 
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getPw() {
		return pw;
	}

	public int getSpd() {
		return spd;
	}

	public int getDp() {
		return dp;
	}

	//setter
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}

	public void setName(String name) {
		this.name = name;
	}
}
