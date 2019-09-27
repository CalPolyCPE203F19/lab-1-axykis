public class Point 
{
	private double x;
	private double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {return x;}
	public double getY() {return y;}
	public double getRadius() {return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));}
	public double getAngle() {return Math.atan(y/x);}


	public Point rotate90(Point user_point){

		double original_angle = user_point.getAngle();
		double new_angle = original_angle + (Math.PI /2);
		double radius = user_point.getRadius();
		double new_x = radius * Math.cos(new_angle);
		double new_y = radius * Math.sin(new_angle);
		Point rotated_point = new Point(new_x, new_y);

		return rotated_point;
	}




	
	
}
