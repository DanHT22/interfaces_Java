
public class Cuadrado implements FiguraGeometrica {
	private String name;
	private double lado;
	//1.Constructor
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	} // constructor
	// 2.Getters y setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	// 3.toString()
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	//4.- Método calcular Area
	public double calcularArea() {
			return (getLado()*getLado());
	} // calcularArea
		
	// 5.- Método calcular Perímetro
	public double calcularPerimetro() {
		return (getLado()* 4);
	} // calcularPerimetro
		
} // clas Cuadrado
	
