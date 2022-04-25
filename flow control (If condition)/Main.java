public class Main {
    public static void main(String[] args) {
        
        int i = 10;

        /*
        if: if statement is the most simple decision-making statement. 
        It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not. 

          Syntax: 

           if(condition) 
            {
             // Statements to execute if
             // condition is true
            }

        */


        if (i > 15)
            System.out.println("10 is less than 15");
 
        // This statement will be executed
        // as if considers one statement by default
        System.out.println("I am Not in if");
        System.out.println("\n");

        /*

        2. if-else: The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false. Here comes the else statement. We can use the else statement with if statement to execute a block of code when the condition is false. 

             Syntax: 

                if (condition)
                  {
                   // Executes this block if
                   // condition is true
                  }
                else
                  {
                   // Executes this block if
                   // condition is false
                  }

        */

        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");

        System.out.println("\n");
        
    }
}
