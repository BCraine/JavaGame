import java.util.ArrayList;
import java.util.List;

public class Inventory{
	
	private ArrayList<Grenade> itemsG;
	private ArrayList<Potion> itemsP;
	private ArrayList<Miscellaneous> itemsM;
	private ArrayList<Fireball> magicF;
	private ArrayList<Cure> magicC;
	private ArrayList<Strike> attackSt;
	private ArrayList<Scratch> attackSc;
	
	
	
	
	
	
	public Inventory() {
		itemsG = new ArrayList<Grenade>();
		itemsP = new ArrayList<Potion>();
		magicF = new ArrayList<Fireball>();
		itemsM = new ArrayList<Miscellaneous>();
		magicC = new ArrayList<Cure>();
		attackSt = new ArrayList<Strike>();
		attackSc = new ArrayList<Scratch>();
		
	}
	
	public void addItemG(String name, float weight, boolean notDecoy) {
		this.itemsG.add(new Grenade(name, weight, notDecoy));
	}
	
	
	public void addItemP(String name, float weight, boolean notFake) {
		this.itemsP.add(new Potion(name, weight, notFake));
	}
	public void addItemM(String name, float weight, boolean real) {
		this.itemsM.add(new Miscellaneous(name, weight, real));
	}
	public void addMagicF(String name, boolean contact) {
		this.magicF.add(new Fireball(name, contact));
	}
	public void removeMagicF() {
		this.magicF.remove(0);
	}
	public void addMagicC(String name, boolean contact) {
		this.magicC.add(new Cure(name, contact));
	}
	public void removeMagicC() {
		this.magicC.remove(0);
	}
	
	public void removeItemG() {
		this.itemsG.remove(0);
	}
	
	public void removeItemP() {
		this.itemsP.remove(0);
	}
	
	public void printGrenades() {
		for(Grenade e : this.itemsG) {
			System.out.println(e.toString());
		}
	}
	public void printPotions() {
		for(Potion e : this.itemsP) {
			System.out.println(e.toString());
		}
	}
	public void printMiscellaneous() {
		for(Miscellaneous e : this.itemsM) {
			System.out.println(e.toString());
		}
	}
	
	public void printFireballs() {
		for(Fireball e : this.magicF) {
			System.out.println(e.toString());
		}
	}
	public void printCures() {
		for(Cure e : this.magicC) {
			System.out.println(e.toString());
		}
	}
	

	

	

}
