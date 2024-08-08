package ma.elmoudene.designpatternjavaexamples.abstractFactory.factories;

import ma.elmoudene.designpatternjavaexamples.abstractFactory.buttons.Button;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.buttons.MacOSButton;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.checkboxes.Checkbox;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
