package net.bigmir.venzor;

public class Triangle {
	private String name;
	private double side1;
	private double side2;
	private double side3;
	private double area = 0;

	public Triangle(String name, double side1, double side2, double side3) {
		super();
		this.name = name;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {
		super();
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getArea() {
		return area;
	}

	public boolean exist() {
		boolean f = false;
		if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side3 + side2) > side1) {
			f = true;
		}
		return f;
	}

	public double area() {
		double p = (side1 + side2 + side3) / 2;
		area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;
	}

	public void print() {
		System.out.print("Ńňîđîíű ňđĺóăîëüíčęŕ "+name+": ");
		System.out.print(side1 + "; ");
		System.out.print(side2 + "; ");
		System.out.println(side3 + ".");

	}

	public void output() {
		if (exist()) {
			area();
			print();
			System.out.println("Площадь треугольника " + name + " = " + String.format("%.3f.", area));
		} else {
			print();
			System.out.println("Такого треугольника не существует.");
		}
	}

}
