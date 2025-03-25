package main;

import logic.Person;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 自己紹介を表示
		person1.print();

		// 人数の合計を表示
		System.out.println("合計" + Person.count + "人です。");
	}
}