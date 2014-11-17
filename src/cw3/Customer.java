package cw3;

public class Customer {
	private int currentFloor = 0;
	private int destinationFloor = 0;
	private static int customerCount = 0;
	private int id = 0;
	private Boolean inElevator = false; //needed?
	private Boolean finished = false; // probably unneeded, as specifications state customers only use the elevator once.
	
	public Customer(int currentFloor, int destinationFloor) {
		setCurrentFloor(currentFloor);
		setDestinationFloor(destinationFloor);
		customerCount++;
		id = customerCount;
	}
	
	// Getters and Setters START
	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		if(currentFloor >= 0) {
			this.currentFloor = currentFloor;
		}
		else {
			System.out.println("\nError: Customer cannot get on from a negative floor.");
		}
	}

	public int getDestinationFloor() {
		return destinationFloor;
	}

	public void setDestinationFloor(int destinationFloor) {
		if(destinationFloor >= 0) {
			this.destinationFloor = destinationFloor;
		}
		else {
			System.out.println("\nError: Customer cannot get off at a negative floor.");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getInElevator() {
		return inElevator;
	}

	public void setInElevator(Boolean inElevator) {
		this.inElevator = inElevator;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	// Getters and Setters END
	
	public String calcDirection() {
		if(destinationFloor - currentFloor > 0) {
			return "up";
		}
		if(destinationFloor - currentFloor < 0) {
			return "down";
		}
		return "undetermined";
	}
	
	@Override
	public String toString() {
		String objString = "";
//		private String id = null;
//		private Boolean inElevator = false;
//		private Boolean finished = false;
		objString += "currentFloor: " + currentFloor + "\ndestinationFloor: " + destinationFloor + "\nid: " + id + "\ninElevator: " + inElevator + "\nfinished: " + finished + "\ncalcDirection(): " + calcDirection() + "\n\n";
		return objString;
	}
}