package exceptiond;

public class GoogleApi {

	public boolean authenticate(String email, String password) {

		if (email.length() >= 11 && email.contains("@") && email.contains(".") && email.endsWith("@gmail.com")) {
			if (email.equals("royal@gmail.com") && password.equals("royal")) {
				return true;
			} else {
				return false;
			}
		} else {

			// InvalidEmailException

			InvalidEmailException e = new InvalidEmailException();
			throw e;
		}

	}
}
//1) extends -> Exception or RuntimeException
//2) set error message --> call parents Constructor and pass your error message 

class InvalidEmailException extends RuntimeException {

	public InvalidEmailException() {

		super("Invalid Email : 00123 ");
	}

}