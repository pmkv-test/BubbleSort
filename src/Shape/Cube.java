package Shape;

public class Cube extends Shape {
    private int cubeH;

    public Cube(int weight, int h) {
        super(weight);
        cubeH = h;
    }

    @Override
    public float calcVolume() {
        float v = (float) Math.pow(cubeH, 3);
        return v;
    }
}
