import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class demo {

	public static void main(String[] args) throws FindFailed, IOException {
		 
		
		Screen screen = new Screen();
		Desktop.getDesktop().open(new File("D:\\firefox.PNG"));
		
		//A overlay screen will apear that asks you to take the screen shot
	    // select the area you want to capture
	    ScreenImage scrImgFile = screen.userCapture();
	    Pattern pattern = null;

	    //THis method will save the file to the current directory
	    String path = scrImgFile.getFile(".");

	    //This will print the full path of the save file
	    System.out.println("Please note down the file Path: ");
	    System.out.println(path);

	    //  rerun the program by replacing the below path with the path we got above

	    //##################### ONE TIME STEP ENDS ###############################

	    pattern = new Pattern(path);

	    try {
	        screen.click(pattern);
	    } catch (FindFailed e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }  

}
}