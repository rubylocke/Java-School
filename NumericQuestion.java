/**
 * Question.NumericQuestion subclass
 * 
 * Ruby-Anne Locke, July 15, 2016, rubylocke@hotmail.com
 */
public class NumericQuestion extends Question
 { 
    private double answer; 
 
    // set the correct answer
    public void setAnswer(double correctResponse)
    { 
        answer = correctResponse; 
    } 
 
    // checks the answer
    public boolean checkAnswer(String response) 
    { 
        double responseDouble = Double.parseDouble(response); 
        
        //   Testing 19.99 and 19.999
        // System.out.println(" responsbileDouble " + responseDouble);    
        // System.out.println(" answersubtraction " + (responseDouble - answer));  
        // System.out.println(" amath.abs " + Math.abs(responseDouble - answer));  
        
        return Math.abs(responseDouble - answer) <= 0.01; 
    }
    
    // returns the answer to be shown
    public double getResult()
    { 
        return answer;
    }
}