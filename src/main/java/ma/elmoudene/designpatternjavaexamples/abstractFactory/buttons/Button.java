package ma.elmoudene.designpatternjavaexamples.abstractFactory.buttons;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 * <p>
 * This is the common interface for buttons family.
 */
public interface Button {
    void paint();
}