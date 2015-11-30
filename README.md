# Object-Oriented Programming

Demo app demonstrating various OOP principles, from Udemy course:
https://www.udemy.com/mastering-object-oriented-design-in-java

Fights against tight coupling

## package SRP: Single Responsibility Principle

## package Open Closed Principle / Strategy Pattern
Strategy Pattern: enables an algorithm's behavior to be selected at runtime. 

Open Closed Principle: software modules should be open for extension and closed for modification.

## package Dependency Inversion Principle / Template Pattern

High-level modules should not depend on low-level modules. Depend on Abstractions! - Robert C. Martin, Clean Code

Abstract Classes and interfaces don't changes as often as concrete derivatives.

It is okay to depend on concrete classes if they don't change often. (Only depend on things that don't change often. 
Example: String class.)

This class has a Device Manufacturing Factory that builds different devices through a set process, though the details change a bit for each kind of device.