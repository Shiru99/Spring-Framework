## AOP (Aspect Oriented Programming)

- Aspect : 
    - Aspect is a module which has a set of APIs providing cross-cutting requirements. For example, a logging module would be called AOP aspect for logging. An application can have any number of aspects depending on the requirement.


- Joinpoint : 
    - Joinpoint represents a point in the application where you can plug-in the AOP aspect. You can also say, it is the actual place in the application where an action will be taken using Spring AOP framework.


- Pointcut : 
    - A Pointcut is a set of one or more join points where an advice should be executed. You can specify pointcuts using expressions or patterns


- Advice : 
    - Advice is the actual action to be taken at a particular Joinpoint. Different types of advice include “around,” “before” and “after” advice. This is an actual piece of code that is invoked during the program execution by Spring AOP framework.

*JoinPoints are options on the menu and Pointcuts are items you select.*