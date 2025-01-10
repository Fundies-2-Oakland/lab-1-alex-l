public class Vector3D {
    double x, y, z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        return String.format("(%1$.2f, %2$.2f, %3$.2f)", x, y, z);
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

//    public Vector3D normalize() {
//        double mag = getMagnitude();
//        if (mag == 0.0) {
//            throw new IllegalStateException("Magnitude is 0.");
//        }
//        return new Vector3D(x / mag, y / mag, z / mag);
//    }
//
//    //Had to ask for help on this one
//    public Vector3D add(Vector3D other) {
//        return new Vector3D(other.x + this.x, other.y + this.y, other.z + this.z);
//    }
//
//    public Vector3D multiply(double c) {
//        return new Vector3D(this.x * c, this.y * c, this.z * c);
//    }

    // Was  little confused on the math behind these questions so I just focused on the homework
//    public angleBetween

}