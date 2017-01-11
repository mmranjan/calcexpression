package test1.test2.test3;

import java.util.List;

/**
 * interface responsible for mathematical expression calculation
 * @author shubham
 *
 */

public interface CalcExprInt {
	
	public void checkMulAndDiv(List<String> operands , List<String> operators );
	
	public int checkAddAndSub(List<String> operands , List<String> operators );
	

}
