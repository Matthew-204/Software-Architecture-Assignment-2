import View.HealthcareGUI;
import Model.HealthcareSystem;
import Controller.HealthcareController;

public class Main {
    static void main() {
        loadApplication();
    }
    private static void loadApplication(){
        HealthcareGUI gui = new HealthcareGUI();
        HealthcareSystem model = new HealthcareSystem();
        HealthcareController controller = new HealthcareController(gui,model);
        gui.setController(controller);
    }

}