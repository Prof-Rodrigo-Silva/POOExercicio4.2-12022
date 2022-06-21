package classe.executavel;

import model.quadrilatero.Losango;
import model.quadrilatero.Paralelogramo;
import model.quadrilatero.Quadrado;
import model.quadrilatero.Retangulo;
import model.quadrilatero.Trapezio;
import model.triangulo.Equilatero;
import model.triangulo.Escaleno;
import model.triangulo.Isosceles;
import model.triangulo.Reto;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		System.out.println("#### QUADRILÁTEROS ###");
		
		Losango losango = new Losango(12,9,8);
		System.out.println("Área Losango: "+losango.calcArea());
		System.out.println("Perímetro Losango: "+losango.calcPerimetro());
		System.out.println("-------------------------------------------");
		Paralelogramo paralelogramo = new Paralelogramo(30,10,15);
		System.out.println("Área Paralelogramo: "+paralelogramo.calcArea());
		System.out.println("Perímentro Paralelogramo: "+paralelogramo.calcPerimetro());
		System.out.println("-------------------------------------------");
		Quadrado quadrado = new Quadrado(3);
		System.out.println("Área Quadrado: "+quadrado.calcArea());
		System.out.println("Perímentro Quadrado: "+quadrado.calcPerimetro());
		System.out.println("-------------------------------------------");
		Retangulo retangulo = new Retangulo(6,4);
		System.out.println("Área Retângulo: "+retangulo.calcArea());
		System.out.println("Perímentro Retângulo: "+retangulo.calcPerimetro());
		System.out.println("-------------------------------------------");
		Trapezio trapezio = new Trapezio(10,2.5f,5,3,3);
		System.out.println("Área Trapézio: "+trapezio.calcArea());
		System.out.println("Perímentro Trapézio: "+trapezio.calcPerimetro());
		System.out.println("-------------------------------------------");
		
		System.out.println("#### TRIÂNGULOS ####");
		Equilatero equilatero = new Equilatero(3,4);
		System.out.println("Área Equilátero: "+equilatero.calcArea());
		System.out.println("Perímentro Equilátero: "+equilatero.calcPerimetro());
		System.out.println("-------------------------------------------");
		Escaleno escaleno = new Escaleno(8,4,5,7);
		System.out.println("Área Escaleno: "+escaleno.calcArea());
		System.out.println("Perímentro Escaleno: "+escaleno.calcPerimetro());
		System.out.println("-------------------------------------------");
		Isosceles isosceles = new Isosceles(3,3.5f,4);
		System.out.println("Área Isósceles: "+isosceles.calcArea());
		System.out.println("Perímentro Isósceles: "+isosceles.calcPerimetro());
		System.out.println("-------------------------------------------");
		Reto reto = new Reto(4,3,5);
		System.out.println("Área Reto: "+reto.calcArea());
		System.out.println("Perímentro Reto: "+reto.calcPerimetro());
		System.out.println("-------------------------------------------");
		
		

	}

}
