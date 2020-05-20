package com.mcdiamondfire.consolecolor.impl;

import com.mcdiamondfire.consolecolor.FormattedElement;

/**
 * Represents a format that may be printed
 * to the console through concatenation.
 * Certain colors can be formatted using
 * the <tt>embolden()</tt> method for bold,
 * as well as the <tt>underline</tt> method
 *
 * @author Daedalus
 * @version 1.0
 */
@SuppressWarnings("unused")
public interface ConsoleColor {

    FormattedElement RESET = new ResetElement();

    // <editor-fold desc="> Colors">
    FormattedElement BLACK = new ColorElement("30m");
    FormattedElement RED = new ColorElement("31m");
    FormattedElement GREEN = new ColorElement("32m");
    FormattedElement YELLOW = new ColorElement("33m");
    FormattedElement BLUE = new ColorElement("34m");
    FormattedElement PURPLE = new ColorElement("35m");
    FormattedElement CYAN = new ColorElement("36m");
    FormattedElement WHITE = new ColorElement("37m");
    // </editor-fold>

    // <editor-fold desc="> Background Colors">
    FormattedElement BLACK_BG = new BackgroundElement("40m");
    FormattedElement RED_BG = new BackgroundElement("41m");
    FormattedElement GREEN_BG = new BackgroundElement("42m");
    FormattedElement YELLOW_BG = new BackgroundElement("43m");
    FormattedElement BLUE_BG = new BackgroundElement("44m");
    FormattedElement PURPLE_BG = new BackgroundElement("45m");
    FormattedElement CYAN_BG = new BackgroundElement("46m");
    FormattedElement WHITE_BG = new BackgroundElement("47m");
    // </editor-fold>

    // <editor-fold desc="> Bright Colors">
    FormattedElement BLACK_BRIGHT = new BrightColorElement("90m");
    FormattedElement RED_BRIGHT = new BrightColorElement("91m");
    FormattedElement GREEN_BRIGHT = new BrightColorElement("92m");
    FormattedElement YELLOW_BRIGHT = new BrightColorElement("93m");
    FormattedElement BLUE_BRIGHT = new BrightColorElement("94m");
    FormattedElement PURPLE_BRIGHT = new BrightColorElement("95m");
    FormattedElement CYAN_BRIGHT = new BrightColorElement("96m");
    FormattedElement WHITE_BRIGHT = new BrightColorElement("97m");
    // </editor-fold>

    // <editor-fold desc="> Bright Background Colors">
    FormattedElement BLACK_BG_BRIGHT = new BrightBackgroundElement("100m");
    FormattedElement RED_BG_BRIGHT = new BrightBackgroundElement("101m");
    FormattedElement GREEN_BG_BRIGHT = new BrightBackgroundElement("102m");
    FormattedElement YELLOW_BG_BRIGHT = new BrightBackgroundElement("103m");
    FormattedElement BLUE_BG_BRIGHT = new BrightBackgroundElement("104m");
    FormattedElement PURPLE_BG_BRIGHT = new BrightBackgroundElement("105m");
    FormattedElement CYAN_BG_BRIGHT = new BrightBackgroundElement("106m");
    FormattedElement WHITE_BG_BRIGHT = new BrightBackgroundElement("107m");
    // </editor-fold>
}
