package logica;

public class Alumno extends Persona{
	
	private int Curso;
	private int Divisi�n;
	private String Turno;
	private int DNI_Tutor;
	
	public Alumno(String nombre,String apellido, int dni) {
		super(nombre,apellido,dni);
	}

	public int getCurso() {
		return Curso;
	}

	public void setCurso(int curso) {
		Curso = curso;
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

	public int getDNI_Tutor() {
		return DNI_Tutor;
	}

	public void setDNI_Tutor(int dNI_Tutor) {
		DNI_Tutor = dNI_Tutor;
	}

}
