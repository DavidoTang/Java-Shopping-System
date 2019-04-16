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
    private SecurityQuestion myQuestion;

    
    public LoginCredentials(String username, String pass, SecurityQuestion myQuestion) throws NoSuchAlgorithmException {
        this.username = username;
        setPass(pass);
        this.myQuestion = myQuestion;
    }
    //Use if entering an already hashed password
    public LoginCredentials(String username, String pass) throws NoSuchAlgorithmException {
        this.username = username;
        this.pass = pass;
    }
    public LoginCredentials() {
        myQuestion = null;
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
    
    /*
    //REMOVE AFTER TESTING
    public String getPass()
    {
        return pass;        //Returns a hashed password
    }
    */
    
    public boolean checkPassword(String password) throws NoSuchAlgorithmException{
        String hashedPass = sha256Hash(password);
        System.out.println("Checking: " + hashedPass);
        System.out.println("Correct is: " + pass);
        if(hashedPass.equals(pass)) {
            return true;
        }
        
        return false;
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
        //System.out.println("String: " + hashedPassword);
        
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
    public SecurityQuestion getSecurityQuestions() {
        return myQuestion;
    }

    /**
     * @param securityQuestions the securityQuestions to set
     */
    public void setSecurityQuestions(SecurityQuestion myQuestion) {
        this.myQuestion = myQuestion;
    }
    
    
    
}
