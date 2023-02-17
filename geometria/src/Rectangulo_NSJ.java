/**
 * Clase Rectangulo_NSJ que contiene calculo de área y perímetro
 * @see Extriende de FiguraGeométrica_NSJ
 * 
 * @author Nuria Sánchez Jordán
 * @version 1.2
 *
 */
public class Rectangulo_NSJ extends FiguraGeometrica_NSJ {
	private double l1;
	private double l2;
	
	
	/**
	 * Constructor
	 * @param tipoFigura
	 * @param lG lado G
	 * @param lP lado P
	 */
	public Rectangulo_NSJ(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Mide el área
	 * @return el cálculo del área
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Mide el perímetro
	 * @return el cálculo del perímetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
