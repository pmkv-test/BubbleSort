import Shape.Sphere;
import Service.SphereSort;
import java.util.Map;

public class Main {
    private static final int OBJECT_MAX = 10; //Кол-во сфер

    public static void main(String[] args) {
        SphereSort sphereSort = new SphereSort(OBJECT_MAX);
        Map<Integer, Sphere> sphereMap = sphereSort.getSphereSort() ;
        System.out.println(sphereMap.get(0).calcDensity());//первая по плотности сфера после сортировки
    }
}