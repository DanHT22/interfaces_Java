
public class Trapecio implements FiguraGeometrica {
	private String name;
	private double lado;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	//1.- Constructor
	public Trapecio(String name, double lado, double baseMayor, double baseMenor, double altura) {
		super();
		this.name = name;
		this.lado = lado;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	//2.- Geters y Seters
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
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//3.- to String
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado=" + lado + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor
				+ ", altura=" + altura + "]";
	}
	//4.- Método calcular Area
	public double calcularArea() {
			return (((getBaseMenor()+getBaseMayor())*getAltura())/2);
	} // calcularArea
			
	// 5.- Método calcular Perímetro
	public double calcularPerimetro() {
			return (getLado()+getLado()+getBaseMenor()+getBaseMayor());
	} // calcularPerimetro
	
}
