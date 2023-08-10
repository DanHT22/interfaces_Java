
public class Romboide implements FiguraGeometrica {
	private String name;
	private double base;
	private double altura;
	// 1.- Constructor
	public Romboide(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	// 2.- geters y seters
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
		return "Romboide [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	//4.- Método calcular Area
	public double calcularArea() {
			return (getBase()+getAltura())*2;
	} // calcularArea
		
	// 5.- Método calcular Perímetro
	public double calcularPerimetro() {
			return (getBase()*getAltura());
	} // calcularPerimetro
	
} // class Romboide
