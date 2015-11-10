package nexon;

public class Magnetic {
	private Double permeability;
	private Vector magneticFieldStrength;

	public Magnetic(Double permeability, Vector magneticFieldStrength) {
		this.permeability = permeability;
		this.magneticFieldStrength = magneticFieldStrength;
	}

	public boolean isPoint(Thing thing, Vector magneticField) {
		Vector vector = Vector.crossProduct(thing.getVector(), magneticField);
		Double magneticForce = Vector.getVectorSize(vector);
		Double thingForce = Vector.getVectorSize(thing.getVector());
		return magneticForce > thingForce;
	}

	private Vector getMagneticField(Vector coulomb, Double velocity) {
		coulomb.setX(coulomb.getX() * velocity);
		coulomb.setY(coulomb.getY() * velocity);
		coulomb.setZ(coulomb.getZ() * velocity);

		magneticFieldStrength.setX(magneticFieldStrength.getX() * permeability);
		magneticFieldStrength.setY(magneticFieldStrength.getY() * permeability);
		magneticFieldStrength.setZ(magneticFieldStrength.getZ() * permeability);

		return Vector.crossProduct(coulomb, magneticFieldStrength);
	}
}