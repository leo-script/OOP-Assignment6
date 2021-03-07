package factory;

public class WindowsButton implements Button {

    public void render(int a, int b) {
        System.out.println("Windows button with dimensions a and b..." + "\n [ SUBMIT ]");
    }
    public void onClick(String f) {
        System.out.println("Executing command: " + f);
    }
}
