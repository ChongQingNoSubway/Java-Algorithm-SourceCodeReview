//package OOD;
//
//public class guide {
//}


//why learning ood?
//1. practical problems -> model -> codes
//2. Better understanding of OOP
//3. code details

// 2.1 Class and Object
// class: a blueprint for a data type, scheme.
// obeject: a specific realization of any class , instance

// public can access -> same class ,derived classes ,outside classes
// protected can access -> same class ,derived classes | can not access -> outside classes
// private can access-> same class | can not access -> derived class , outside classes.



// how to select appropriate label?
// 1.api : public
// 2.internal implementation : private
// 3.class inheritance : do we need to use protected for methods/ attributes
//   a. protected methods: sometimes useful when we want to override an implementation in subclasses
//   b. protected attributes : be careful , try to use private first
// 4."default" in java : declare a class as public only when we define public api in it,
// otherwise package-private is good enough.


// inheritance, interface, abstract class
//  inheritance -> base class , derived class
//
//  interface and abstract class
//  java interface and abstract class

// interface
// we can not have data fields in interface
//  and there are no methods implementation in interface (java 8 can hold default implementation)

// abstract
// constructor method ok
// methods with implementation also ok
//  we can have some data fields in abstract class


// In java, for your base class, interface vs abstract vs. concrete class?
// 1. an abstract provides a common base implementation to derived class , use
// abstract class for base class if the derived classes share common implementation

// 2. interface helps you to focus on the API signature definition.
// Example:
// interface Collection : add(E), size() ....
// collection's subclasses may share NO common implementation at all.

// 3.Multiple inheritance : implement multiple interfaces
// Example:
// Array implements:
// Serializable, cloneable, iterable<E>, list<E>, randomAccess

// 4. the relationship between the interface itself and the class
// implementing the interface is not necessarily strong
// Example:
// class House implements airConditioning
// ArrayList implements Serializable



// Polymorphism and Overriding
// override: a subclass or child class to provide a specific implementation
// of a method that is already provided by one of its superclasses or parent classes

// polymorphism: A call to member function will cause a different function to be
// executed depending on the type of object that invokes the function.
// example：
