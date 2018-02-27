
public class Geometry {
	//Methods
	public double sVolume(double radius){
		double last = 1.3333333333333333 * Math.PI * Math.pow(radius, 3);
		return last;
	}
	
	public double sSurface(double radius){
		double last = 4*Math.PI*radius*radius;
		return last;
	}
	
	public double cyVolume(double radius, double height){
		double last = height * Math.PI * radius * radius;
		return last;
	}
	
	public double cySurface(double radius, double height){
		double last = 2 * Math.PI * radius * radius + 2 * Math.PI * height * radius;
		return last;
	}
	
	public double cVolume(double radius, double height){
		double last = 0.333333 * Math.PI * Math.pow(radius, 2) * height;
		return last;
	}
	
	public double cSurface(double radius, double height){
		double last = Math.PI * radius * (height + radius);
		return last;
	}
	
	public double pointDistance(double x1, double y1, double x2, double y2) {
		double dist = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		return dist;
	}
	
}
