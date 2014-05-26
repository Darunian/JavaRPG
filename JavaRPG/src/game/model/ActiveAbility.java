/**
 * 
 */
package game.model;

/**
 * @author Michael
 *
 */
public class ActiveAbility extends Ability {

	private Character source;
	
	public ActiveAbility() {
		super();
		this.source = null;
	}
	public ActiveAbility(String name, Profession profession, int cost, int levelRequirement, Character souce) {
		super(name,profession,cost,levelRequirement);
		this.source = source;
	}
}
