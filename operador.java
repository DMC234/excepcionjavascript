package operando;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class operador {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager sem1 = new ScriptEngineManager();
		ScriptEngine se1 = sem1.getEngineByName("JavaScript");
		
		String condicion = "5<10";
		boolean resultado = (Boolean)se1.eval(condicion);
		if(resultado) {
			System.out.println("5 es menor que 10");
		}else {
			System.out.print("5 no es menor que 10");
		}
	}
}
