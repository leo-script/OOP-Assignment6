package AbstractFactory.GUIFactoryInterface;

import AbstractFactory.ButtonInterface.Button;
import AbstractFactory.CheckBoxInterface.CheckBox;

public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckbox();
}
