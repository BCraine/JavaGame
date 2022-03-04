import java.util.ArrayList;


public class Room {
	String name;
	String description;
	
	ArrayList<Item> itemInRoom;
	ArrayList<Human> henemiesInRoom;
	ArrayList<Animal> aenemiesInRoom;
	
	private Room north;
	private Room east;
	private Room south;
	private Room west;
	
	public Room(String name, String description) {
		this.name = name;
		this.description = description;
		
	}
	
	public void setRooms(Room north, Room east, Room south, Room west) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
	}
	
	public Room move(String direction) {
		direction = direction.toLowerCase();
		if(direction.equals("north")) {
			return this.north;
		}else if(direction.equals("east")) {
			return this.east;
		}else if (direction.equals("south")) {
			return this.south;
		}else if (direction.equals("west")) {
			return this.west;
		}
		return null;
		
		
	}
	
	
	
	
	
	
	public String toString() {
		return new String(this.name + "\n" + this.description);
		
	}
}
