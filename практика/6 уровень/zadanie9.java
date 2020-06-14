import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.*;


public class zadanie9 {
	public static void main(String[] args) throws ScriptException {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in formula: ");
		String inputFormula = input.nextLine();
		System.out.println(formula(inputFormula));
	}


	public static boolean formula(String input) throws ScriptException {
		ScriptEngineManager mgr = new ScriptEngineManager();
    	ScriptEngine engine = mgr.getEngineByName("JavaScript");
    	ArrayList<String> formulas = new ArrayList<>(Arrays.asList(input.split("=")));
    	double result1;
    	double result2;
    	for (int i = 0; i < formulas.size() - 1; i++) {
    		result1 = Double.parseDouble(engine.eval(formulas.get(i)).toString());
    		result2 = Double.parseDouble(engine.eval(formulas.get(i + 1)).toString());
    		if (result1 != result2) return false;
    	}
    	return true;
	}
}
