package BlockChain;

import java.security.MessageDigest; //to get access to the SHA256 algorithm. (Cryptography Algo)

public class StringUtil {

//all you need to know is that it takes a string and applies SHA256 algorithm to it, 
//and returns the generated signature as a string.

//	try {
//	    // Code that may throw an exception
//	} catch (ExceptionType e) {
//	    // Code to handle the exception
//	}

	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			// applies SHA-256 to our input
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer(); // hash as hexadecimal

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);// hash is an array (like a list), hexadecimal (base
																	// 16)
				if (hex.length() == 1) // for example 7 it will become 07
					hexString.append('0');
				hexString.append(hex); // this line adds the actual hexadecimal value
			}
			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
