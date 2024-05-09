//Q.No:6
package Task11;
import java.util.Scanner;

		public class Websitelogin {
		    private static final String USERNAME = "admin";
		    private static final String PASSWORD = "password123";

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Welcome to the Login System!");

		        boolean loggedIn = false;
		        int attempts = 3;

		        while (!loggedIn && attempts > 0) {
		            System.out.print("Enter username: ");
		            String username = scanner.nextLine();

		            System.out.print("Enter password: ");
		            String password = scanner.nextLine();

		            try {
		                login(username, password);
		                loggedIn = true;
		                System.out.println("Login successful!");
		            } catch (InvalidCredentialsException e) {
		                attempts--;
		                System.out.println(e.getMessage());
		                System.out.println("Attempts left: " + attempts);
		            }
		        }

		        if (!loggedIn) {
		            System.out.println("Too many failed attempts. Exiting...");
		        }

		        scanner.close();
		    }

		    private static void login(String username, String password) throws InvalidCredentialsException {
		        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
		            throw new InvalidCredentialsException("Invalid username or password.");
		        }
		    }

		    static class InvalidCredentialsException extends Exception {
		        public InvalidCredentialsException(String message) {
		            super(message);
		        }
		    }
		}


