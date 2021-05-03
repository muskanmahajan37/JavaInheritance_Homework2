
public class Student extends User {

	private String _courseProgram;
	private String _completionRate;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String email, String password, String avatar,
			String courseProgram, String completionRate) {
		super(id, firstName, lastName, email, password, avatar);
		this._courseProgram = courseProgram;
		this._completionRate = completionRate;
	}
	
	public String getCourseProgram () {
		return _courseProgram;
	}
	
	public void setCourseProgram (String courseProgram) {
		
		_courseProgram=courseProgram;
	}
	
	public String getCompletionRate() {
		return _completionRate;
	}
	
	public void setCompletionRate() {
		
	}
	
	
	
	
	
	
	
}
