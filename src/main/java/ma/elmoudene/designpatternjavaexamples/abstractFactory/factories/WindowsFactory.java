package ma.elmoudene.designpatternjavaexamples.abstractFactory.factories;

import ma.elmoudene.designpatternjavaexamples.abstractFactory.buttons.Button;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.buttons.WindowsButton;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.checkboxes.Checkbox;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}