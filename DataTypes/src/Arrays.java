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

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(i + "." +androidVersions[i]);
        }

        for (String androidVersion : androidVersions){
            System.out.println(androidVersion);
        }

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        cities [0][0] = "Colombia";
        cities [0][1] = "CDMX";
        cities [1][0] = "Colombia";
        cities [1][1] = "Bogota";
        cities [2][0] = "Uruguay";
        cities [2][1] = "Montevideo";
        cities [3][0] = "Uruguay";
        cities [3][1] = "Canelones";

        for (int i = 0; i < cities.length; i++) {
            System.out.println();
            for (int j = 0; j < cities[i].length; j++) {
                System.out.print(cities[i][j] + " ");
            }
        }
        System.out.println("\n");

        for (String[] pair : cities){
            System.out.println();
            for (String name : pair){
                System.out.print(name + " ");
            }
        }

        System.out.println("\n");

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
