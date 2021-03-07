package factory;

public class HTMLButton implements Button {

    public void render(int a, int b) {
        System.out.println("HTML Button code: " + "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>HTML TEST BUTTON</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <p style=\"text-align: center\"><button>SUBMIT</button>\n" + "\n" +
                " </body>\n" +
                "</html>");
    }

    public void onClick(String f) {
        System.out.println("Binding a web browser click event...\n" + f);
    }
}
