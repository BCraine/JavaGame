
public class Scratch extends Attack{
	

	protected boolean contact;
	
	public Scratch(String name) {
		super(name);
		this.contact = true;
		
	}
	
	public Scratch(String name, boolean notFake) {
		super(name);
		this.contact = contact;
	}
	
	public boolean iscontact() {
		return contact;
	}
	
	public void setcontact(boolean armor) {
		this.contact = contact;
	}

	@Override
	public void takeDamageBear(){
		System.out.println("The Bear's Health is " + bearHealth);
		System.out.println("Bear takes damage");
		bearHealth = bearHealth - 15;
		System.out.println("The Bear's health is now " + bearHealth);
		System.out.println();
	}
	public void takeDamageGhost(){
		System.out.println("The ghost's Health is " + ghostHealth);
		System.out.println("ghost takes damage");
		ghostHealth = ghostHealth - 15;
		System.out.println("The ghost's health is now " + ghostHealth);
		System.out.println();
	}
	public void takeDamageKnight(){
		System.out.println("The knight's Health is " + knightHealth);
		System.out.println("knight takes damage");
		knightHealth = knightHealth - 15;
		System.out.println("The knight's health is now " + knightHealth);
		System.out.println();
	}
	public void takeDamageMutant(){
		System.out.println("The mutant's Health is " + mutantHealth);
		System.out.println("mutant takes damage");
		mutantHealth = mutantHealth - 15;
		System.out.println("The mutant's health is now " + mutantHealth);
		System.out.println();
	}
	public void takeDamagePlayer(){
		System.out.println("Your Health is " + playerHealth);
		System.out.println("You take damage");
		playerHealth = playerHealth - 15;
		System.out.println("Your health is now " + playerHealth);
		System.out.println();
	}
	public void takeDamageTrooper(){
		System.out.println("The Trooper's Health is " + trooperHealth);
		System.out.println("trooper takes damage");
		trooperHealth = trooperHealth - 15;
		System.out.println("The trooper's health is now " + trooperHealth);
		System.out.println();
	}
	public void takeDamageWolf(){
		System.out.println("The wolf's Health is " + wolfHealth);
		System.out.println("wolf takes damage");
		wolfHealth = wolfHealth - 15;
		System.out.println("The wolf's health is now " + wolfHealth);
		System.out.println();
	}
	
	public void giveHealthBear(){
		System.out.println("The Bear's Health is " + bearHealth);
		System.out.println("Bear gets health");
		bearHealth = bearHealth + 15;
		System.out.println("The Bear's health is now " + bearHealth);
		System.out.println();
	}
	public void giveHealthGhost(){
		System.out.println("The ghost's Health is " + ghostHealth);
		System.out.println("ghost gets health");
		ghostHealth = ghostHealth + 15;
		System.out.println("The ghost health is now " + ghostHealth);
		System.out.println();
	}
	public void giveHealthKnight(){
		System.out.println("The knight's Health is " + knightHealth);
		System.out.println("Knight gets health");
		knightHealth = knightHealth + 15;
		System.out.println("The knight's health is now " + knightHealth);
		System.out.println();
	}
	public void giveHealthMutant(){
		System.out.println("The mutant's Health is " + mutantHealth);
		System.out.println("Mutant gets health");
		mutantHealth = mutantHealth + 15;
		System.out.println("The mutant's health is now " + mutantHealth);
		System.out.println();
	}
	public void giveHealthPlayer(){
		System.out.println("The player's Health is " + playerHealth);
		System.out.println("Player gets health");
		playerHealth = playerHealth + 15;
		System.out.println("The player's health is now " + playerHealth);
		System.out.println();
	}
	public void giveHealthTrooper(){
		System.out.println("The trooper's Health is " + trooperHealth);
		System.out.println("Trooper gets health");
		trooperHealth = trooperHealth + 15;
		System.out.println("The trooper's health is now " + trooperHealth);
		System.out.println();
	}
	public void giveHealthWolf(){
		System.out.println("The wolf's Health is " + wolfHealth);
		System.out.println("Wolf gets health");
		wolfHealth = wolfHealth + 15;
		System.out.println("The wolf's health is now " + wolfHealth);
		System.out.println();
	}
	
	public void damageGrenade(){
		System.out.println("The bear's Health is " + bearHealth);
		System.out.println("The grenade hurts the bear");
		bearHealth = bearHealth - 100;
		System.out.println("The bear's health is now " + bearHealth);
		System.out.println();
	}
	public void damageFireball(){
		System.out.println("The bear's Health is " + bearHealth);
		System.out.println("The fireball hurts the bear");
		bearHealth = bearHealth - 75;
		System.out.println("The bear's health is now " + bearHealth);
		System.out.println();
	}
	public void damageScratch(){
		System.out.println("The bear's Health is " + bearHealth);
		System.out.println("The scratch hurts the bear");
		bearHealth = bearHealth - 30;
		System.out.println("The bear's health is now " + bearHealth);
		System.out.println();
	}
	public void damageStrike(){
		System.out.println("The bear's Health is " + bearHealth);
		System.out.println("The Strike hurts the bear");
		bearHealth = bearHealth - 130;
		System.out.println("The bear's health is now " + bearHealth);
		System.out.println();
	}
	public void healPotion(){
		System.out.println("The bear's Health is " + bearHealth);
		System.out.println("The potion heals the bear");
		bearHealth = bearHealth + 100;
		System.out.println("The bear's health is now " + bearHealth);
		System.out.println();
	}
	public void healCure(){
		System.out.println("The bear's Health is " + bearHealth);
		System.out.println("The cure heals the bear");
		bearHealth = bearHealth + 250;
		System.out.println("The bear's health is now " + bearHealth);
		System.out.println();
	}

	@Override
	public void speak() {
		System.out.println("The scratch takes health");
		
	}
	
	public String toString() {
		return new String("Name: " + this.name + "\nWeight: " +  "\n");
	}

}
