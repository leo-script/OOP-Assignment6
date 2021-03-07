package AbstractFactory;

import AbstractFactory.ButtonInterface.Button;
import AbstractFactory.FactoryImplement.MacFactory;
import AbstractFactory.FactoryImplement.WinFactory;
import AbstractFactory.GUIFactoryInterface.GUIFactory;

public class Application3 {
    private GUIFactory factory;
    private Button button;
    public Application3() {
    }
    public Application3(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
    }
    public void paint() {
        button.paint();
    }

    public GUIFactory initialize(Config_abstract_factory config3) throws Exception {

        switch (config3) {
            case Windows:
                factory = new WinFactory();
                break;
            case Mac:
                factory = new MacFactory();
                break;
            default:
                throw new Exception("Error! Unknown operating system.");
        }
        return factory;
    }

}
