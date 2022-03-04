
public abstract class Animal extends EnemyHealth implements Character{
	
	protected String name;
	protected int age;
	protected char gender;
	protected float weight;
	
	
	public Animal(String name) {
		this.name = name;
		this.age = 0;
		this.gender = '?';
		this.weight = 0.0f;
	}
	
	public Animal(String name, int age, char gender, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public abstract void takeDamageBear();
	public abstract void takeDamageGhost();
	public abstract void takeDamageKnight();
	public abstract void takeDamageMutant();
	public abstract void takeDamageTrooper();
	public abstract void takeDamageWolf();
	public abstract void takeDamagePlayer();
	
	public abstract void giveHealthBear();
	public abstract void giveHealthGhost();
	public abstract void giveHealthKnight();
	public abstract void giveHealthMutant();
	public abstract void giveHealthTrooper();
	public abstract void giveHealthWolf();
	public abstract void giveHealthPlayer();
	
	public abstract void damageGrenade();
	public abstract void damageFireball();
	public abstract void damageStrike();
	public abstract void damageScratch();
	
	public abstract void healCure();
	public abstract void healPotion();
}


