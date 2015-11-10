package nexon;

import static java.lang.Math.sqrt;

public class Vector {
	private Double x;
	private Double y;
	private Double z;

	public static Vector crossProduct(Vector v1, Vector v2) {
		Vector ans = new Vector();
		ans.setX(v1.getX() * v2.getZ() - v1.getZ() * v2.getY());
		ans.setY(v1.getZ() * v2.getX() - v1.getX() * v2.getZ());
		ans.setZ(v1.getX()*v2.getY() - v1.getY()*v2.getX());
		return ans;
	}

	public static Double getVectorSize(Vector vector) {
		return sqrt(vector.getX()*vector.getX() + vector.getY()*vector.getY() + vector.getZ()*vector.getZ());
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}
}
