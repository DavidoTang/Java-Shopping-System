/**
 *
 * @author Dave
 */
public class SecurityQuestion {
    
    private String question;
    private String answer;

    public SecurityQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    //Checks if the answer to the security problem is correct.  Returns True is it is.
    public boolean checkAnswer(String answerInput) {
      
        if (answerInput.equals(answer)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * ****************************I commented out the getAnswer because that seems like a security threat
     */
//    public String getAnswer() {
//        return answer;
//    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
    
}
