package netdb.courses.softwarestudio.lab.beverage;

public class 珍珠 extends 料 {

	public 珍珠(飲料 之前的飲料) {
		this.之前的飲料 = 之前的飲料;
	}

	@Override
	public int 價格() {
		return 之前的飲料.價格() + 5;
	}

	@Override
	public String 名稱() {
		return "珍珠" + 之前的飲料.名稱();
	}

}
