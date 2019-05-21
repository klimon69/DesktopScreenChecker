import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;

public class CoffeMachine {

	static String title = "Кофе-машина";
	static String goodRes = "";
	static String badRes = "Вы не можете купить ничего. Недостаточно средствd";
    static int moneyAmount = 120;
    static int canBuyAnything = 0;
    static String[] drinks = {"эспрессо", "капучино", "вода"};
    static ArrayList<String> drinksRes = new ArrayList<String>();
    static int[] drinkPrices = {80, 150, 20};

    public static String whatCanYouBuy()
    {
	    for(int i = 0; i < drinks.length; i = i + 1)
	    {
	        if(moneyAmount >= drinkPrices[i])
	        {
	        	canBuyAnything++;
	        	drinksRes.add(drinks[i]); 
	        }
	    }
	    
	    if (canBuyAnything == 0)
	    {
	    	return badRes;
	    }
	    else
	    {
	    	for(int i = 0; i < drinksRes.size(); i = i + 1)
		    {	
	    		
	    		goodRes = goodRes + drinksRes.get(i) + ", ";
		    }
	    	
	    	String goodRes1 = goodRes.substring(0, goodRes.length() - 2) + "!";	    	
	    	return "Вы можете купить: " + goodRes1;
	    }
    }
}
