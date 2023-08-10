
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo ("Triángulo t1", 20.0,10.0,15.0);
		Triangulo t2 = new Triangulo ("Triángulo de las Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado ("Cuadrado c1", 127);
		Rectangulo r1 = new Rectangulo ("Rectangulo r1",20.0,7.0);
		Rombo rb1 = new Rombo ("Rombo rb1", 20.0, 25.0, 28.0);
		Romboide rbd1 = new Romboide ("Romboide rbd1", 30.0, 40.0);
		Trapecio tr1 = new Trapecio ("Trapecio tr1", 17.0, 16.0, 20.0,15.0);
		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		imprimirCalculo(rb1);
		imprimirCalculo(rbd1);
		imprimirCalculo(tr1);
		
		
	} //main
	
	public static void imprimirCalculo (FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+===================================+");
		System.out.println("| El área de [" + t.getName() + "] es: " + 
							t.calcularArea() + "\n| El perímetro de [" +
				t.getName() + "] es: " + t.calcularPerimetro() );
		System.out.println("+===================================+");
	} // imprimirCalculo

} // class testFiguras
