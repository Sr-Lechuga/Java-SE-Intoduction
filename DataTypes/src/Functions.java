public class Functions {

    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);

        System.out.println("Circle area: " + area);

        System.out.println("Sphere Area: " + sphereArea(y));

        System.out.println("Sphere Volume: " + sphereVolume(y));

        System.out.println("Pesos to dollars: " + convertToDolar(200,"MXN"));
    }

    /**
     * It returns the area of a circle
     * @param r radio of circle
     * @return A double with the value of area of the circle with r radius
     */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return 4/3 * Math.PI * Math.pow(r,2);
    }

    /**
     * Description: Function to convert to a value of dollars specificating a currency
     * @param quantity Amount of money
     * @param currency Type of currency: just MXN or COP
     * @return quantity Returns the dollar amount
     */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
