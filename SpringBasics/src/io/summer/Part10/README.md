### IoC Container :

The IoC container creates an object of the specified class and also injects all the dependency objects through a constructor, a property or a method at run time and disposes it at the appropriate time)

## registerShutdownHook()

1. In spring, registerShutdownHook() method is used to shut down IoC container in non-web applications. It shuts down IoC container gracefully.

    
2. In non web based application like desk top application it is required to call registerShutdownHook. In our desktop application we need to release all resources used by our spring application. So we need to ensure that after application is finished, destroy method on our beans should be called. 

3. In web-based application ApplicationContext already implements code to shut down the IoC container properly. But in desktop application we need to call registerShutdownHook to shutdown IoC container properly.

4. AbstractApplicationContext.registerShutdownHook() will close, or shutdown, the ApplicationContext at a later time when the JVM is shutting down for whatever reason. This will be achieved by utilizing the JVM shutdown hook functionality.
