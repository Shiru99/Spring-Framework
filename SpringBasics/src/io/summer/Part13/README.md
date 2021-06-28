### Annotations

1. @Required : Required annotation validates (required bean property must be injected with a value at the configuration time) during bean initialization.

2. @Autowired : By declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring.

    * @Autowired on Properties - eliminates the need for getters and setters
    * @Autowired on Setters - autowires the instance of setter-object
    * @Autowired on Constructors - autowires the instance of constructors-objects
    ---

    Working of Autowired :

    - checks for suitable bean type  
    - for multiple matchings, it checks for id

3. Autowiring by @Qualifier :

    In many circumstances, naming bean same as variable name is not possible ==> in such scenarios @Qualifiers can be useful 
  