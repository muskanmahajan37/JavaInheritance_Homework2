
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme ba�ar�l� bir �ekilde kaydedildi");

	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
		
		
		
	}
}
