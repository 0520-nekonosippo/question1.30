package logic;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double heigth;
	private double weight;

	// 人数を数えるコード
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double heigth, double weight) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weight = weight;
		count++;
	}

	// getterを作成
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeigh() {
		return this.heigth;
	}

	public double getWeight() {
		return this.weight;
	}

	// BMIを計算するメソッド
	public double bmi() {
		return this.weight / (this.heigth * this.heigth);
	}

	// 自己紹介を表示するメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "歳です。");
		System.out.printf("BMIは%.1fです。\n", this.bmi());
	}
}
