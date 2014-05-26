package game.model;

public abstract class Ability {
	private String name;
	private Profession profession;
	private int cost;
	private int levelRequirement;

	public Ability() {
		this.name = null;
		this.profession = null;
		this.cost = 0;
		this.levelRequirement = 0;
	}
	
	public Ability(String name, Profession profession, int cost, int levelRequirement) {
		this.name = name;
		this.profession = profession;
		this.cost = cost;
		this.levelRequirement = levelRequirement;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the profession
	 */
	public Profession getProfession() {
		return profession;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @return the levelRequirement
	 */
	public int getLevelRequirement() {
		return levelRequirement;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @param levelRequirement the levelRequirement to set
	 */
	public void setLevelRequirement(int levelRequirement) {
		this.levelRequirement = levelRequirement;
	}


}