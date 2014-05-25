package game.model;

import java.util.HashMap;

public class Character {

	//Basic Characteristics
	private String name;
	
	private static int currentID; //ID to increment between characters
	private int ID;  //Unique ID for this character
	private int health,  //Current health 
		healthMax, //Maximum health
		energy, // current energy
		energyMax, //max energy (may be modified)
		attackStat, //current base attack power
		defenseStat, //current base defense power
		intellectStat, //current base intellect
		willpowerStat, //current base willpower
		speedStat, //current base speed
		enduranceStat, //current base endurance
		experience, //current experience
		level; //current level
	
	//Which professions are currently selected for skills
	private Profession professionMain, professionSecondary;
	//Currently selected reactive ability
	private Ability reactive;
	//Currently selected set of passive abilities
	private Ability[] passive = new Ability[3];
	//Current profession levels
	private HashMap<Profession,Integer> professionLevels = new HashMap<Profession,Integer>();
	//Current profession experience
	private HashMap<Profession,Integer> professionExperience = new HashMap<Profession,Integer>();
	
}