
public class Mutant extends Undead{
	
	
	protected boolean armor;
	protected String rank;
	protected float height;
	
	
	
	
	public Mutant(String name) {
		super(name);
		this.armor = true;
	}
	
	public Mutant(String name, int age, char gender, float weight, boolean fur) {
		super(name, age, gender, weight);
		this.armor = armor;
	}

	public boolean isArmor() {
		return armor;
	}

	public void setArmor(boolean armor) {
		this.armor = armor;
	}
	
	

	@Override
	public void takeDamageBear(){
		System.out.println("The Bear's Health is " + bearHealth);
		System.out.println("Bear takes damage");
		bearHealth = bearHealth - 250;
		System.out.println("The Bear's health is now " + bearHealth);
		System.out.println();
	}
	public void takeDamageGhost(){
		System.out.println("The ghost's Health is " + ghostHealth);
		System.out.println("ghost takes damage");
		ghostHealth = ghostHealth - 250;
		System.out.println("The ghost's health is now " + ghostHealth);
		System.out.println();
	}
	public void takeDamageKnight(){
		System.out.println("The knight's Health is " + knightHealth);
		System.out.println("knight takes damage");
		knightHealth = knightHealth - 250;
		System.out.println("The knight's health is now " + knightHealth);
		System.out.println();
	}
	public void takeDamageMutant(){
		System.out.println("The mutant's Health is " + mutantHealth);
		System.out.println("mutant takes damage");
		mutantHealth = mutantHealth - 250;
		System.out.println("The mutant's health is now " + mutantHealth);
		System.out.println();
	}
	public void takeDamagePlayer(){
		System.out.println("Your Health is " + playerHealth);
		System.out.println("You take damage");
		playerHealth = playerHealth - 250;
		System.out.println("Your health is now " + playerHealth);
		System.out.println();
	}
	public void takeDamageTrooper(){
		System.out.println("The Trooper's Health is " + trooperHealth);
		System.out.println("trooper takes damage");
		trooperHealth = trooperHealth - 250;
		System.out.println("The trooper's health is now " + trooperHealth);
		System.out.println();
	}
	public void takeDamageWolf(){
		System.out.println("The wolf's Health is " + wolfHealth);
		System.out.println("wolf takes damage");
		wolfHealth = wolfHealth - 250;
		System.out.println("The wolf's health is now " + wolfHealth);
		System.out.println();
	}
	
	public void giveHealthBear(){
		System.out.println("The Bear's Health is " + bearHealth);
		System.out.println("Bear gets health");
		bearHealth = bearHealth + 250;
		System.out.println("The Bear's health is now " + bearHealth);
		System.out.println();
	}
	public void giveHealthGhost(){
		System.out.println("The ghost's Health is " + ghostHealth);
		System.out.println("ghost gets health");
		ghostHealth = ghostHealth + 250;
		System.out.println("The ghost health is now " + ghostHealth);
		System.out.println();
	}
	public void giveHealthKnight(){
		System.out.println("The knight's Health is " + knightHealth);
		System.out.println("Knight gets health");
		knightHealth = knightHealth + 250;
		System.out.println("The knight's health is now " + knightHealth);
		System.out.println();
	}
	public void giveHealthMutant(){
		System.out.println("The mutant's Health is " + mutantHealth);
		System.out.println("Mutant gets health");
		mutantHealth = mutantHealth + 250;
		System.out.println("The mutant's health is now " + mutantHealth);
		System.out.println();
	}
	public void giveHealthPlayer(){
		System.out.println("The player's Health is " + playerHealth);
		System.out.println("Player gets health");
		playerHealth = playerHealth + 250;
		System.out.println("The player's health is now " + playerHealth);
		System.out.println();
	}
	public void giveHealthTrooper(){
		System.out.println("The trooper's Health is " + trooperHealth);
		System.out.println("Trooper gets health");
		trooperHealth = trooperHealth + 250;
		System.out.println("The trooper's health is now " + trooperHealth);
		System.out.println();
	}
	public void giveHealthWolf(){
		System.out.println("The wolf's Health is " + wolfHealth);
		System.out.println("Wolf gets health");
		wolfHealth = wolfHealth + 250;
		System.out.println("The wolf's health is now " + wolfHealth);
		System.out.println();
	}
	
	public void damageGrenade(){
		System.out.println("The mutants Health is " + mutantHealth);
		System.out.println("The grenade hurts the mutant");
		mutantHealth = mutantHealth - 100;
		System.out.println("The mutants health is now " + mutantHealth);
		System.out.println();
	}
	public void damageFireball(){
		System.out.println("The mutants Health is " + mutantHealth);
		System.out.println("The fireball hurts the mutant");
		mutantHealth = mutantHealth - 75;
		System.out.println("The mutants health is now " + mutantHealth);
		System.out.println();
	}
	public void damageScratch(){
		System.out.println("The mutants Health is " + mutantHealth);
		System.out.println("The scratch hurts the mutant");
		mutantHealth = mutantHealth - 30;
		System.out.println("The mutants health is now " + mutantHealth);
		System.out.println();
	}
	public void damageStrike(){
		System.out.println("The mutants Health is " + mutantHealth);
		System.out.println("The Strike hurts the mutant");
		mutantHealth = mutantHealth - 130;
		System.out.println("The mutants health is now " + mutantHealth);
		System.out.println();
	}
	public void healPotion(){
		System.out.println("The mutants Health is " + mutantHealth);
		System.out.println("The potion heals the mutant");
		mutantHealth = mutantHealth + 100;
		System.out.println("The mutants health is now " + mutantHealth);
		System.out.println();
	}
	public void healCure(){
		System.out.println("The mutants Health is " + mutantHealth);
		System.out.println("The cure heals the mutant");
		mutantHealth = mutantHealth + 250;
		System.out.println("The mutants health is now " + mutantHealth);
		System.out.println();
	}

	@Override
	public void speak() {
		System.out.println("the mutant's health reduces");
		
	}

}
