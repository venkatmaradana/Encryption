import com.sun.xml.internal.messaging.saaj.util.Base64;




public class SHAEncryption {
	
	public static void main(String arg[]) throws Exception {
	    System.out.println(encrypt("String"));
	  }

	  public static byte[] encrypt(String x) throws Exception {
	    java.security.MessageDigest d = null;
	    d = java.security.MessageDigest.getInstance("SHA-1");
	    d.reset();
	    d.update(x.getBytes());
	    System.out.println(d.digest(x.getBytes()));
	    Base64.encode(d.digest(x.getBytes()));
	    //return d.digest();
	    return Base64.encode(d.digest(x.getBytes()));
	  }

}
