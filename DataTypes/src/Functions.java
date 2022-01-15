public class Functions {

    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);

        System.out.println("Circle area: " + area);

        System.out.println("Sphere Area: " + sphereArea(y));

        System.out.println("Sphere Volume: " + sphereVolume(y));

        System.out.println("Pesos to dollars: " + convertToDolar(200,"MXN"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return 4/3 * Math.PI * Math.pow(r,2);
    }

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
