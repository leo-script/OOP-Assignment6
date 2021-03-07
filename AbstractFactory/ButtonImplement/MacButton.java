package AbstractFactory.ButtonImplement;

import AbstractFactory.ButtonInterface.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("#############\n# MacButton #\n##############");
    }
}
