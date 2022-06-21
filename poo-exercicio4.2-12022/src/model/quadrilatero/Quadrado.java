package model.quadrilatero;

import model.Quadrilatero;

public class Quadrado extends Quadrilatero{
	
	private float lado;
	
	public Quadrado() {
		super();
	}
	
	public Quadrado(float lado) {
		super();
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
		return area = lado * lado;
	}

	@Override
	public float calcPerimetro() {
		return perimetro = 4 * lado;
	}

}
