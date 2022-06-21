package model.triangulo;

import model.Triangulo;

public class Isosceles extends Triangulo{

	public Isosceles() {
		super();
	}
	
	public Isosceles(float base, float altura, float lado) {
		super(base, altura, lado, lado);
	}
	
	@Override
	public float calcArea() {
		return area = (base * altura)/2;
	}

	@Override
	public float calcPerimetro() {
		return super.calcPerimetro();
	}

}
