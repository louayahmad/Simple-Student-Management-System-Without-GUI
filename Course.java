import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private double total = 0; 
	private double calculateAverage = 0;

	ArrayList<Student> studentsInCourse = new ArrayList<Student>();
	
	public Course (String courseName) 
	{
	
		this.courseName = courseName;
		
	}
	
	public void addStudent (Student student) //adding a student into the ArrayList 
	{
		
		studentsInCourse.add(student);
		
	}
	
	public double calculateAverage () 
	{
		
		for (Student student : studentsInCourse) // have to use a for each loop to iterate over a an ArrayList, in this case the ArrayList Student
		{
			
			 double sum = student.getTestScore(1) + student.getTestScore(2) + student.getTestScore(3);
	         
			 total = total + sum / 3;
			
		}
		
		calculateAverage = total/studentsInCourse.size();
		
		return calculateAverage;

	}
	
	public void roll () 
	{
		System.out.println("Name of the course: "+ courseName);
		
		
		for(Student student : studentsInCourse) 
		{
			
			System.out.println("\n"+student.toString());
			
		}
		
	}
}
