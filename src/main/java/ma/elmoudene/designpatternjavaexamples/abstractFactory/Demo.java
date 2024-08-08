package ma.elmoudene.designpatternjavaexamples.abstractFactory;


import ma.elmoudene.designpatternjavaexamples.abstractFactory.app.Application;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.factories.GUIFactory;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.factories.MacOSFactory;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * The Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}