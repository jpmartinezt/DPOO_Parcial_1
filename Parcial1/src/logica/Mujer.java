package logica;
import java.time.LocalDate;
import java.time.Period;

public class Mujer extends Persona {

	public Mujer(int peso, int altura, LocalDate fechaDeNacimiento) {
		super(peso, altura, fechaDeNacimiento);
	}

	@Override
	public int calcularEdad() {
		return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	@Override
	public double calcularTMB() {
		double CONSTANTE = 447.593 ;
		return  CONSTANTE + (9.247*this.peso) + (3.098*this.altura) - (4.33*this.calcularEdad());
	}
}

