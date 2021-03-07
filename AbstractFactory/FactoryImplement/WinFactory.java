package AbstractFactory.FactoryImplement;

import AbstractFactory.ButtonImplement.WinButton;
import AbstractFactory.ButtonInterface.Button;
import AbstractFactory.CheckBoxImplement.WinCheckBox;
import AbstractFactory.CheckBoxInterface.CheckBox;
import AbstractFactory.GUIFactoryInterface.GUIFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }


}

