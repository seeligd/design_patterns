Reading "Head First - Design Patterns" and learning about git at the same time. 

Strategy Pattern
An interface defines a group of algorithims that perform a function so that they can be associated with consumers.
For example, different types of ducks fly and quack in different ways (quack, squeak, nothing, flap, rocket, immobile)
At runtime a behavior can be bound to an object so that when it's called on to 'Fly' or 'Quack', it performs whatever
behavior it was set to use. 

* Identify the aspects of the application that vary and separate them from what stays the same 
	(strategy - fly behaviors and quack behaviors)

* Program to an interface, not an implementation
	(FlyBehavior and QuackBehavior are interfaces so that the behaviors can be modified at *runtime*)
	Animal a = new Dog(); (or Animal a = new getAnimal() that happens to return a dog)

* Favor composition over inheritance
	(behavior object isn't inherited from a superclass, it's stored in an instance variable of an interface)

Observer Pattern
 Observers register to a subject to be notified when the subject changes. This can either be push or pull notification. 

* Strive for loosely coupled designs between objects that interact
