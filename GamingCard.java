
public class GamingCard extends TradingCard {
	protected String category;
	protected String game;
	
	public GamingCard(String userName, String userImage, String userCategory, String userGame) {
		super(userName, userImage);
	
		category = userCategory;
		game = userGame;
	}

	public String getCategory() {
		return category;
	}
	
	public String getGame() {
		return game;
	}
	
	@Override
	public String toString() {
		return name + ": " + game + " character"; 
	}
}
