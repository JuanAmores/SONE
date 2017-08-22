package logica;

public class Alumno extends Persona{
	
	private Curso CursoActual;
	private int Divisi�n;
	private String Turno;
	private Tutor Tutor;
	
	
	public Alumno(String nombre,String apellido, int dni) {
		super(nombre,apellido,dni);
	}
	
	
	public void asignarCurso(Curso c){
		if(CursoActual != null){
			CursoActual.Quitar(this);
		}
		CursoActual = c;
		CursoActual.AgregarAlumno(this);
	}
	
	public Tutor getTutor() {
		return Tutor;
	}

	public void setTutor(Tutor tutor) {
		Tutor = tutor;
	}

	public void setCursoActual(Curso cursoActual) {
		CursoActual = cursoActual;
	}

	public Curso getCursoActual() {
		return CursoActual;
	}

	public int getDivisi�n() {
		return Divisi�n;
	}

	public void setDivisi�n(int divisi�n) {
		Divisi�n = divisi�n;
	}

	public String getTurno() {
		return Turno;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}


}
