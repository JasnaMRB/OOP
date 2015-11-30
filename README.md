# Object-Oriented Programming

Demo app demonstrating various OOP principles, from Udemy course:
https://www.udemy.com/mastering-object-oriented-design-in-java

Fights against tight coupling.
Single Responsibility Principle
Open Closed Principle
Liskov Substitution Principle
Interface Segregation Principle
Dependency Inversion Principle

Packages:

## SRP: Single Responsibility Principle

## OCP: Open Closed Principle / Strategy Pattern
Strategy Pattern: enables an algorithm's behavior to be selected at runtime. 

Open Closed Principle: software modules should be open for extension and closed for modification.

## DIP: Dependency Inversion Principle / Template Pattern

High-level modules should not depend on low-level modules. Depend on Abstractions! - Robert C. Martin, Clean Code

Abstract Classes and interfaces don't changes as often as concrete derivatives.

It is okay to depend on concrete classes if they don't change often. (Only depend on things that don't change often. 
Example: String class.)

This package has a Device Manufacturing Factory that builds different devices through a set process, though the details change a bit for each kind of device.


## LSP: Liskov Substitution Principle

Subtypes must be substitutable for their basetypes. 
Often violated. Degenerate methods often exist--either do nothing or return nulls.

## ISP: Interface Segregation Principle

Separates any/all behaviors from objects that don't need them.

This package handles Customers and their products. Customers get charged and an invoice can be generated.