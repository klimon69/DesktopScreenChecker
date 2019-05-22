import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

public class MyThread extends Thread {
	
	private static final String ACCESS_TOKEN = "X8BEB7f4jyAAAAAAAAAADJZ3Drq1R1jltor6Kk0giI5nroJFq1HQhNzY7_PGJDYi";	
	
	public void run() {
		
		for (int i = 0; i<2; i++) {
			
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
	        String now = dateFormat.format(new Date());
	        
	        try {
	        	
	        	Robot r = new Robot(); 
	            Rectangle capture =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
	            BufferedImage Image = r.createScreenCapture(capture); 
	            ByteArrayOutputStream os = new ByteArrayOutputStream();
	            ImageIO.write(Image, "jpg", os); 
	            
	            InputStream in = new ByteArrayInputStream(os.toByteArray());
	            DbxRequestConfig config = new DbxRequestConfig("dropbox/java_2019_05_22");
	            DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
	            FileMetadata data = client.files().uploadBuilder("/"+now+".jpg").uploadAndFinish(in);
	            sleep(5000);
	            System.out.println("Файл " + now + " сохранён в DropBox");
	        }
	        
	        catch(IOException | DbxException | InterruptedException | AWTException e){
	        	e.printStackTrace();
	        }
	        
			
		}
		
	}

}
