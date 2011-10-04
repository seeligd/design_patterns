public abstract class Duck {

	// Abstract class contains 'behaviors' - things that a duck can do
	// Since behaviors are shared by some duck types but not all, whoever 
	// implements a duck can choose which behaviors get injected via 
	// setFlyBehavior and setQuackBehavior

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck()
	{

	}
	public abstract void display();

	public void performFly()
	{
		flyBehavior.fly();
	}

	public void performQuack()
	{
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
