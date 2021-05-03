
public class InstructorManager extends UserManager{
	
	public void courseCreate(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+" kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafýndan oluþturuldu");		
	}

	public void courseUpdate(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+" kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafýndan güncellendi");
	}
	
	public void deleteCourse(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+ " kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafýndan silindi");
	}
	
}
