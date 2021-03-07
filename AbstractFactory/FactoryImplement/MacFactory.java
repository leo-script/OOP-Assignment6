package AbstractFactory.FactoryImplement;

import AbstractFactory.ButtonImplement.MacButton;
import AbstractFactory.ButtonInterface.Button;
import AbstractFactory.CheckBoxImplement.MacCheckBox;
import AbstractFactory.CheckBoxInterface.CheckBox;
import AbstractFactory.GUIFactoryInterface.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
