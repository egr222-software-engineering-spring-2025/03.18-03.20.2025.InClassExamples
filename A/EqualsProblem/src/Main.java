public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(5,3);
        Point p3 = p2;

        System.out.println("p1 == p2 " + (p1 == p2));
        System.out.println("p1 == p3 " + (p1 == p3));
        System.out.println("p3 == p2 " + (p3 == p2));

        System.out.println("p1.equals(p2) " + (p1.equals(p2)));
        System.out.println("p1.equals(p3) " + (p1.equals(p3)));
        System.out.println("p3.equals(p2) " + (p3.equals(p2)));

        System.out.println("p1.equals(\"hello\") " + (p1.equals("hello")));

//        System.out.println("Other: " + p1.equals("Hello World!"));
    }
}