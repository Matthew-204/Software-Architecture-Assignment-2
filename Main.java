import View.HealthcareGUI;
import Model.HealthcareSystem;
import Controller.HealthcareController;

public class Main {
    static void main() {
        new HealthcareController(new HealthcareGUI(), new HealthcareSystem());
    }
}