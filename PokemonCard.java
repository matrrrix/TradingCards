
public class PokemonCard extends GamingCard {
	private String type;
	private int pokedex;
	private String ability;
	public PokemonCard(String userName, String userImage, String userCategory, String userGame, String userType,
			int userPokedex, String userAbility) {
		super(userName, userImage, userCategory, userGame);
		
		type = userType;
		pokedex = userPokedex;
		ability = userAbility;
	}
	
	public void setType(String inputType) {
		type = inputType;
	}
	
	public void setPokedex(int inputPokedex) {
		pokedex = inputPokedex;
	}
	
	public void setAbility(String inputAbility) {
		ability = inputAbility;
	}
	
	public String getType() {
		return type;
	}

	public int getPokedex() {
		return pokedex;
	}
	
	public String getAbility() {
		return ability;
	}
	
	public String toString() {
		return name + ": " + game + " character, " + pokedex + ", a " + type + "-type with " + ability + " ability.";
	}
	
}
