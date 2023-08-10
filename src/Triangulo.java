
public class Triangulo implements FiguraGeometrica {
	private String name;
	private double base;
	private double altura;
	private double lado;
	
	// 1.- Constructor
	public Triangulo(String name, double base, double altura, double lado) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	} // constructor
	
	// 2.- Getes y Seters
	public String getName() {
		return name;
	} // get Name
	
	public void setName(String name) {
		this.name = name;
	} // set Name
	
	public double getBase() {
		return base;
	} // get Base
	
	public void setBase(double base) {
		this.base = base;
	} // set Base
	
	public double getAltura() {
		return altura;
	} // get Altura
	
	public void setAltura(double altura) {
		this.altura = altura;
	} // set altura
	
	public double getLado() {
		return lado;
	} // get Lado
	
	public void setLado(double lado) {
		this.lado = lado;
	} // set Lado
	
	// 3.- toString
	@Override
	public String toString() {
		return "Triángulo [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	} // to String
	
	//4.- Método calcular Area
	public double calcularArea() {
		return (getBase()*getAltura())/2;
	} // calcularArea
	
	// 5.- Método calcular Perímetro
	public double calcularPerimetro() {
		return (getLado()+ getLado()+getLado());
	} // calcularPerimetro
	

} // class Tiangulo
