package model;

public abstract class Triangulo extends Forma{
	
	protected float base;
	protected float altura;
	protected float lado1;
	protected float lado2;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(float base, float altura, float lado1, float lado2) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;

	}
	//Caso triângulo reto
	public Triangulo(float base, float altura, float lado) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado1 = lado;
		this.lado2 = 0f;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
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
		return area = (base * altura)/2;
	}
	@Override
	public float calcPerimetro() {
		return perimetro = this.lado1 + this.lado2 + this.base;
	}
}
