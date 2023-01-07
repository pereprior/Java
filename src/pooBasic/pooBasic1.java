package pooBasic;
public class pooBasic1 {

    private static final coche kia = new coche();

    public static void cambiarColor() {

        kia.setColor("black");

        System.out.println(kia.getColor());

    }

    public static void main(String[] args) {

        cambiarColor();

    }

}
