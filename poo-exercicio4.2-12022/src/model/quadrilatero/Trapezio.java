package model.quadrilatero;

import model.Quadrilatero;

public class Trapezio extends Quadrilatero{
	
	private float baseMenor;
	private float lado1;
	private float lado2;
	
	public Trapezio() {
		super();
	}
	
	public Trapezio(float base, float altura,float baseMenor, float lado1, float lado2){
		super(base,altura);
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	@Override
	public float calcArea() {
		return area = ((base + this.baseMenor) * altura) / 2;
	}

	@Override
	public float calcPerimetro() {
		return perimetro = base + this.baseMenor + this.lado1 + this.lado2;
	}
	

}
