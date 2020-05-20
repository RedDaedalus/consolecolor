package com.mcdiamondfire.consolecolor.impl;

import com.mcdiamondfire.consolecolor.FormattedElement;

class BrightColorElement extends FormattedElement {

    public BrightColorElement(String element) {
        super(element, "0;");
    }

    @Override
    public String embolden() {
        FormattedElement element = clone();
        element.setPrefix("1;");
        return element.toString();
    }
}
