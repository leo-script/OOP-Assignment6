package AbstractFactory.ButtonImplement;

import AbstractFactory.ButtonInterface.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("#############\n#            #\n#\n# WinButton \n#             #\n#             \n#            \n##############");
    }
}
