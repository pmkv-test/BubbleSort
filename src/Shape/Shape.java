package Shape;

public abstract class Shape {
    private int shapeWeight;
    private float shapeDensity;

    protected Shape(int weight) {
        shapeWeight = weight;
    }

    protected abstract float calcVolume();

    public float calcDensity() {
        shapeDensity = shapeWeight / calcVolume();
        return shapeDensity;
    }
}


