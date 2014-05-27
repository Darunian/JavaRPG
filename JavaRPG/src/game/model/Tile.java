package game.model;
/**

Class for Tiles 

* Tile Height, Tile Obstruction Status, Tile Character Occupation Status
*  --Environment Effects?

 */
public class Tile {

	private int height;
	private boolean obstructed;
	private Character occupant;
	
	
	/*
	 * Default Constructor  
	 */
	public Tile() {
		this.height = 0;
		this.obstructed = false;
		this.occupant = null;
	}
	
	/*
	 * Constructor for Tile 
	 * takes values for tile height, obstruction status, and occupation status
	 * 
	 */
	public Tile(int height, Character occupant) {
		this.height = height;
			if(height == -1){
				this.obstructed = true;
			}
			else{
				this.obstructed = false;
			}
		this.occupant = occupant;
	}
	
	//Getters
	
	/*
	 * @return the height of the tile
	 */
	public int getHeight() {
		return height;
	}
	
	/*
	 * @return the obstruction status of the tile
	 */
	public boolean getObstructionStatus() {
		return obstructed;
	}
	
	/*
	 * @return the Occupation status of the tile
	 */
	public Character getOccupant() {
		return occupant;
	}
	
	//Setters
	
	/*
	 * @param height - sets the tile height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/*
	 * @param obstruct - sets the tile's obstructed status
	 */
	public void setObstructionStatus(boolean obstruct) {
		this.obstructed = obstruct;
	}
	
	/*
	 * @param occupant - sets the tile's occupant status
	 */
	public void setOccupant(Character occupant) {
		this.occupant = occupant;
	}
	
	
	/*
	 * Method - checks if Tile is Occupied by a Character or not
	 * @return whether or not the Tile is occupied
	 */
	public boolean findTileOccupationStatus(){
		if (occupant != null){
			return true;
		}
		else return false;
	}

	
	
}
