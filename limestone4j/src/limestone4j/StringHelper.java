package limestone4j;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class StringHelper {
	
	 /**
	 * @param phoneNumber
	 * @return eg: input is 0747177352 then output will be (074) 717 7352
	 * @throws ParseException
	 */
	public static String formatePhoneNumber(String phoneNumber) throws ParseException {
	        MaskFormatter phone = new MaskFormatter("(###) ### ####");
	        phone.setValueContainsLiteralCharacters(false);
	        String formattedPhoneNumber = phone.valueToString(phoneNumber);
	        return formattedPhoneNumber;
	    }
	/**
	 * @param day
	 * @return eg: input is 2 then output will be 2nd
	 * @throws ParseException
	 */
	public static String getDateSuffix(int day) {

	        String[] suffixes =
	                // 0 1 2 3 4 5 6 7 8 9
	                {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th",
	                        // 10 11 12 13 14 15 16 17 18 19
	                        "th", "th", "th", "th", "th", "th", "th", "th", "th", "th",
	                        // 20 21 22 23 24 25 26 27 28 29
	                        "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th",
	                        // 30 31
	                        "th", "st"};

	        return day + suffixes[day] ;
	    }
}
