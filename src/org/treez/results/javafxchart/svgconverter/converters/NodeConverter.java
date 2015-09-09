package org.treez.results.javafxchart.svgconverter.converters;

import javafx.scene.Node;

/**
 * Converts a JavaFx Node to corresponding SVG code
 * 
 * @param <T>
 */
public interface NodeConverter<T extends Node> {

	/**
	 * Extends the initial code with the code for the given Node
	 * @param code 
	 * @param node
	 * @return
	 */
	String extendCode(String code, T node);

	/**
	 * Returns the current indentation. The indentation is a string consisting of spaces. It is used as prefix
	 * for lines to make the code easier to read. The size of the indentation may change while the code is
	 * extended.
	 *
	 * @return
	 */
	String getIndentation();

	/**
	 * Sets the indentation
	 *
	 * @param indentation
	 */
	void setIndentation(String indentation);

}
