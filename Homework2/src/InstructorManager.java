
public class InstructorManager extends UserManager{
	
	public void courseCreate(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+" kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafından oluşturuldu");		
	}

	public void courseUpdate(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+" kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafından güncellendi");
	}
	
	public void deleteCourse(Course course, Instructor instructor) {
		System.out.println(course.getCourseName()+ " kursu "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafından silindi");
	}
	
}
