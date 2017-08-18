# Fortinet-Code
Fortinet Code Challenge



# Abstract Factory Pattern

Problem Statement: Suppose, a developer is developing a UI application where he needs to create a Forest (With trees and animals) and display it in his UI. The end user using the application can create his own number of trees and animals or he can ask the application to randomly create a forest. In both the cases, developer has to create multiple instances of the Forest interface. Factory Pattern comes to the rescue

Definition: By the definition of the The Factory Method pattern, A Factory defines an interface for creating an object, but lets the subclasses decide which class to instantiate. An Bbstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

#Solution:
On Application launch, end user will select either of two choices 1 or 2,

1 will create a forest with 10 trees and 5 animals, 2 will create a forest with trees between (0...20 randomly) & animals between (0...10) randomly! User doesn't know which object is being instantiated on his choices

#Implemention:





