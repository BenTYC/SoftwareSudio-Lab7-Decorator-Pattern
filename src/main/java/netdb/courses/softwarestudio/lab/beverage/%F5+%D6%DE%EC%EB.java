package netdb.courses.softwarestudio.lab.beverage;

public class 仙草 extends 料 {

	public 仙草(飲料 之前的飲料) {
		this.之前的飲料 = 之前的飲料;
	}

	@Override
	public int 價格() {
		return 之前的飲料.價格() + 5;
	}

	@Override
	public String 名稱() {
		return "仙草" + 之前的飲料.名稱();
	}

}
