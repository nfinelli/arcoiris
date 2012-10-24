package util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import config.Constants;


public class ValidationUtils {

	/**
	 * Validates email
	 * @param email the email to validate
	 * @return true if is OK
	 */
	public static boolean isEmail(String email, boolean required) {
		if (required){
			if (email == null || email.equals("")) {
				return false;
			}
		}
		if (email != null && !email.equals("") && (!email.matches(".+@.+\\.[a-z]+") || email.length() > Constants.MAX_EMAIL)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Validates coordinates
	 * @param coordinates the Coordinates to validate
	 * @return true if is OK
	 */
	public static boolean isCoordinates(String coordinates, boolean required) {
		if (required){
			if (coordinates == null || coordinates.equals("")) {
				return false;
			}
		}
		if (coordinates != null && (coordinates.equals("") || coordinates.split(",").length < 2)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Validates password
	 * @return the password to validate
	 */
	public static boolean isPassword(String password) {
		if (password == null || password.equals("") || password.length() < 6 || password.length() > 12 || password.length() > Constants.MAX_PASSWORD) {
			return false;
		}
		return true;
	}
	
	/**
	 * Validates name
	 * @return the name to validate
	 */
	public static boolean isName(String name) {
		if (name == null || name.equals("") || name.length() > Constants.MAX_NAME) {
			return false;
		}
		return true;
	}
	
	/**
	 * Validate description
	 * @param description to validate
	 * @param required is true if description is required
	 * @return
	 */
	public static boolean isDescription(String description, boolean required) {

		if (required){
			if (description == null || description.equals("")) {
				return false;
			}
		}
		if (description != null && description.length() > Constants.MAX_DESCRIPTION){
			return false;
		}
		return true;
	}
	
	/**
	 * Validate address
	 * @param address to validate
	 * @param required is true if address is required 
	 * @return
	 */
	public static boolean isAddress(String address, boolean required) {

		if (required){
			if (address == null || address.equals("")) {
				return false;
			}
		}
		if (address != null && address.length() > Constants.MAX_ADDRESS){
			return false;
		}
		return true;
	}
	
	/**
	 * Validate website
	 * @param website
	 * @param required
	 * @return
	 */
	public static boolean isWebsite(String website, boolean required) {

		if (required){
			if (website == null || website.equals("")) {
				return false;
			}
		}
		if (website != null && website.length() > Constants.MAX_WEBSITE){
			return false;
		}
		return true;
	}
	
	/**
	 * Validate image
	 * @param image
	 * @param required
	 * @return
	 */
	public static boolean isImage(File image, boolean required) {

		if (required){
			if (image == null || image.getName().equals("")) {
				return false;
			}
		}
		if (image != null && image.getName().length() > Constants.MAX_IMAGE){
			return false;
		}
		return true;
	}
	
	/**
	 * Validate telephone
	 * @param telephone to validate
	 * @param required is true if telephone is required 
	 * @return
	 */
	public static boolean isTelephone(String telephone, boolean required) {

		if (required){
			if (telephone == null || telephone.equals("")) {
				return false;
			}
		}
		if (telephone != null && telephone.length() > Constants.MAX_TELEPHONE){
			return false;
		}
		return true;
	}
	
	/**
	 * Validate gender
	 * @param gender to validate
	 * @return
	 */
	public static boolean isGender(String gender) {
		if (gender != null && gender.length() > Constants.MAX_GENDER) {
			return false;
		}
		return true;
	}

	/**
	 * Validate date
	 * @param date to validate
	 * @return
	 */
	public static boolean isDate(String date) {
		try {
			if (date != null && !date.equals("")) {
		    	SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT);
		    	sdf.parse(date);
			} else {
				return false;
			}
		} catch (ParseException pe) {
			return false;
		}
		return true;
	}
	
	/**
	 * Validate rate
	 * @param rate to validate
	 * @param required
	 * @return
	 */
	public static boolean isRate(Integer rate, boolean required) {
		if (required){
			if (rate == null || rate.equals("")) {
				return false;
			}
		}
		if (rate != null && (rate < Constants.MIN_NUMBER_RATE || rate > Constants.MAX_NUMBER_RATE)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Validate price
	 * @param price to validate
	 * @param required
	 * @return
	 */
	public static boolean isPrice(Float price, boolean required) {
		if (required){
			if (price == null || price.equals("")) {
				return false;
			}
		}
		if (price != null && price > Constants.MAX_PRICE) {
			return false;
		}
		return true;
	}	
	
	/**
	 * Validate price
	 * @param price to validate
	 * @param required
	 * @return
	 */
	public static boolean isComment(String comment, boolean required) {
		if (required){
			if (comment == null || comment.equals("")) {
				return false;
			}
		}
		if (comment != null && (comment.length() > Constants.MAX_COMMENT)) {
			return false;
		}
		return true;
	}	
}
