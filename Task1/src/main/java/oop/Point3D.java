package main.java.oop;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        setLocation(0, 0, 0);
    }

    public Point3D(int x, int y, int z) {
        setLocation(x, y, z);
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double distanceFromOrigin() {
        return distance(new Point3D());
    }

    public double distance(Point3D p) {
        int dx = getX() - p.getX();
        int dy = getY() - p.getX();
        int dz = getZ() - p.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        z = 0;
    }

    @Override
    public void translate(int dx, int dy) {
        super.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}