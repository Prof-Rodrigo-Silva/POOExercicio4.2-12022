package model.triangulo;

import model.Triangulo;

public class Equilatero extends Triangulo{
	
	public Equilatero() {
		super();
	}
	
	public Equilatero(float base, float altura) {
		super(base, altura, base, base);
	}

	@Override
	public float calcArea() {
		return area = (float) ((lado1*lado1 * Math.sqrt(3))/4);
	}

	@Override
	public float calcPerimetro() {
		return super.calcPerimetro();
	}

}
