package patterns.creational.abstract_factory.components.checkbox;

public class MacCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("MAC - Painting Checkbox");
	}
}
