package model.quadrilatero;

import model.Quadrilatero;

public class Paralelogramo extends Quadrilatero{
	
	private float lado;
	
	public Paralelogramo() {
		super();
	}
	
	public Paralelogramo(float base, float altura, float lado) {
		super(base, altura);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calcArea() {
		return super.calcArea();
	}

	@Override
	public float calcPerimetro() {
		return perimetro = 2 * (base + lado);
	}
}
