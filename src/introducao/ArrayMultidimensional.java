package introducao;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        // 1,2,3,4,5 => Meses
        // 31, 28, 31, 30 => Dias

        // SINTAXE ARRAYS MULTIDIMENSIONAIS
        int[][] dias = new int[3][3];

        // EXEMPLO BÁSICO
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------------------------------");

        for (int[] dia : dias) {
            for (int num : dia) {
                System.out.println(num);
            }
        }

        System.out.println("------------------------------------------------");

        // FORMAS DE INICIALIZAÇÃO

        int[][] arrayNovo = new int[3][];
        int[] array = {1,2,3};

        arrayNovo[0] = new int[2];
        arrayNovo[1] = array;
        arrayNovo[2] = new int[]{1,2,3,4,5,6};

        int[][] arrayNovo3 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase : arrayNovo) {
            System.out.println("\n------------");
            for (int num2 : arrayBase) {
                System.out.print(num2 + " ");
            }
        }

    }
}
