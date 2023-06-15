public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night": //ambar
                System.out.println("Seleccionaste NightMode");
            break;
            case "Blue Dark":
                System.out.println("seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("seleccionaste Dark Mode");
                break;
        }
    }
}
