package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurityUtils {
	
	/**
	 * Transform a string into a sha-1 hash
	 * @param message to convert
	 * @return message with sha-1 hash
	 */
	public static String toSha1(String message) {
		byte[] sha1Result = null;
		try {			
		    byte[] msg = message.getBytes();
		    MessageDigest sha1 = MessageDigest.getInstance("SHA1");
		    sha1.reset();
		    sha1.update(msg);
		    sha1Result = sha1.digest();		    
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	    return toHexadecimal(sha1Result);
	}
	
    /***
     * Turns a byte array into string using hexa values
     * @param byte array to convert
     * @return string
     */
    private static String toHexadecimal(byte[] digest){
        String hash = "";
        for(byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) hash += "0";
            hash += Integer.toHexString(b);
        }
        return hash;
    }
}
