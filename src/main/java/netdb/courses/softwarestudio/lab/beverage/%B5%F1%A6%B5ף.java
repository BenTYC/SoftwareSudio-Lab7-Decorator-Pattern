package netdb.courses.softwarestudio.lab.beverage;

public class 椰果 extends 料 {

	public 椰果(飲料 之前的飲料) {
		this.之前的飲料 = 之前的飲料;
	}

	@Override
	public int 價格() {
		return 之前的飲料.價格() + 5;
	}

	@Override
	public String 名稱() {
		return "椰果" + 之前的飲料.名稱();
	}

}
