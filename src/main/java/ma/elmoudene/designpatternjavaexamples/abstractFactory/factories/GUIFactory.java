package ma.elmoudene.designpatternjavaexamples.abstractFactory.factories;


import ma.elmoudene.designpatternjavaexamples.abstractFactory.buttons.Button;
import ma.elmoudene.designpatternjavaexamples.abstractFactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
