package arrays;

public class Sueldo {
    static double intereses = 0.1;
    static double acumulado = 10000;

    static double [][] saldo = new double[6][5];

    public static void calcularSaldo() {

        for (int i = 0 ; i < 6 ; i++) {

            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1 ; j < 5; j++) {

                acumulado=acumulado+(acumulado*intereses);

                saldo[i][j]=acumulado;
            }

            intereses+=0.01;
        }
    }

    public static void mostrar() {

        calcularSaldo();

        for(int i = 0 ; i < 6 ; i++) {

            System.out.println();

            for (int j = 0 ; j < 5 ; j++) {

                System.out.print(saldo[i][j] + " ");
            }

        }
    }

    public static void main(String[] args) {

        mostrar();
    }

}