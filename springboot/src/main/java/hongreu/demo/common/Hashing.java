package hongreu.demo.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
	public static String getMD5(String data) {
		String hashString = "";
		try {
		    MessageDigest md = MessageDigest.getInstance("MD5"); // or "SHA-1"
		    md.update(data.getBytes());
		    BigInteger hash = new BigInteger(1, md.digest());
		    hashString = hash.toString(16);
		    while (hashString.length() < 32) { // 40 for SHA-1
		    	hashString = "0" + hashString;
		    }
			return hashString;
		} catch(NoSuchAlgorithmException e) {
			
		}
		return hashString;
    }
}
