package factory;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick("Close Session");
        okButton.render(1, 1);
    }
    public abstract Button createButton();

}
