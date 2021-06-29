* [spring-component-annotation](https://www.baeldung.com/spring-component-annotation)

## @Component

If any class is annotated with @Component it will be automatically detect by using classpath scan we don't need to explicitly add its bean in XML

- useful for singleton-bean

Both are equivalent
```
<bean id="shape" class="io.summer.Part15.Circle"/>
```

```
@Component
public class Circle { ...
```

---

### Stereotype

All provide the same function as @Component. The reason they all act the same is that they are all composed annotations with @Component as a meta-annotation for each of them.

- @Controller
- @Service
- @Repository

