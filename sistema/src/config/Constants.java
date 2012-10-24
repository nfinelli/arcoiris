package config;

public final class Constants {
	
	/**
	 *  Result constants
	 */
	public static final String GENERAL_HOME = "general.home";
	
	public static final String LOGIN_HOME = "login.home";
	
	
	/**
	 * Date
	 */
	public static final String DATE_FORMAT = "dd/mm/yyyy";
	
	/**
	 * MAX CHARACTERS
	 */
	public static final int MAX_EMAIL 	  = 140;
	public static final int MAX_PASSWORD = 12;	// En DB 32 por guardarlo en MD5
	public static final int MAX_NAME 	= 100;
	public static final int MAX_ADDRESS = 140;
	public static final int MAX_GENDER   = 1;
	public static final int MAX_BIRTHDAY = 10;
	public static final int MAX_DESCRIPTION = 140;
	public static final int MAX_TELEPHONE = 50;
	public static final int MAX_WEBSITE = 50;
	public static final int MAX_IMAGE = 150;
	public static final int MIN_NUMBER_RATE = 1;
	public static final int MAX_NUMBER_RATE = 10;
	public static final int MAX_PRICE = 1000000;
	public static final int MAX_COMMENT = 1000;
	
	/**
	 * Session URL security redirect variable
	 */
	public static final String SECURITY_REDIRECT = "securityRedirect";
}
