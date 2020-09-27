package welcomeScreen;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WelcomeScreen.welcomeScreen();
		try {
			AppMenu.menuDriven();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  catch (NoSuchElementException e) {
			// TODO: handle exception
			  
		}
	}

}
