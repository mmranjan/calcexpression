package test1.test2.test3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *  
 * Class to calculate string mathematical expressions entered from command line
 * 
 * It is assumed that minimum of 2 operands and one operator going to be entered from command line.
 * No spaces between operands and operators, example 12-3+5*4-22/2 
 * The validation check is not currently implemented if  different than these values.
 * Now command line only accepts expression. Individual operands not accepted from command line 
 *
 *	@author 
 */

public class TestCalcClient {
	
	 public static void main(String[] args) {
		 
		 try{
			 
		 System.out.print("Enter expression: "); 
		 
	     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	     String expression = "";
	     expression = reader.readLine();
	            
	     System.out.print("Enter expression: " +expression);
	     
	  		
	     //tokenized to get separate operators and operands from the expression 
	     
		 List<String> operatorList = new ArrayList<String>();
		 List<String> operandList = new ArrayList<String>();
		 StringTokenizer st = new StringTokenizer(expression, "+-*/", true);
		 while (st.hasMoreTokens()) {
		    String token = st.nextToken();

		    if ("+-/*".contains(token)) {
		       operatorList.add(token);
		    } else {
		       operandList.add(token);
		    }
		 }

		 System.out.println("Operators:" + operatorList);
		 System.out.println("Operands:" + operandList);
		
		 CalcExprInt calc = new CalcExprIntImpl();
		 
		// call to check multiplication and division in the expression 
		 
		 calc.checkMulAndDiv(operandList,operatorList);
		 
		 //call to get the final result of the expression 
		 
		 System.out.println("output ::::"+ calc.checkAddAndSub(operandList,operatorList));
	            
		 }catch(Exception e){
			 
			 e.printStackTrace();
		 }
	 }
	 

}
