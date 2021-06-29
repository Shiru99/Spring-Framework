## Event Handling in Spring

ApplicationContext manages the complete life cycle of the beans. The ApplicationContext publishes certain types of events when loading the beans. For example, a ContextStartedEvent is published when the context is started and ContextStoppedEvent is published when the context is stopped.

- <b>ContextRefreshedEvent</b> 

    This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised using the refresh() method on the ConfigurableApplicationContext interface


- <b>ContextStartedEvent</b>

    This event is published when the ApplicationContext is started using the start() method on the ConfigurableApplicationContext interface. You can poll your database or you can restart any stopped application after receiving this event.


- <b>ContextStoppedEvent</b>

    This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext interface. You can do required house-keep work after receiving this event.

- <b>ContextClosedEvent</b>

    This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. A closed context reaches its end of life; it cannot be refreshed or restarted.

- <b>RequestHandledEvent</b>

    This is a web-specific event telling all beans that an HTTP request has been serviced.

---

## A Custom Event

Spring allows us to create and publish custom events which – by default – are synchronous. This has a few advantages – such as, for example, the listener being able to participate in the publisher’s transaction context.

- Event 

- Publisher (The publisher constructs the event object and publishes it to anyone who's listening)

- Listener (The only requirement for the listener is to be a bean and implement ApplicationListener interface)
