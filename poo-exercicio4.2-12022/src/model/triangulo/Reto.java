package model.triangulo;

import model.Triangulo;

public class Reto extends Triangulo{
	
	public Reto() {
		super();
	}
	
	public Reto(float base, float altura, float lado) {
		super(base, altura, lado);
	}
	@Override
	public float calcArea() {
		return super.calcArea();
	}

	@Override
	public float calcPerimetro() {
		return perimetro = base+altura+lado1;
	}

}
