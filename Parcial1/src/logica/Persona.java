package logica;
import java.time.LocalDate;

public abstract class Persona {
	protected int peso;
	protected int altura;
	protected LocalDate fechaDeNacimiento;
	
	//getters

	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	//setters
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//Asumimos que después de los 15 la persona no incrementa su estatura
	
	//constructor
	public Persona(int peso, int altura, LocalDate fechaDeNacimiento) {
		this.peso = peso;
		this.altura = altura;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	//metodos abstractos de contrato
	
	public abstract int calcularEdad();
	public abstract double calcularTMB() throws Exception;
}