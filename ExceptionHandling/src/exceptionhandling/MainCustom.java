package exceptionhandling;

public class MainCustom {

	static void validate(int age) throws CustomException {
		if (age < 20) {
			throw new CustomException("age is invalid");
		}
	}

	public static void main(String[] args) {

		int age = 18;
		try {
			validate(age);
		} catch (CustomException e) {

			e.printStackTrace();
		}

	}

}
