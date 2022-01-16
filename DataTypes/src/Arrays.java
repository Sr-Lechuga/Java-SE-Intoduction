public class Arrays {
    public static void main(String[] args) {
        String [] androidVersions = new String[22];
        String days[] = new String[7];

        String [][] cities = new String[4][2]; //4 * 2 = 8
        /*  ---------------------------
           |   Country    |   City     |
           ----------------------------
           | Mexico       | CDMX       |
           | Mexico       | Guadalajara|
           | Uruguay      | Montevideo |
           | Uruguay      | Canelones  |
           ----------------------------
         */

        int [][][] numbers = new int [2][2][2]; // 2*2*2 = 8 elements
        int [][][][] numbers_4th =  new int[2][2][2][2]; //2*2*2*2 = 16 elements

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();

        cities [0][0] = "Colombia";
        cities [0][1] = "CDMX";
        cities [1][0] = "Colombia";
        cities [1][1] = "Bogota";
        cities [2][0] = "Uruguay";
        cities [2][1] = "Montevideo";
        cities [3][0] = "Uruguay";
        cities [3][1] = "Canelones";

        System.out.print(cities[0][0] + " ");
        System.out.println(cities[0][1]);
        System.out.print(cities[1][0] + " ");
        System.out.println(cities[1][1]);
        System.out.print(cities[2][0] + " ");
        System.out.println(cities[2][1]);
        System.out.print(cities[3][0] + " ");
        System.out.println(cities[3][1]);

        System.out.println();

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println(animals[1][0][0][1]);
    }
}
