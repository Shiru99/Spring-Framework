# Spring FrameWork

## Spring Bean Factory

A BeanFactory is like a factory class that contains a collection of beans. The BeanFactory holds Bean Definitions of multiple beans within itself and then instantiates the bean whenever asked for by clients. The BeanFactory is the actual container which instantiates, configures, and manages a number of beans.

### Factory Pattern & Spring Bean Factory

Working : Object factory reads configurations (blueprints of objects) and creates new objects accordingly and returns these objects to the requesting object


<img src="Screenshots/factory-pattern.png" alt="factory-pattern" width="480"/> <img src="Screenshots/bean-factory.png" alt="bean-factory.png" width="480"/>


### ApplicationContext  

The ApplicationContext builds on top of the BeanFactory (it's a subclass) and adds other functionality such as easier integration with Springs AOP features, message resource handling (for use in internationalization), event propagation, declarative mechanisms to create the ApplicationContext and optional parent contexts, and application-layer specific contexts such as the WebApplicationContext, among other enhancements.

<img src="Screenshots/application-context.png" alt="application-context" width="480"/> <img src="Screenshots/working-of-bean-factory.png" alt="working-of-bean-factory" width="480"/>


### Bean Scope

1. singleton (default) : Only once per Spring container.
2. prototype : New bean created with every request or reference.

3. request : This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
4. session : This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
5. global-session : This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.


--- 

## Resources

* https://dzone.com/
* https://www.tutorialspoint.com/spring