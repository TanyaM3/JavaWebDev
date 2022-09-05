package by.epam.homework.less11;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("Ivanov", "I.I.", 1);
		students[1] = new Student("Petrov", "P.P.", 1);
		students[2] = new Student("Sidorov", "L.S..", 1);
		students[3] = new Student("Black", "O.M.", 2);
		students[4] = new Student("Brown", "A.V.", 2);
		students[5] = new Student("Petrova", "M.V.", 3);
		students[6] = new Student("Ivanova", "K.S.", 3);
		students[7] = new Student("Sinicin", "H.K.", 3);
		students[8] = new Student("Voronov", "A.K.", 3);
		students[9] = new Student("Voropai", "S.N.", 3);

		students[0].addGrade(10);
		students[0].addGrade(9);
		students[1].addGrade(10);
		students[2].addGrade(7);
		students[3].addGrade(8);

		System.out.println("Students with excellent grades: ");
		for (int i = 0; i < 10; ++i) {
			if (students[i].isExcellent()) {
				students[i].print();
			}
		}
	}
}