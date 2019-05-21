
import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.image.BufferedImage;
import java.io.*;

public class Main {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		CoffeMachine c = new CoffeMachine();
		System.out.println(c.title);
		System.out.println(c.whatCanYouBuy());
		
        //=============================================
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String now = dateFormat.format(new Date());
        
        DateParts d = new DateParts();
        String dateNow = d.year+d.month+d.day+"_"+d.hours+d.minutes+d.seconds;    //yyyyMMdd_HHmmss format   
        System.out.println(dateNow);
       
        
        //=============================================
        
        Screen s = new Screen();
        System.out.println(s.getScreenResolution());
        s.getScreenSNapshot();
        
        //BufferedImage image; //Посмотреть в гугле, как получить скриншот экрана, распечатать его размеры
        //image.getWidth();
        //image.getHeight();
        
        //Пишете все три кода в IntelliJIdea, скриншот отправляете
        // в телеграм-чат с хэш-тэгом #люблюджаву
	}

}
