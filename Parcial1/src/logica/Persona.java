package logica;
import java.util.Date;

public abstract class Persona {
	protected int peso;
	protected int altura;
	protected Date fechaDeNacimiento;
	
	//getters

	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	//setters
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//Asumimos que después de los 15 la persona no incrementa su estatura
	
	//constructor
	public Persona(int peso, int altura, Date fechaDeNacimiento) {
		this.peso = peso;
		this.altura = altura;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	//metodos abstractos de contrato
	
	public abstract int calcularEdad();
	public abstract int calcularTMB();
}