package com.mcdiamondfire.consolecolor;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Represents an element that can be
 * printed into console to achieve a
 * certain color or style.
 *
 * @author Daedalus
 * @version 1.0
 */
public abstract class FormattedElement implements Cloneable {

    private final String element;

    private String prefix;

    /**
     * Create a new formatted element.
     *
     * @param element The characters used in the format
     * @param prefix The prefix of the element, used to specify style
     */
    public FormattedElement(String element, String prefix) {
        this.element = element;
        this.prefix = prefix;
    }

    /**
     * Sets the prefix of the element.
     *
     * @param prefix The new prefix
     */
    public final void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Converts the element into a string.
     *
     * @return The printable character sequence
     */
    @Override
    public String toString() {
        return "\033[" + prefix + element;
    }

    /**
     * Makes the formatted element bold.
     *
     * @return This formatted element
     * @throws UnsupportedOperationException if the element cannot be made bold
     */
    public String embolden() {
        throw new UnsupportedOperationException("The bold style is not supported for this style element.");
    }

    /**
     * Underlines the formatted element.
     *
     * @return This formatted element
     * @throws UnsupportedOperationException if the element cannot be underlined
     */
    public String underline() {
        throw new UnsupportedOperationException("This underline style is not supported for this style element.");
    }

    /**
     * Italicizes the formatted element.
     *
     * @return This formatted element
     * @throws UnsupportedOperationException if the element cannot be emboldened
     */
    public String italicize() {
        throw new UnsupportedOperationException("This italic style is not supported for this style element.");
    }

    public FormattedElement clone() {
        try {
            return (FormattedElement) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }
}
