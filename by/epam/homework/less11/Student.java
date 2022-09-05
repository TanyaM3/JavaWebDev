package by.epam.homework.less11;

public class Student {
	private String surname;
	private String initials;
	private int group;
	private int[] grades;
	private int gradesCounter;

	public Student(String surname, String initials, int group) {
		super();
		this.surname = surname;
		this.initials = initials;
		this.group = group;
		grades = new int[5];
		gradesCounter = 0;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public void addGrade(int grade) {
		if (gradesCounter == 5) {
			System.out.println("5 marks have already been added");
			return;
		}
		grades[gradesCounter] = grade;
		gradesCounter++;

	}

	public boolean isExcellent() {
		if (gradesCounter == 0) {
			return false;
		}
		for (int i = 0; i < gradesCounter; i++) {
			if (grades[i] != 9 && grades[i] != 10) {
				return false;
			}
		}
		return true;
	}

	public void print() {
		System.out.println(surname + " " + initials + " " + group);
	}
}