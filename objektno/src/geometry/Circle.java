package geometry;

public class Circle {
	
	private int radius;
	private Point center;
	private boolean selected;
	
    public Circle () {
		
	}
	
	public Circle (int radius, Point center) {
		
		this.radius = radius;
		this.center = center;
	}
	
	public Circle (int radius, Point center, boolean selected) {
		this(radius,center);
		this.selected = selected;
	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
