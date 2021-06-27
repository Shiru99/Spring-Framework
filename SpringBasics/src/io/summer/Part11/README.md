## BeanPostProcessor

* BeanPostProcessor is used to interact with newly created bean instances before and/or after their initialization method is invoked by the Spring container. 
* You can use BeanPostProcessor to execute custom logic before and/or after bean’s initialization method is invoked by the Spring container.

## BeanFactoryPostProcessor

* Spring BeanFactoryPostProcessor works on the bean definitions or configuration meta data of the bean before beans are actually created. With BeanFactoryPostProcessor we can modify exiting bean definitions or create our new bean definitions.

## PropertyPlaceholderConfigurer

* The PropertyPlaceholderConfigurer is a property resource configurer that resolves placeholders in bean property values of context definitions. It pulls values from a properties file into bean definitions