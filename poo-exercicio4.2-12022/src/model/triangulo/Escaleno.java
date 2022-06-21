package model.triangulo;

import model.Triangulo;

public class Escaleno extends Triangulo {
	
	private float semiPerimetro;
	
	public Escaleno() {
		super();
	}
	
	public Escaleno(float base, float altura, float lado1, float lado2) {
		super(base, altura, lado1, lado2);
		this.calcularSemiperimetro();
	}
	public Escaleno(float base, float altura, float lado1, float lado2, float semiPerimetro) {
		super(base, altura, lado1, lado2);
		this.semiPerimetro = semiPerimetro;
	}

	public float getSemiPerimetro() {
		return semiPerimetro;
	}

	public void setSemiPerimetro(float semiPerimetro) {
		this.semiPerimetro = semiPerimetro;
	}
	
	public float calcularSemiperimetro() {
		return this.semiPerimetro = super.calcPerimetro()/2;
	}

	@Override
	public float calcArea() {
		if(this.semiPerimetro == 0.0f) {
			this.calcularSemiperimetro();
		}
		return area = (float) Math.sqrt(this.semiPerimetro*(this.semiPerimetro-lado1)*(this.semiPerimetro-lado2)*(this.semiPerimetro-base));
	}

	@Override
	public float calcPerimetro() {
		return super.calcPerimetro();
	}
	

}
