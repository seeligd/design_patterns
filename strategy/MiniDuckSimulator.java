public class MiniDuckSimulator {
	public static void main (String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.display();

		Duck rubber = new RubberDuck();
		rubber.performFly();
		rubber.performQuack();
		rubber.display();

	}
}
