
public class Instructor extends User {

	private String givenCourse;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String avatar, String givenCourse) {
		super (id,firstName,lastName,email,password,avatar);
		this.givenCourse=givenCourse;		
	}
	
	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
	
}
