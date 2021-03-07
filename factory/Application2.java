package factory;

public class Application2 {
    private Dialog dialog;

    public Dialog initialize(Config_factory config) throws Exception {

        switch (config) {
            case Windows:
                dialog = new WindowsDialog();
                break;
            case Web:
                dialog = new WebDialog();
            default:
                throw new Exception("Error! Unknown operating system.");
        }
        return dialog;
    }





}
