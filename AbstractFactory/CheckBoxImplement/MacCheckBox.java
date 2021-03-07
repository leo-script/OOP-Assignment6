package AbstractFactory.CheckBoxImplement;

import AbstractFactory.CheckBoxInterface.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void print() {
        System.out.println("MacCheckBox [ ]");
    }
}
