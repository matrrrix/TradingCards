
public class TradingCard {
	protected String name;
	protected String image;
	
	public TradingCard(String userName, String userImage) {
		name = userName;
		image = userImage;
	}

	public String getName() {
		return name;
	}
	
	public String getImg() {
		return image;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
