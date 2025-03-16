package java_tipos_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        Double numeroDouble = 100.0;
        int numeroInt = numeroDouble.intValue();
        System.out.println(numeroInt);

        double d = 3.75;
        int i = (int) d;
        System.out.println(i);

        String num = "100";
        var numInt = Integer.valueOf(num);
        System.out.println(numInt);

        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));
    }
}
