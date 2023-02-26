package Service;

import Shape.Sphere;

import java.util.HashMap;
import java.util.Map;

public class SphereSort {
    public SphereSort(int OBJECT_MAX) {
        this.OBJECT_MAX = OBJECT_MAX;
    }

    private int OBJECT_MAX; //Кол-во сфер
    private static final int WEIGHT_CONST = 200; //Вес
    private static final int RADIUS_CONST = 1;//Начальное значение радиуса
    private static int randomRadius;//Случайный радиус
    private static int RANDOM_MAX = 15;

    private Map<Integer, Sphere> addSphereToMap() {
        Map<Integer, Sphere> sphereMap = new HashMap<Integer, Sphere>();

        for (int i = 0; i < OBJECT_MAX; i++) {
            randomRadius = (int) (Math.random() * ++RANDOM_MAX);
            Sphere sphere = new Sphere(WEIGHT_CONST, RADIUS_CONST + randomRadius);//сферы со случайными радиусами
            sphereMap.put(i, sphere);
        }

        return sphereMap;
    }

    private Map<Integer, Sphere> bubbleSorted(Map<Integer, Sphere> sphereMap) {
        for (int outKey = OBJECT_MAX - 1; outKey >= 1; outKey--) {

            for (int inKey = 0; inKey < outKey; inKey++) {
                Sphere sphere1 = sphereMap.get(inKey);
                Sphere sphere2 = sphereMap.get(inKey + 1);

                if (sphere1.calcDensity() < sphere2.calcDensity()) {
                    sphereMap.replace(inKey, sphere2);
                    sphereMap.replace(inKey + 1, sphere1);
                }
            }
        }

        return sphereMap;
    }

    public Map<Integer, Sphere> getSphereSort() {
        Map<Integer, Sphere> sphereMap = null;

        try {
            sphereMap = addSphereToMap();
            bubbleSorted(sphereMap);

        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic error message:" + ex.getMessage());

        } catch (Exception ex) {
            System.out.println("Error message:" + ex.getMessage());

        }

        return sphereMap;
    }
}
