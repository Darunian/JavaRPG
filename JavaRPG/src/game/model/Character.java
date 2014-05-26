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
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the currentID
	 */
	public static int getCurrentID() {
		return currentID;
	}
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @return the healthMax
	 */
	public int getHealthMax() {
		return healthMax;
	}
	/**
	 * @return the energy
	 */
	public int getEnergy() {
		return energy;
	}
	/**
	 * @return the energyMax
	 */
	public int getEnergyMax() {
		return energyMax;
	}
	/**
	 * @return the attackStat
	 */
	public int getAttackStat() {
		return attackStat;
	}
	/**
	 * @return the defenseStat
	 */
	public int getDefenseStat() {
		return defenseStat;
	}
	/**
	 * @return the intellectStat
	 */
	public int getIntellectStat() {
		return intellectStat;
	}
	/**
	 * @return the willpowerStat
	 */
	public int getWillpowerStat() {
		return willpowerStat;
	}
	/**
	 * @return the speedStat
	 */
	public int getSpeedStat() {
		return speedStat;
	}
	/**
	 * @return the enduranceStat
	 */
	public int getEnduranceStat() {
		return enduranceStat;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @return the professionMain
	 */
	public Profession getProfessionMain() {
		return professionMain;
	}
	/**
	 * @return the professionSecondary
	 */
	public Profession getProfessionSecondary() {
		return professionSecondary;
	}
	/**
	 * @return the reactive
	 */
	public Ability getReactive() {
		return reactive;
	}
	/**
	 * @return the passive
	 */
	public Ability[] getPassive() {
		return passive;
	}
	/**
	 * @return the professionLevels
	 */
	public HashMap<Profession, Integer> getProfessionLevels() {
		return professionLevels;
	}
	/**
	 * @return the professionExperience
	 */
	public HashMap<Profession, Integer> getProfessionExperience() {
		return professionExperience;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param currentID the currentID to set
	 */
	public static void setCurrentID(int currentID) {
		Character.currentID = currentID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * @param healthMax the healthMax to set
	 */
	public void setHealthMax(int healthMax) {
		this.healthMax = healthMax;
	}
	/**
	 * @param energy the energy to set
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	/**
	 * @param energyMax the energyMax to set
	 */
	public void setEnergyMax(int energyMax) {
		this.energyMax = energyMax;
	}
	/**
	 * @param attackStat the attackStat to set
	 */
	public void setAttackStat(int attackStat) {
		this.attackStat = attackStat;
	}
	/**
	 * @param defenseStat the defenseStat to set
	 */
	public void setDefenseStat(int defenseStat) {
		this.defenseStat = defenseStat;
	}
	/**
	 * @param intellectStat the intellectStat to set
	 */
	public void setIntellectStat(int intellectStat) {
		this.intellectStat = intellectStat;
	}
	/**
	 * @param willpowerStat the willpowerStat to set
	 */
	public void setWillpowerStat(int willpowerStat) {
		this.willpowerStat = willpowerStat;
	}
	/**
	 * @param speedStat the speedStat to set
	 */
	public void setSpeedStat(int speedStat) {
		this.speedStat = speedStat;
	}
	/**
	 * @param enduranceStat the enduranceStat to set
	 */
	public void setEnduranceStat(int enduranceStat) {
		this.enduranceStat = enduranceStat;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @param professionMain the professionMain to set
	 */
	public void setProfessionMain(Profession professionMain) {
		this.professionMain = professionMain;
	}
	/**
	 * @param professionSecondary the professionSecondary to set
	 */
	public void setProfessionSecondary(Profession professionSecondary) {
		this.professionSecondary = professionSecondary;
	}
	/**
	 * @param reactive the reactive to set
	 */
	public void setReactive(Ability reactive) {
		this.reactive = reactive;
	}
	/**
	 * @param passive the passive to set
	 */
	public void setPassive(Ability[] passive) {
		this.passive = passive;
	}
	/**
	 * @param professionLevels the professionLevels to set
	 */
	public void setProfessionLevels(HashMap<Profession, Integer> professionLevels) {
		this.professionLevels = professionLevels;
	}
	/**
	 * @param professionExperience the professionExperience to set
	 */
	public void setProfessionExperience(
			HashMap<Profession, Integer> professionExperience) {
		this.professionExperience = professionExperience;
	}
	
}