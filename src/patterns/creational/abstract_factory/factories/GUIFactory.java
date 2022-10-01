package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.components.button.Button;
import patterns.creational.abstract_factory.components.checkbox.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
