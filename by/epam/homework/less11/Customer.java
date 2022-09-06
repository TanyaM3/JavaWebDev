package by.epam.homework.less11;

public class Customer {
	private String id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int cardNum;
	private String bankNum;

	public Customer(String id, String surname, String name, String patronymic, String address, int cardNum,
			String bankNum) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNum = cardNum;
		this.bankNum = bankNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public String getBankNum() {
		return bankNum;
	}

	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}

	public static void sortByName(Customer[] customers) {
		for (int i = 0; i < customers.length - 1; i++) {
			for (int j = customers.length - 1; j > i; j--) {
				if (customers[j - 1].getSurname().compareTo(customers[j].getSurname()) > 0) {
					Customer tmp = customers[j - 1];
					customers[j - 1] = customers[j];
					customers[j] = tmp;
				}
			}
		}
	}

	public void print() {
		System.out.println(surname + " " + name + " " + patronymic + ", card " + cardNum);
	}

	public static void customersInCardInterval(Customer[] customers, int from, int to) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getCardNum() >= from && customers[i].getCardNum() <= to) {
				customers[i].print();
			}
		}
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", cardNum=" + cardNum + ", bankNum=" + bankNum + "]";
	}
}