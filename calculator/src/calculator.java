import java.util.*;

public class calculator {

    public static void main(String[] args) throws Exception {
        /*ini scanner */
        Scanner userInput = new Scanner(System.in);
        /*init unit */
        double numOne;
        double numTwo;
        double result = 0;
        char operator;
        String input; 

        while(true){

        System.out.println("Welcome. Choose your operator: ( /, *, +, -)");
        operator = userInput.next().charAt(0);
         System.out.println("First number");
        numOne = userInput.nextDouble();
        System.out.println("Second number:");
        numTwo = userInput.nextDouble();
        
            /*Operators */
            if(operator == '*'){
                 result = (numOne*numTwo);
                 }else if (operator == '/'){
                        if (numTwo == 0){
                        userInput.close();
                        throw new Exception("You can't divide by 0!");
                     
                        }else {
                        result = (numOne/numTwo);
                        }
            }else if (operator == '+'){
                 result = (numOne+numTwo);
            }else if (operator == '-'){
                 result = (numOne-numTwo);
            }else {
                System.out.println("Error!");
            }

            /*dec casting */
            if ( result %1 == 0) {
            System.out.println( "The result is " + (int)result + "!");
                } else {

                 System.out.println( "The result is " + result + "!");
                 }
       
                System.out.println("Would you like to go again?(y/n)");
                 input = userInput.next();
                if(input.equalsIgnoreCase("n")){
                    System.out.println("Goodbye!");
                    userInput.close();
                    break;
                    
                }
        
}
    }
    
    
}

