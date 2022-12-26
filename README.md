# Spring

# Spring Self Study Notes

## *Spring Framework*
  1. Spring is a dependency injection framework.
  2. How dependencies were managed earlier to Spring
  ```
  public class ComplexBusinessclass{
      // tight coupling which is not recommended
      SortingAlgo sort = new BubbleSortingAlgo();
  }

  //dependency Injection
  public class ComplexBusinessclass{
      // loose coupling recommended
      SortingAlgo sort;
      ComplexBusinessclass(SortingAlgo sorting){
          this.sort=sorting;
      }
  }

  //How Spring does

  @Component
  public class ComplexBusinessclass{
      @Autowired
      SortingAlgo sortalgo;
  }
  @Component
  public class Bubblesort implements SortingAlgo{
      ...
  }
  ```
3. @Component annotation tells Spring Framework that it needs to manage instance creating of this class.
4. @Autowired annotation tells Spring framework to look for instance that matches the dependency.
By default, Spring resolves @Autowired entries by type. If more than one bean of the same type is available in the container, the framework will throw a fatal exception. To resolve this conflict, we need to tell Spring explicitly which bean we want to inject
5. Beans are the instance of object managed by Srping.
6. Inversion of control(IOC) : the control of instace creation and manage is given to framework, this is called inversion of control.
7. IOC container: Container where inversion of control is managed , Example Application Context.
8. Simple ways to create projects with spring initializer is using spring initalizer as it automatically add Spring dependency int the project.
9. @SpringBootApplication annotation tells spring framework automatically scan the package and the sub package for beans.This is called ComponentScan.
10. To debug Spring we can do logging.level.org.springframework= debug in application properties.
11. If we have two beans in primary that matches dependency we can use @Primary annotation to tell Spring framework which one to choose.
12. Two popular ways to inject dependency:  
  a. Constructor Injection- All Mandatory dependencies should be Autowired to constructor Injection.
  b. Setter Injection - If no consultior injection , only @Autowired is marked, Havving a setter is optional , it automatically sets and use setter injection.
13.  Spring Modules:  
    a.Data Access/Integration:    
        * Spring JDBC
        * ORM (Hibernate,Mybatis)
        * JMS
        * OXM (Object to XML)
        * Transaction Management.

        b. Web: Spring MVC, WebSocket,Servlet,Portlet.  
        c. Core: Beans,Core,context,spel.  
        d. Cross:    
            AOP (Aspect oriented programing)
            Apects
            Test
    
14. Spring Projects:  
  a. SpringBoot ( for quick start, microservices)
  b. SpringCloud (for cloud native)   
  c. SpringData (Consistent data access)
  d. SpringIntegration ( Connect Enterprise Apps)
  e. SpringBatch
  f. SpringSecurity
  g. Spring HATEOAS ( for best practice rest api)         

  15. We can Autowirebyname.(Alternative for @Primary)
  ```
  // this will find instance of class BubbleSortAlgorithm
  @Autowired
  private SortingAlgo bubbleSortAlgorithm
  ```

  16 @Primary has higher precedence of Autowirebyname.

  17. We can use @Qualifier annotation to tell spring which one to pick if there are multiple matching candidate for Autowiring. We need to add same @Qualifier("tag") in both component and dependency.

  18. Bean Scope:  
    a. Singleton  - one instance per Spring Context. 
    b. Prototype - New bean whenever we do getBean from Application context.  
    c. Request- 1 bean per http request  
    d. Session- 1 bean per http session 

 19. By default scope is Singleton but we can tell Spring which scope we want by specifying @Scope annotation.
 ```
 @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 ```
 20. Singleton in GOF design pattern is 1 instance per JVM but Singleton scope in Spring is 1 instance per Application context.

 21. If we need other package component to be picked up  we will use @ComponentScane("Package")

 22. @PosrConstruct is a way to tell Spring to execute one method as soon as bean is created and all dependencies are resolved.

 23. @PreDestroy is call just before bean is removed out of context.

 24. CDI(Container and Dependency injection) is Java EE dependency injection standard.  
    a. @Inject ( Same as @Autowired)  
    b. @Named (@Component and @Qualifier)  
    c. @Singleton (Defines scope of Singleton)  
    d. to use CDI annotation we need to add javax.inject in pom.xml

 25. We can also remove springboot dependency from Spring app and add Spring core and Spring context dependency. If we do that we need to create AnnotationConfigApplicationContext . close the Application context setup Component scan to make our app work.  

 26.ClassPathXmlApplication context to generate Applicaion context from applicationContext.xml  
 27. applicationcontext.getBeanDefinitionName gives all bean present in the app context.

 28. we can also mix xmlcontext with a component scan for bean defined with Annotation.

 29. IOC container manages bean and dependency. There are two IOC container  
    a. Bean Factory (provides spring core bean management and dependency management).  
    b. Application context is extended version on Bean factory. It provides AOP , Internationalization , WebApplicationContext.

 30. Component Annotations:  
        a. @Component: Generic can be used for any class.  
        b. @Service: For Business Logic Facade.  
        c. @Controller: For Web layer
        d. @Repository: For data layer  
        e. The categorized version of component provides additional feature which is not available at component, Example @Service provides AOP features , @Repository provides JDBC error handling features.

31. We nac read property file present in class path, main/resource is present in class path. We can set a variable and use @Value to initialize the variable with a value from property file. We also need to set @PropertySource in the application context setup class.  
    a. https://stackoverflow.com/questions/40355105/not-able-to-inject-properties-file-into-spring-mvc-4-3-using-propertysource

32. Junit : @Test annotation for test methods ,AssetEquals(a,b) ,AssertTrue(condition), AssertFalse(condition), AssertArrayEquals(a,b), @Before before all test , @After runs after every test, @Beforeclass only for static method and runs before runnig any test, @Afterclass only for static and after all test has completed.

33. @SpringBootApplication annotation denotes a.it is a spring context file , b.enables AutoConfiguration ,  c.enables ComponentScan
34. SpringApplication.run used to run a SpringContext , run method returns Application Context
35. ApplicationContext class has getBeanDefinitionNames method which return all beans.
36. Spring MVC  framework provides decoupled way of developing web application, it provides Dispatcher Servlet, Model and View, Viewresolver
37. SpringBoot starter web & SpringBoot Starter JPA
38. spring-boot-starter-web-services - SOAP ws  
    spring-boot-starter-web - Web & Restful app
    spring-boot-starter-test - Unit testing and Integration testing
    spring-boot-starter-jdbc - Traditional JDBC
    spring-boot-starter-hateoas -HATEOAS feature
    spring-boot-starter-security - Authentication and Authorization
    spring-boot-starter-data-jpa - data JPA with hibernate
    spring-boot-starter-cache - Enables Spring caching support
    spring-boot-starter-data-rest - Export simple rest end point
    spring-boot-starter-actuator - monitoring & tracing

 39. AOP is best for implementing cross cutting concerns , like logging security etc. 
  40. Spring JDBC BeanPropertyRowMapper when table column and class field is same , we can also create a custom rowmapper 
 41. JPA is interface , hybernate os the implementation , they are basiclly ORM framework
 42. spring.h2.console.enabled=true
 43. In earlier version of spring, default url will be jdbc:h2:mem:testdb and testdb was created by default. from 2.3.0 onwards, if url is not mentioned it will auto generate database name. auto generated database name can be found in the spring logs.
 44. The Bean on which NeanPropertyRowMapper is defined must have a NoArg constructor
