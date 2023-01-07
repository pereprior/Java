package arrays;
public class ArraysBidimensionales {
    public static void main(String[] args) {

        //CREAR ARRAY
        String [][] tablero = {

                {"A1","A2","A3"},
                {"B1","B2","B3"},
                {"C1","C2","C3"},
                {"D1","D2","D3"}
        };


        for(String[] fila:tablero) {

            System.out.println();

            for (String columna:fila) {

                System.out.print(columna + " ");
            }

        }

    }
}
