
public abstract class Attack extends EnemyHealth implements Character{
	
	
	protected String name;


	
	public Attack(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
