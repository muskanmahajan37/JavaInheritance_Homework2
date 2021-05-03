
public class InstructorManager extends UserManager{
	
	public void courseCreate(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+" kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" taraf�ndan olu�turuldu");		
	}

	public void courseUpdate(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+" kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" taraf�ndan g�ncellendi");
	}
	
	public void deleteCourse(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+ " kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" taraf�ndan silindi");
	}
	
}
