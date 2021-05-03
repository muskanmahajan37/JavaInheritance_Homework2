
public class Main { 

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð", "kodlama.io@gmail.com", "123", "Photo(Avatar)",
				"Java&React");
		Instructor instructor2 = new Instructor(2, "Engin", "Demiroð", "kodlama.io@gmail.com", "123", "Photo(Avatar)",
				"C#&Angular");
		Instructor instructor3 = new Instructor(3, "Engin", "Demiroð", "kodlama.io@gmail.com", "123", "Photo(Avatar)",
				"Prog.Giriþ Kursu");

		Student student1 = new Student(4, "Orhun", "Yüksel", "rhyk@gmail.com", "369", "Photo(Avatar)", "Java&React",
				"%53");
		Student student2 = new Student(5, "Ali", "Veli", "aliveli@k.com", "145", "Resim", "Photo(Avatar)", "%25");
		Student student3 = new Student(6, "Hasan", "Hüseyin", "hashüs@a.com", "178", "Photo(Avatar)",
				"Prog.Giriþ Kursu", "%40");

		Course Html = new Course("HTML");
		Course CSS = new Course("CSS");
		Course Bootstrap = new Course("Bootstrap");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseCreate(Bootstrap, instructor2);
		instructorManager.deleteCourse(Html, instructor3);
		instructorManager.courseUpdate(CSS, instructor1);		
		
		UserManager manager = new UserManager();
		User [] users = {instructor1,student1, student2, student3};
		manager.addMultiple(users);
		
		

	}

}
