import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class Screen 
{
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle screenRectangle = new Rectangle(screenSize);
	String path = "C://Development//Shot.jpg"; 
	
	public String getScreenResolution()
	{
		   int width = screenRectangle.width;
		   int height = screenRectangle.height;
		   
		   return "������ ������ - " + Integer.toString(width) + ". ������ ������ - " + Integer.toString(height);
	}
	
	public void getScreenSNapshot()
	{  
		
		try
		{   
			TimeUnit.SECONDS.sleep(1);
            Robot r = new Robot(); 
            Rectangle capture =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
            BufferedImage Image = r.createScreenCapture(capture); 
            ImageIO.write(Image, "jpg", new File(path)); 
            System.out.println("�������� ������� � " + path); 
		}
            
            catch (AWTException | IOException | InterruptedException  ex) { 
                System.out.println(ex); 
            } 

	}

}
