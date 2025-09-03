package logica;
import java.time.LocalDate;
import java.time.Period;

public class Hombre extends Persona {
	public Hombre(int peso, int altura, LocalDate fechaDeNacimiento) {
		super(peso, altura, fechaDeNacimiento);
	}
	
	@Override
	public int calcularEdad() {
		return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	@Override
	public double calcularTMB() {
		double CONSTANTE = 88.362;
		return  CONSTANTE + (13.397*this.peso) + (4.799*this.altura) - (5.677*this.calcularEdad());
	}
}
