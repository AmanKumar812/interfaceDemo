
public class Rectangle implements Shape {
	private double width;
	private double length;
	
	

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectanngle");
		

	}

	@Override
	public double getArea() {
		return width*length;
		
		
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	

}
