import java.util.Scanner;
import java.util.ArrayList;


public class Main{



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		Human[] myhumanEnemiesK = new Human[1];
		Human[] myhumanEnemiesT = new Human[1];
		Animal[] myanimalEnemiesW = new Animal[1];
		Animal[] myanimalEnemiesB = new Animal[1];
		Undead[] myundeadEnemiesG = new Undead[1];
		Undead[] myundeadEnemiesM = new Undead[1];

		Human[] myhumanPlayers = new Human[1];
		Item[] myGrenades = new Item[1];
		Item[] myPotions = new Item[1];

		Inventory itemsG = new Inventory();
		Inventory itemsP = new Inventory();
		Inventory itemsM = new Inventory();
		Inventory magicF = new Inventory();
		Inventory magicC = new Inventory();





		Knight exKnight = new Knight("Steve", 29, 'M', 155.0f, true);
		Trooper exTrooper = new Trooper("DeathStar", 34, 'M', 209.0f, true);
		Wolf exWolf = new Wolf("Chomp", 8, 'M', 92.0f, true);
		Bear exBear = new Bear("Scar", 15, 'M', 652.0f, true);
		Ghost exGhost = new Ghost("Reaper", 15, 'M', 652.0f, true);
		Mutant exMutant = new Mutant("Reggie", 15, 'M', 652.0f, true);
		Player exPlayer = new Player("Gamer", 20, 'M', 155.0f, true);
		Grenade exGrenade = new Grenade("Grenade", 5.0f, true);
		Potion exPotion = new Potion("Potion", 4.5f, true);




		myhumanEnemiesK[0] = exKnight;
		myhumanEnemiesT[0] = exTrooper;
		myanimalEnemiesW[0] = exWolf;
		myanimalEnemiesB[0] = exBear;
		myundeadEnemiesG[0] = exGhost;
		myundeadEnemiesM[0] = exMutant;
		myhumanPlayers[0] = exPlayer;
		myGrenades[0] = exGrenade;
		myPotions[0] = exPotion;

		String userInput = "";
		String userInput2 = "";
		boolean ans = false;
		boolean ans2 = false;
		boolean ans3 = false;


		Room currentRoom = null;
		Room ent = new Room("Grand Foyer", "You are in a large foyer. There is a doorway to the north, stairs going down to the east, and stairs going up to the west.");
		Room bedroom = new Room("Bedroom", "You are in a bedroom. There is a doorway to the north and stairs going down to the east.");
		Room wineCellar = new Room("Wine Cellar", "You are in the wine cellar. There are stairs heading up to the west.");
		Room ballroom = new Room("Ballroom", "You are in the Ballroom. There are doors to your east, and south.");
		Room diningHall = new Room("Dining Hall", "You are in the dining hall. There are doors to your north and west.");
		Room billiardRoom = new Room("Billiard Room", "You are in the billiard room. There are doors to your south and west.");
		Room library = new Room("Library", "You are in the library. There is a door to the east.");
		Room masterBedroom = new Room("Master Bedroom", "You are in the master bedroom. There is a doorway to the south and stairs heading up to the north.");
		Room attic = new Room("Attic", "You are in the attic. There are stairs heading down to the south.");

		ent.setRooms(ballroom, wineCellar, null, bedroom);
		bedroom.setRooms(masterBedroom, ent, null, null);
		wineCellar.setRooms(null, null, null, ent);
		ballroom.setRooms(null, diningHall, ent, null);
		diningHall.setRooms(billiardRoom, null, null, ballroom);
		billiardRoom.setRooms(null, null, diningHall, library);
		library.setRooms(null, billiardRoom, ballroom, null);
		masterBedroom.setRooms(attic, null, bedroom, null);
		attic.setRooms(null, null, masterBedroom, null);

		currentRoom = ent;

		String ansBilliard;
		String ansDining;
		String ansballroom;
		String ansbedroom;
		String ansmaster;
		String anslibrary;
		
		
		System.out.println("You are driving alone in the middle of the night, \nWhen suddenly, you come across this dark unpaved road. You decide to follow it...");
		userInput = in.nextLine();
		System.out.println("At the end of the road, you find it leads to a giant abandoned mansion \nIt is covered in moss and many windows are broken");
		userInput = in.nextLine();
		System.out.println("You know you shouldn't go in, but your curiousity gets the best of you...");
		userInput = in.nextLine();
		System.out.println("The front door creeks open, you cautiously step inside looking around...\nThe temperature of the room drops fast, sending chills down your spine...");
		userInput = in.nextLine();
		System.out.println("Right as you turn around to leave, the door slams shut and locks from the outside...");
		userInput = in.nextLine();
		System.out.println("There is no direction to go but forward.");
		userInput = in.nextLine();

		System.out.println(currentRoom.toString());
		System.out.println("What would you like to do?");

		while(!userInput.equalsIgnoreCase("Quit") && exPlayer.playerHealth > 0) {
			
			
			userInput = in.nextLine();


			if (userInput.equalsIgnoreCase("inventory")){
				itemsG.printGrenades();
				magicF.printFireballs();
				magicC.printCures();
				itemsP.printPotions();
				itemsM.printMiscellaneous();

			}




			Room nextRoom = currentRoom.move(userInput);



			if(ans2 == false) {
				if(nextRoom != null && nextRoom != library) {
					currentRoom = nextRoom;
				}else {
					System.out.println("You can't go this way");
				}
				if(nextRoom == library) {
					if(ans == false) {
						System.out.println("You need a key to access this room");

					}else {
						System.out.println("The door is locked but you have the key.");
					}
				}
			}
			if(ans2 == true) {
				if(nextRoom != null) {
					currentRoom = nextRoom;
				}else {
					System.out.println("You can't go this way");
				}
			}



			if(currentRoom == ent) {
				System.out.println(currentRoom.toString());
				System.out.println("What would you like to do?");
				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The foyer is mostly empty. There is a desk with drawers against the wall.");
				}
				if (userInput.equalsIgnoreCase("search desk")){
					System.out.println("There seems to be a note in here...");
				}
				if (userInput.equalsIgnoreCase("take note")){
					itemsM.addItemM("Foyer Note", 1, true);
					System.out.println("Note added to inventory");
				}
			}
			if (userInput.equalsIgnoreCase("read foyer note")){
				System.out.println("Welcome to the haunted mansion. Find the key and escape.... Or die trying.");
			}

			if(currentRoom == bedroom) {
				System.out.println(currentRoom.toString());



				while(exWolf.wolfHealth > 0) {
					System.out.println("You have encountered a wolf.");
					ansbedroom = in.next();
					switch(ansbedroom) {

					case "grenade":
						try{
							itemsG.removeItemG();
							for(Animal e : myanimalEnemiesW)
								e.damageGrenade();
							System.out.println("The wolf used strike");
							for(Human e : myhumanPlayers)
								e.damageStrike();
						}catch(Exception e) {
							System.out.println("You have no grenades");
						}
						break;
					case "potion":
						try{
							itemsP.removeItemP();
							for(Human e : myhumanPlayers)
								e.healPotion();
						}catch(Exception e) {
							System.out.println("You have no potions");
						}
						break;
					case "fireball":
						try{
							magicF.removeMagicF();
							for(Animal e : myanimalEnemiesW)
								e.damageFireball();
							System.out.println("The wolf used scratch");
							for(Human e : myhumanPlayers)
								e.damageScratch();
						}catch(Exception e) {
							System.out.println("You have no fireballs");
						}
						break; 
					case "cure":
						try{
							magicC.removeMagicC();
							for(Human e : myhumanPlayers)
								e.healCure();
						}catch(Exception e) {
							System.out.println("You have no cures");
						}
						break;
					case "strike":
						for(Animal e : myanimalEnemiesW)
							e.damageStrike();
						System.out.println("The wolf used scratch");
						for(Human e : myhumanPlayers)
							e.damageScratch();
						break;
					case "scratch":
						for(Animal e : myanimalEnemiesW)
							e.damageScratch();
						System.out.println("The wolf used strike");
						for(Human e : myhumanPlayers)
							e.damageStrike();
						break;

					}

				}
				System.out.println("The wolf dropped a potion and a fireball");

				if (userInput.equalsIgnoreCase("take potion")){
					itemsP.addItemP("HealingPotion", 3, true);
					System.out.println("Potion added to inventory");	
				}
				if (userInput.equalsIgnoreCase("take fireball")){
					magicF.addMagicF("Fireball", true);
					System.out.println("Fireball added to inventory");	
				}

			

				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The bedroom is rather small. There is an old mattress, a broken window, and a closet");
				}
				if (userInput.equalsIgnoreCase("search closet")){
					System.out.println("There doesn't seem to be anything in here...");
				}

			}
			if(currentRoom == attic) {
				System.out.println(currentRoom.toString());
				System.out.println("What would you like to do?");	
				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The attic is infested with spiders. There is a small box on the floor.");
				}
				if (userInput.equalsIgnoreCase("search box")){
					System.out.println("There is a key in the box.");
				}
				if (userInput.equalsIgnoreCase("take key")){
					itemsM.addItemM("Key", 1, true);
					ans = true;
					System.out.println("The key has been added to your inventory");
				}


			}
			if (currentRoom == ballroom) {
				System.out.println(currentRoom.toString());



				while(exBear.bearHealth > 0) {
					System.out.println("You have encountered a bear.");
					ansballroom = in.next();
					switch(ansballroom) {

					case "grenade":
						try{
							itemsG.removeItemG();
							for(Animal e : myanimalEnemiesB)
								e.damageGrenade();
							System.out.println("The bear used strike");
							for(Human e : myhumanPlayers)
								e.damageStrike();
						}catch(Exception e) {
							System.out.println("You have no grenades");
						}
						break;
					case "potion":
						try{
							itemsP.removeItemP();
							for(Human e : myhumanPlayers)
								e.healPotion();
						}catch(Exception e) {
							System.out.println("You have no potions");
						}
						break;
					case "fireball":
						try{
							magicF.removeMagicF();
							for(Animal e : myanimalEnemiesB)
								e.damageFireball();
							System.out.println("The bear used scratch");
							for(Human e : myhumanPlayers)
								e.damageScratch();
						}catch(Exception e) {
							System.out.println("You have no fireballs");
						}
						break; 
					case "cure":
						try{
							magicC.removeMagicC();
							for(Human e : myhumanPlayers)
								e.healCure();
						}catch(Exception e) {
							System.out.println("You have no cures");
						}
						break;
					case "strike":
						for(Animal e : myanimalEnemiesB)
							e.damageStrike();
						System.out.println("The bear used scratch");
						for(Human e : myhumanPlayers)
							e.damageScratch();
						break;
					case "scratch":
						for(Animal e : myanimalEnemiesB)
							e.damageScratch();
						System.out.println("The bear used strike");
						for(Human e : myhumanPlayers)
							e.damageStrike();
						break;

					}
				}
				System.out.println("The bear dropped a cure and a grenade");

				if (userInput.equalsIgnoreCase("take cure")){
					magicC.addMagicC("Cure", true);
					System.out.println("Cure added to inventory");	
				}
				if (userInput.equalsIgnoreCase("take grenade")){
					itemsG.addItemG("PinGrenade",3, true);
					System.out.println("Grenade added to inventory");	
				}


				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The ballroom is huge. There doesn't seem to be anything searchable in here.");
				}


			}
			if (currentRoom == masterBedroom) {

				System.out.println(currentRoom.toString());



				while(exTrooper.trooperHealth > 0) {
					System.out.println("You have encountered a trooper.");
					ansmaster = in.next();
					switch(ansmaster) {

					case "grenade":
						try{
							itemsG.removeItemG();
							for(Human e : myhumanEnemiesT)
								e.damageGrenade();
							System.out.println("The trooper used scratch");
							for(Human e : myhumanPlayers)
								e.damageScratch();
						}catch(Exception e) {
							System.out.println("You have no grenades");
						}
						break;
					case "potion":
						try{
							itemsP.removeItemP();
							for(Human e : myhumanPlayers)
								e.healPotion();
						}catch(Exception e) {
							System.out.println("You have no potions");
						}
						break;
					case "fireball":
						try{
							magicF.removeMagicF();
							for(Human e : myhumanEnemiesT)
								e.damageFireball();
							System.out.println("The trooper used a grenade");
							for(Human e : myhumanPlayers)
								e.damageGrenade();
						}catch(Exception e) {
							System.out.println("You have no fireballs");
						}
						break; 
					case "cure":
						try{
							magicC.removeMagicC();
							for(Human e : myhumanPlayers)
								e.healCure();
						}catch(Exception e) {
							System.out.println("You have no cures");
						}
						break;
					case "strike":
						for(Human e : myhumanEnemiesT)
							e.damageStrike();
						System.out.println("The trooper used a grenade");
						for(Human e : myhumanPlayers)
							e.damageGrenade();
						break;
					case "scratch":
						for(Human e : myhumanEnemiesT)
							e.damageScratch();
						System.out.println("The trooper used strike");
						for(Human e : myhumanPlayers)
							e.damageStrike();
						break;

					}
				}
				System.out.println("The trooper dropped a grenade and a potion");

				if (userInput.equalsIgnoreCase("take potion")){
					itemsP.addItemP("HealingPotion", 3, true);
					System.out.println("Potion added to inventory");	
				}
				if (userInput.equalsIgnoreCase("take grenade")){
					itemsG.addItemG("PinGrenade",3, true);
					System.out.println("Grenade added to inventory");	
				}



				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The master bedroom looks quite roomy. There is a nightstand next to the bed. \nThere might even be something under the bed as well.");
				}
				if (userInput.equalsIgnoreCase("search bed")){
					System.out.println("You found a note.");
				}
				if (userInput.equalsIgnoreCase("search nightstand")){
					System.out.println("The drawers are empty");
				}
				if (userInput.equalsIgnoreCase("take note")){
					itemsM.addItemM("Master Note", 1, true);
					System.out.println("Master note added to inventory");
				}

			}
			if (userInput.equalsIgnoreCase("read master note")){
				System.out.println("Dear diary: I am trapped... There is no way out \nI found out the key is in the attic but I can't get to it.");
			}
			if (currentRoom == diningHall) {
				System.out.println(currentRoom.toString());


				while(exKnight.knightHealth > 0) {
					System.out.println("You have encountered a knight.");
					ansDining = in.next();
					switch(ansDining) {

					case "grenade":
						try{
							itemsG.removeItemG();
							for(Human e : myhumanEnemiesK)
								e.damageGrenade();
							System.out.println("The knight used strike");
							for(Human e : myhumanPlayers)
								e.damageStrike();
						}catch(Exception e) {
							System.out.println("You have no grenades");
						}
						break;
					case "potion":
						try{
							itemsP.removeItemP();
							for(Human e : myhumanPlayers)
								e.healPotion();
						}catch(Exception e) {
							System.out.println("You have no potions");
						}
						break;
					case "fireball":
						try{
							magicF.removeMagicF();
							for(Human e : myhumanEnemiesK)
								e.damageFireball();
							System.out.println("The knight used a grenade");
							for(Human e : myhumanPlayers)
								e.damageGrenade();
						}catch(Exception e) {
							System.out.println("You have no fireballs");
						}
						break; 
					case "cure":
						try{
							magicC.removeMagicC();
							for(Human e : myhumanPlayers)
								e.healCure();
						}catch(Exception e) {
							System.out.println("You have no cures");
						}
						break;
					case "strike":
						for(Human e : myhumanEnemiesK)
							e.damageStrike();
						System.out.println("The knight used scratch");
						for(Human e : myhumanPlayers)
							e.damageScratch();
						break;
					case "scratch":
						for(Human e : myhumanEnemiesK)
							e.damageScratch();
						System.out.println("The knight used a fireball");
						for(Human e : myhumanPlayers)
							e.damageFireball();
						break;

					}
				}
				System.out.println("The knight dropped a note");

				if (userInput.equalsIgnoreCase("take note")){
					itemsM.addItemM("Dining Hall Note", 3, true);
					System.out.println("Note added to inventory");	
				}


				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The dining hall is creepy. There are weird paintings on the wall.");
				}


			}
			if (userInput.equalsIgnoreCase("read dining note")){
				System.out.println("If you wish to escape, you need to get into the library. \nBut you need a key.");
			}


			if (currentRoom == billiardRoom) {


				System.out.println(currentRoom.toString());	

				while(exGhost.ghostHealth > 0) {
					System.out.println("You have encountered a ghost.");
					ansBilliard = in.next();
					switch(ansBilliard) {

					case "grenade":
						try{
							itemsG.removeItemG();
							for(Undead e : myundeadEnemiesG)
								e.damageGrenade();
							System.out.println("The ghost used a fireball");
							for(Human e : myhumanPlayers)
								e.damageFireball();
						}catch(Exception e) {
							System.out.println("You have no grenades");
						}
						break;
					case "potion":
						try{
							itemsP.removeItemP();
							for(Human e : myhumanPlayers)
								e.healPotion();
						}catch(Exception e) {
							System.out.println("You have no potions");
						}
						break;
					case "fireball":
						try{
							magicF.removeMagicF();
							for(Undead e : myundeadEnemiesG)
								e.damageFireball();
							System.out.println("The ghost used scratch");
							for(Human e : myhumanPlayers)
								e.damageScratch();
						}catch(Exception e) {
							System.out.println("You have no fireballs");
						}
						break; 
					case "cure":
						try{
							magicC.removeMagicC();
							for(Human e : myhumanPlayers)
								e.healCure();
						}catch(Exception e) {
							System.out.println("You have no cures");
						}
						break;
					case "strike":
						for(Undead e : myundeadEnemiesG)
							e.damageStrike();
						System.out.println("The ghost used strike");
						for(Human e : myhumanPlayers)
							e.damageStrike();
						break;
					case "scratch":
						for(Undead e : myundeadEnemiesG)
							e.damageScratch();
						System.out.println("The ghost used a grenade");
						for(Human e : myhumanPlayers)
							e.damageGrenade();
						break;

					}
				}
				System.out.println("The ghost dropped a fireball and a cure");


				if (userInput.equalsIgnoreCase("look")){
					System.out.println("This room has blood on the floor. There is an armoir.");
				}
				if (userInput.equalsIgnoreCase("search armoir")){
					System.out.println("There is a grenade, cure, potion, and fireball in here");
				}
				if (userInput.equalsIgnoreCase("take potion")){
					itemsP.addItemP("HealingPotion", 3, true);
					System.out.println("Potion added to inventory");
				}
				if (userInput.equalsIgnoreCase("take grenade")){
					itemsG.addItemG("PinGrenade", 3, true);
					System.out.println("Grenade added to inventory");
				}
				if (userInput.equalsIgnoreCase("take cure")){
					magicC.addMagicC("Cure", true);
					System.out.println("Cure added to inventory");
				}

				if (userInput.equalsIgnoreCase("take fireball")){
					magicF.addMagicF("Fireball", true);
					System.out.println("Fireball added to inventory");
				}
				if (userInput.equalsIgnoreCase("unlock door")){
					if(ans == true) {

						System.out.println("The door has been unlocked");
						ans2 = true;

					}else {
						System.out.println("You need a key to enter this room");
					}
				}


			}
			if (currentRoom == library) {
				System.out.println(currentRoom.toString());



				while(exMutant.mutantHealth > 0) {
					System.out.println("You have encountered the boss enemy mutant.");
					anslibrary = in.next();
					switch(anslibrary) {

					case "grenade":
						try{
							itemsG.removeItemG();
							for(Undead e : myundeadEnemiesM)
								e.damageGrenade();
							System.out.println("The mutant used strike");
							for(Human e : myhumanPlayers)
								e.damageStrike();
							System.out.println("The mutant also used scratch");
							for(Human e : myhumanPlayers)
								e.damageScratch();
						}catch(Exception e) {
							System.out.println("You have no grenades");
						}
						break;
					case "potion":
						try{
							itemsP.removeItemP();
							for(Human e : myhumanPlayers)
								e.healPotion();
						}catch(Exception e) {
							System.out.println("You have no potions");
						}
						break;
					case "fireball":
						try{
							magicF.removeMagicF();
							for(Undead e : myundeadEnemiesM)
								e.damageFireball();
							System.out.println("The mutant used a grenade");
							for(Human e : myhumanPlayers)
								e.damageGrenade();
							System.out.println("The mutant also used strike");
							for(Human e : myhumanPlayers)
								e.damageStrike();
						}catch(Exception e) {
							System.out.println("You have no fireballs");
						}
						break; 
					case "cure":
						try{
							magicC.removeMagicC();
							for(Human e : myhumanPlayers)
								e.healCure();
						}catch(Exception e) {
							System.out.println("You have no cures");
						}
						break;
					case "strike":
						for(Undead e : myundeadEnemiesM)
							e.damageStrike();
						System.out.println("The mutant used scratch");
						for(Human e : myhumanPlayers)
							e.damageScratch();
						System.out.println("The mutant also used a fireball");
						for(Human e : myhumanPlayers)
							e.damageFireball();
						break;
					case "scratch":
						for(Undead e : myundeadEnemiesM)
							e.damageScratch();
						System.out.println("The mutant used a grenade");
						for(Human e : myhumanPlayers)
							e.damageGrenade();
						System.out.println("The mutant also used a fireball");
						for(Human e : myhumanPlayers)
							e.damageFireball();

						break;

					}
				}
				System.out.println("The mutants death created an exit portal");

				if (userInput.equalsIgnoreCase("enter portal")){
					System.out.println("Congratulations! You have beaten the game.");	
				}



				if (userInput.equalsIgnoreCase("look")){
					System.out.println("There's hundreds of books in here.");
				}


			}
			if (currentRoom == wineCellar) {

				System.out.println(currentRoom.toString());
				System.out.println("What would you like to do?");
				if (userInput.equalsIgnoreCase("look")){
					System.out.println("The wine cellar is dusty. There is debris all over the floor and a chest in the corner.");
				}
				if (userInput.equalsIgnoreCase("search chest")){
					System.out.println("There is a lantern in here as well as a grenade");

				}
				if (userInput.equalsIgnoreCase("take lantern")){
					itemsM.addItemM("Lantern", 1, true);
					System.out.println("Lantern added to inventory");
				}
				if (userInput.equalsIgnoreCase("take grenade")){
					itemsG.addItemG("PinGrenade", 1, true);
					System.out.println("Grenade added to inventory");
				}



			}


		}
		System.out.println("Game Over!");
		
		 

	}



}
