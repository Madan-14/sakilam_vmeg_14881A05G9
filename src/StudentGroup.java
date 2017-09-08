import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		for(int i=0;i<students.length;i++)
		{
			student[i]=student[index];
		}
		return Student;
	}

	@Override
	public void setStudents(Student[] students) {
		for(int i=0;i<students.length;i++)
		{
			Student[index]=Student[i];
		}
	
	}

	@Override
	public Student getStudent(int index) {
		Student=Student[index];
		return student;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			Students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		
		Students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		for(int i=0;i<students.length-1;i++)
		{
			continue;
		}
		Student[i]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		for(i=0;i<students.length;i++)
		{
			if(i==index-1){students[index]=student;}
		}
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		for(i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		
	}

	@Override
	public void remove(Student student) {
	for(i=0;i<students.length();i++)
	{
		if(students[i]==student){student[i]=studen[i+1];}
			
	}
	}

	@Override
	public void removeFromIndex(int index) {
		for(int i=index;i<students.length;i++)
		{
				student[i].truncate();
		}
	}

	@Override
	public void removeFromElement(Student student) {
		
		for(int i=0;i<students.length;i++)
		{
			if((students[i].id==student[i].id)&&(students[i].Fullname==students[i].Fullname)&&(students[i].birthDate==students[i].birthDate)&&(students[i].avgMark==students[i].avgMark))
				
				{
					break;
				}
				else
				{
					index=index+1;
				}
		}
	}

	@Override
	public void removeToIndex(int index) {
		for(int i=1;i<students.length;i++)
		{
			if(i+index>students.length)
			{
				break;
			}
			students[i]=students[i+1];
		}
	}

	@Override
	public void removeToElement(Student student) {
		int i=0;
		do
		{
		students[i].truncate();
		i++;		
		}while(students[i]==student);
	}

	@Override
	public void bubbleSort() {
		Student s;
		for(int i=1;i<students.length();i++)
		{
			for(int j=0;j<students.length()-1;j++)
			{
				if(student[j]>student[j+1])
				{
					s=student[j];
					student[j]=student[j+1];
					student[j+1]=s;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		for(int i=0;i<students.length;i++)
		{
			if(i==indexOfStudent)
			{
				break;
			}
		}
		
		return student[i].birthDate;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		student[] stu=new student(10);
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate==age)
			{
				stu[i]=students[i];
				i+=1;
			}
		}
		return stu;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		int max=100;
		int id=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].avgMark>max)
			{
				max=students[i].avgMark;
				id=1;
			}
		}
		return students[id];
	}

	@Override
	public Student getNextStudent(Student student) {
		int k=0;
		for(int i=0;i<students.length;i++)
		{
			if(student[i]==student){
				k=i;
				break;
			}
			
		}
		return student[k+1];
	}
}
