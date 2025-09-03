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
	public double calcularTMB() throws Exception{
		int edad = this.calcularEdad();
		if ((40 <= peso && peso <= 80) && (140 <= altura && altura <= 180) && (edad > 15)) {
			double CONSTANTE = 447.593 ;
			return  CONSTANTE + (9.247*this.peso) + (3.098*this.altura) - (4.33*edad);
		}
		else {
			throw new Exception("Alguno de los parámetros de peso, altura o edad no están en el rango acordado");
		}
	}
}

