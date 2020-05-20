package com.mcdiamondfire.consolecolor.impl;

import com.mcdiamondfire.consolecolor.FormattedElement;

class ColorElement extends FormattedElement {

    public ColorElement(String element) {
        super(element, "0;");
    }

    @Override
    public String embolden() {
        FormattedElement element = clone();
        element.setPrefix("1;");
        return element.toString();
    }

    @Override
    public String underline() {
        FormattedElement element = clone();
        element.setPrefix("4;");
        return element.toString();
    }

    @Override
    public String italicize() {
        FormattedElement element = clone();
        element.setPrefix("3;");
        return element.toString();
    }
}
