package patterns.creational.abstract_factory.components.button;

public class MacButton implements Button{

	@Override
	public void paint() {
		System.out.println("MAC - Painting Button");
	}
}
