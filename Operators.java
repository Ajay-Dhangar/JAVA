
public class Operators {
	public static void main(String[] args)
	{
		int a = 20, b = 10, c = 30, n = 4, m = 20;

        int Sum, Mul, Div, Sub, Mod;


        /* 
        
        1. Arithmetic Operators: They are used to perform simple arithmetic operations on primitive data types. 

         * : Multiplication
         / : Division
         % : Modulo
         + : Addition
         – : Subtraction 
         
        */
        
        Sum = a+b;
        Sub = a-b;
        Mul = a*b;
        Div = c/b;
        Mod = a%b;
    
        System.out.println("1. Arithmetic Operators:\n");
        System.out.println("Sum = a + b = "+Sum);
        System.out.println("Mul = a x b = "+Mul);
        System.out.println("Sub = a - b = "+Sub);
        System.out.println("Div = a / b = "+Div);
        System.out.println("Mod = a % b = "+Mod);
        System.out.println("\n-------------------------");


        /*   
        
        2. Unary Operators: Unary operators need only one operand. They are used to increment, decrement or negate a value. 

        – : Unary minus, used for negating the values.
        + : Unary plus indicates the positive value (numbers are positive without this, however). It performs an automatic conversion to int when the type of its operand is the byte, char, or short. This is called unary numeric promotion.
       ++ : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators. 
                Post-Increment: Value is first used for computing the result and then incremented.
                Pre-Increment: Value is incremented first, and then the result is computed.
       — : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators. 
                Post-decrement: Value is first used for computing the result and then decremented.
                Pre-Decrement: Value is decremented first, and then the result is computed.
       ! : Logical not operator, used for inverting a boolean value.
        
        */

        System.out.println("2. Unary Operators:\n");

       m++;   

       System.out.println("m++ = "+m);    //prints 21 
      
       ++m;                 
 
       System.out.println("++a = "+m);    //prints 22 
 
       System.out.println("++m ="+ ++m);      //prints 23 
 
       System.out.println("m++ = "+m++);     //prints 23 
 
       System.out.println("m = "+m);     //prints 24 

       System.out.println("\n-------------------------");

        /* 
        
        3. Assignment Operator: ‘=’ Assignment operator is used to assign a value to any variable. It has a right to left associativity, i.e. value given on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant. 

                 The general format of the assignment operator is:

                 variable = value;
                     
         In many cases, the assignment operator can be combined with other operators to build a shorter version of the statement called a Compound Statement. For example, instead of a = a+5, we can write a += 5. 

           +=, for adding left operand with right operand and then assigning it to the variable on the left.
           -=, for subtracting right operand from left operand and then assigning it to the variable on the left.
           *=, for multiplying left operand with right operand and then assigning it to the variable on the left.
           /=, for dividing left operand by right operand and then assigning it to the variable on the left.
           %=, for assigning modulo of left operand by right operand and then assigning it to the variable on the left.
        
        */


        System.out.println("3. Assignment Operator:\n");


        int var;

       // assign value using =
       var = n;
       System.out.println("var using =: " + var);

       // assign value using =+
       var += n;
       System.out.println("var using +=: " + var);

       // assign value using =*
       var *= n;
       System.out.println("var using *=: " + var);

       System.out.println("\n-------------------------");

        /*
        
        4. Relational Operators: These operators are used to check for relations like equality, greater than, less than. They return boolean results after the comparison and are extensively used in looping statements as well as conditional if-else statements. The general format is, 

             variable relation_operator value
         
             Some of the relational operators are- 
                ==, Equal to: returns true if the left-hand side is equal to the right-hand side.
                !=, Not Equal to: returns true if the left-hand side is not equal to the right-hand side.
                 <, less than: returns true if the left-hand side is less than the right-hand side.
                <=, less than or equal to returns true if the left-hand side is less than or equal to the right-hand side.
                 >, Greater than: returns true if the left-hand side is greater than the right-hand side.
                >=, Greater than or equal to: returns true if the left-hand side is greater than or equal to the right-hand side.

        */

        System.out.println("4. Relational Operators:\n");

        int i = 10;
		int j = 20;

		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);

        System.out.println(new Data1() == new Data1());
		System.out.println(new Data1() != new Data1());

        System.out.println("\n-------------------------");

        /*

         5. Logical Operators: These operators are used to perform “logical AND” and “logical OR” operations, i.e., the function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e., it has a short-circuiting effect. Used extensively to test for several conditions for making a decision. Java also have “Logical NOT”, it returns true when condition is false and vice-versa

            Conditional operators are:

               &&, Logical AND: returns true when both conditions are true.
               ||, Logical OR: returns true if at least one condition is true.
               ! , Logical NOT: returns true when condition is false and vice-versa

        */

        System.out.println("5. Logical Operators:\n");

        // && operator
       System.out.println((5 > 3) && (8 > 5));  // true
       System.out.println((5 > 3) && (8 < 5));  // false

       // || operator
      System.out.println((5 < 3) || (8 > 5));  // trues
      System.out.println((5 < 3) || (8 < 5));  // false

      // ! operator
      System.out.println(!(5 == 3));  // true
      System.out.println(!(5 > 3));  // false



        System.out.println("\n-------------------------");

        /*

         6. Ternary operator: Ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name ternary.

T           he general format is:

            condition ? if true : if false
            The above statement means that if the condition evaluates to true,
            then execute the statements after the ‘?’ else execute the statements after the ‘:.’

        */

        System.out.println("6. Ternary operator:\n");

        int x, y;  
        x = 20;  
        y = (x == 1) ? 61: 90;  
       System.out.println("Value of y is: " +  y);  
       y = (x == 20) ? 61: 90;  
       System.out.println("Value of y is: " + y);  

	}
}
class Data1 {
}
