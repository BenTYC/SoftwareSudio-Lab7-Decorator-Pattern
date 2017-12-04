package netdb.courses.softwarestudio.lab.main;

import netdb.courses.softwarestudio.lab.beverage.仙草;
import netdb.courses.softwarestudio.lab.beverage.珍珠;
import netdb.courses.softwarestudio.lab.beverage.紅茶;
import netdb.courses.softwarestudio.lab.beverage.飲料;

public class App {
	public static void main(String[] args) throws Exception {

		飲料 一杯加料紅茶 = new 珍珠(new 仙草(new 紅茶()));

		System.out.println(一杯加料紅茶.名稱() + " : " + 一杯加料紅茶.價格());

	}
}
