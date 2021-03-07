package AbstractFactory.CheckBoxImplement;

import AbstractFactory.CheckBoxInterface.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void print() {
        System.out.println("WinCheckBox [ ]");
    }
}
