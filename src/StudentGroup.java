import java.util.Date;

/**
 * A fix-sized array of students array length should always be equal to the
 * number of stored elements after the element was removed the size of the array
 * should be equal to the number of stored elements after the element was added
 * the size of the array should be equal to the number of stored elements null
 * elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given
 * class, interface or method DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task
	 * check
	 * 
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if (students == null) {
			throw new IllegalArgumentException();
		}

		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}

		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if (student == null || index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}

		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		Student[] newStudents = new Student[students.length + 1];
		newStudents[0] = student;

		for (int i = 0; i < students.length; i++) {
			newStudents[i + 1] = students[i];
		}
	}

	@Override
	public void addLast(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		Student[] newStudents = new Student[students.length + 1];
		newStudents[students.length] = student;

		for (int i = 0; i < students.length; i++) {
			newStudents[i] = students[i];
		}
	}

	@Override
	public void add(Student student, int index) {
		if (student == null || index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}

		Student[] newStudents = new Student[students.length + 1];
		newStudents[index] = student;

		for (int i = 0; i < index; i++) {
			newStudents[i] = students[i];
		}

		for (int i = index + 1; i < newStudents.length; i++) {
			newStudents[i] = students[i - 1];
		}
	}

	@Override
	public void remove(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}

		students[index] = null;
	}

	@Override
	public void remove(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				students[i] = null;
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}

		for (int i = index; i < students.length; i++) {
			students[i] = null;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				removeFromIndex(i);
				break;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < index; i++) {
			students[i] = null;
		}
	}

	@Override
	public void removeToElement(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				removeToIndex(i);
				break;
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if (date == null) {
			throw new IllegalArgumentException();
		}

		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i].getBirthDate().equals(date)) {
				count++;
			}
		}

		Student[] studentsBorn = new Student[count];

		for (int i = 0, j = 0; i < students.length; i++) {
			if (students[i].getBirthDate().equals(date)) {
				studentsBorn[j] = students[i];
				j++;
			}
		}

		return studentsBorn;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if (firstDate == null || lastDate == null) {
			throw new IllegalArgumentException();
		}
		int numFirstDate = 0;
		int numLastDate = 0;
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getBirthDate().equals(firstDate)) {
				numFirstDate = i;
			}
			if (students[i].getBirthDate().equals(lastDate)) {
				numLastDate = i;
			}
			count = i;
		}
		Student[] studentsBetweenBirthDates = new Student[count];

		for (int i = numFirstDate; i < numLastDate; i++) {
			studentsBetweenBirthDates[i] = students[i];
		}
		return studentsBetweenBirthDates;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		if (date == null) {
			throw new IllegalArgumentException();
		}
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getBirthDate().equals(date)) {
				index = i;
			}
		}

		for (int i = index; i < days; i++) {

		}

		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {



		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
