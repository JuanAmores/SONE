package test;
import logica.Celador;
import logica.Curso;
import logica.Alumno;

public class TestCelador {

	public static void main(String[] args) {
		Celador c1;
		c1 = new Celador("EDGAR", "ROLDAN", 41185839, "celador@celador.com");
		
		c1.crearCurso(1, 1, "Ma�ana");
		c1.crearCurso(2, 2, "Tarde");
		c1.crearCurso(3, 3, "Vespertino");
		
		c1.buscarCurso(3, 3, "Vespertino");
		//c1.crearAlumno("Amilcar", "Britos", "41000999", );
	}

}
