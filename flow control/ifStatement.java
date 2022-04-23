package flow control;

import Java.io;

public class ifStatement {

    public static void main(String args[])
    {
        int i = 10;

        /*
          if: if statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not. 

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
    }
}
