import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateParts {
	
	Calendar myCal = new GregorianCalendar();

	String year = Integer.toString(myCal.get(Calendar.YEAR));
	String month = Integer.toString(myCal.get(Calendar.MONTH));
	String day = Integer.toString(myCal.get(Calendar.DAY_OF_MONTH));
	String hours = Integer.toString(myCal.get(Calendar.HOUR_OF_DAY));
	String minutes = Integer.toString(myCal.get(Calendar.MINUTE));
	String seconds = Integer.toString(myCal.get(Calendar.SECOND));
	
}


