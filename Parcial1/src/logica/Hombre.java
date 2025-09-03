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
	public double calcularTMB() throws Exception{
		int edad = this.calcularEdad();
		if ((60 <= peso && peso <= 110) && (160 <= altura && altura <= 195) && (edad > 15)) {
			double CONSTANTE = 88.362;
			return  CONSTANTE + (13.397*this.peso) + (4.799 *this.altura) - (5.677*edad);
		}
		else {
			throw new Exception("Alguno de los parámetros de peso, altura o edad no están en el rango acordado");
		}
	}
}
