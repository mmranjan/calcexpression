package test1.test2.test3;

import java.util.List;

/**
 * implementation for CalcExprInt
 * @author 
 *
 */
public class CalcExprIntImpl implements CalcExprInt{
	
	/**
	 * operation responsible for multiplying and dividing elements in the list
	 * @param operands 
	 * @param operators
	 */
	
	public void checkMulAndDiv(List<String> operands , List<String> operators ){
		
             
        for(int i=0;i<operators.size();i++){            
        if(operators.get(i).equals("/")){
        	operands.set(i,""+(Integer.parseInt(operands.get(i))/Integer.parseInt(operands.get(i+1))) );
            operators.remove(i);
            operands.remove(i+1);
            i--;
        }
        else if(operators.get(i).equals("*")){
        	operands.set(i,""+(Integer.parseInt(operands.get(i))*Integer.parseInt(operands.get(i+1))) );
            operators.remove(i);
            operands.remove(i+1);
            i--;
        }
        }
	}
	
	/**
	 * operation responsible for 
	 * adding all elements in the list
	 * @param operands 
	 * @param operators
	 * @return int
	 */
	
	public int checkAddAndSub(List<String> operands , List<String> operators ){
		
		int result =0;		
        for(int i=0;i<operators.size();i++){
            if(operators.get(i).equals("+")){
            	
            	if(i==0){
            		result =Integer.parseInt(operands.get(i))+Integer.parseInt(operands.get(i+1));
            		
            	}
            	
            	else{
            		
            		result = result + Integer.parseInt(operands.get(i+1));
            		 
            	}
                       
           
        }
        else if(operators.get(i).equals("-")){
        	if(i==0){
        		result =Integer.parseInt(operands.get(i))-Integer.parseInt(operands.get(i+1));
        		
        		
        	}
        	
        	else{
        		
        		result = result - Integer.parseInt(operands.get(i+1));
        		
        	}
        }
      }
        return result;
    }

}
