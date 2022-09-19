public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rational r1 = new Rational(80,64);
        System.out.println("\n");
//        System.out.println(r1);
        Vector vector1 = new Vector(4);
        vector1.addELement(new Rational(1,2));
        vector1.addELement(new Rational(3,5));
        vector1.addELement(new Rational(5,8));
        vector1.addELement(new Rational(8,3));
        System.out.println("AQUI-------VECTOR1-------");
        System.out.println(vector1);
        Vector vector2 = new Vector(4);
        vector2.addELement(new Rational(1,2));
        vector2.addELement(new Rational(3,5));
        vector2.addELement(new Rational(5,8));
        vector2.addELement(new Rational(8,3));
        System.out.println("AQUI-------VECTOR2-------");
        System.out.println(vector2);
        System.out.println("AQUI-------RESULTADO-------");
        vector1.add(vector2);
        System.out.println(vector1);
//        vector1.mult(new Rational(2,1));
//        System.out.println(vector1);

//        Rational r1 = new Rational(0,1);
//        Rational r2 = new Rational(0,1);
//        Rational a = new Rational(2,3);
//        Rational b = new Rational(3,2);
//        vector1.addELement(r1);
//        vector1.addELement(r2);
//        vector1.set(0,a);
//        System.out.println(vector1);
//        a.mult(b);
////        vector.set(1,new Rational(3,2));
//        System.out.println(vector1);
//        Vector vector2 = new Vector(2);
//        vector2.addELement(new Rational(1,2));
//        vector2.addELement(new Rational(1,2));
//        a = vector2.getElement(0);
//        a.mult(new Rational(1,3));
//        System.out.println(a);
//        System.out.println(vector.getElement(1));
//        a = new Rational()
//        System.out.println(Rational.multClassM(r1,r2).toString());

//        Rational r2 = new Rational(3,4);
//        r1.add(r2);

    }
}