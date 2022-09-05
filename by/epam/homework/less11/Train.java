package by.epam.homework.less11;

public class Train {
	private String destination;
	private int number;
	private String departureTime;

	public Train(String destination, int number, String departureTime) {
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public Train findTrain(int number, Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumber() == number) {
				return trains[i];
			}
		}
		return null;
	}

	public void sortByNumber(Train[] trains) {
		for (int i = 0; i < trains.length - 1; i++) {
			for (int j = trains.length - 1; j > i; j--) {
				if (trains[j - 1].getNumber() > trains[j].getNumber()) {
					Train tmp = trains[j - 1];
					trains[j - 1] = trains[j];
					trains[j] = tmp;
				}
			}
		}
	}

	public void sortByDestination(Train[] trains) {
		for (int i = 0; i < trains.length - 1; i++) {
			for (int j = trains.length - 1; j > i; j--) {
				if (trains[j - 1].getDestination().compareTo(trains[j].getDestination()) > 0) {
					Train tmp = trains[j - 1];
					trains[j - 1] = trains[j];
					trains[j] = tmp;
				} else if (trains[j - 1].getDestination().compareTo(trains[j].getDestination()) == 0) {
					if (trains[j - 1].getDepartureTime().compareTo(trains[j].getDepartureTime()) > 0) {
						Train tmp = trains[j - 1];
						trains[j - 1] = trains[j];
						trains[j] = tmp;
					}
				}
			}
		}
	}

	public void print() {
		System.out.println("Train number " + number + " to " + destination + ", departure time " + departureTime);
	}
}