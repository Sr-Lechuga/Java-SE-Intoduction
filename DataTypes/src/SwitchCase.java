public class SwitchCase {
    public static void main(String[] args) {
        String colorModeSelected = "1";

        switch (colorModeSelected){
            case "Light":
                System.out.println("You selected Light Mode");
                break;
            case "Night":
                System.out.println("You selected Night Mode");
                break;
            case "Blue Dark":
                System.out.println("You selected Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("You selected Dark Mode");
                break;
            default:
                System.out.println("That mode isn't implemented yet");
        }
    }
}
