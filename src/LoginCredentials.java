/**
 *
 * @author Dave
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.ArrayList;
public class LoginCredentials {
    
    private String username;
    private String pass;
    private List<SecurityQuestion> securityQuestions = new ArrayList<SecurityQuestion>(2);

    
    public LoginCredentials(String username, String pass, ArrayList<SecurityQuestion> securityQuestions) throws NoSuchAlgorithmException {
        this.username = username;
        setPass(pass);
        this.securityQuestions = securityQuestions;
    }
    public LoginCredentials(String username, String pass) throws NoSuchAlgorithmException {
        this.username = username;
        setPass(pass);
    }
    public LoginCredentials() {
        securityQuestions = null;
    }
    
    
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPass()
    {
        return pass;        //Returns a hashed password
    }
    

    /**
     *********************** Commented out because outside classes don't need to know the password... @Dave
     */
//    public String getPass() {
//        return pass;
//    }

    /**
     ******Takes the user password and hashes it with SHA-256, then stores the hash
     */
    public void setPass(String pass) throws NoSuchAlgorithmException {
        this.pass = sha256Hash(pass);
        pass = "";          //IDK if erasing the actual password here increases security, yolo @Dave
    }
    
    private static String sha256Hash(String pass) throws NoSuchAlgorithmException {
        
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = algorithm.digest(pass.getBytes(StandardCharsets.UTF_8));
        
        String hashedPassword = bytesToHex(encodedhash);
        System.out.println("String: " + hashedPassword);
        
        return hashedPassword;
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
}
    
    /**
     * @return the securityQuestions
     */
    public List<SecurityQuestion> getSecurityQuestions() {
        return securityQuestions;
    }

    /**
     * @param securityQuestions the securityQuestions to set
     */
    public void setSecurityQuestions(List<SecurityQuestion> securityQuestions) {
        this.securityQuestions = securityQuestions;
    }
    
    
    
}
