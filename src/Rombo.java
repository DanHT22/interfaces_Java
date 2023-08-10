
public class Rombo implements FiguraGeometrica {
	private String name;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	//1.- Constructor
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}
	// 2.- Geters y seters
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
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	//3.- to String
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
	//4.- Método calcular Area
		public double calcularArea() {
				return ((getDiagonalMayor()*getDiagonalMenor())/2);
		} // calcularArea
				
	// 5.- Método calcular Perímetro
		public double calcularPerimetro() {
				return (getLado()*getLado());
		} // calcularPerimetro

} // class Rombo
