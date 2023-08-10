
public class Rectangulo implements FiguraGeometrica {
	private String name;
	private double base;
	private double altura;
	// 1.- Constructor
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	} // constructor Rectangulo
	// 2.- Geters y Seteres
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	// 3.- to String
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	//4.- Método calcular Area
	public double calcularArea() {
			return (getBase()*getAltura());
	} // calcularArea
			
	// 5.- Método calcular Perímetro
	public double calcularPerimetro() {
			return (2*(getBase()+getAltura()));
	} // calcularPerimetro
	
} // class Rectangulo
