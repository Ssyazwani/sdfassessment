package sdfassessment.task1;

public class Comparable {

    public static void main(String[] args) {
        AppRate obj1 = new AppRate();
        AppRate obj2 = new AppRate();

        AppRateComparator comparator = new AppRateComparator();
        System.out.println(comparator.compare(obj1,obj2));
    }
    
}
