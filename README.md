# Assignment
Question - 1 
Reverses a single list. Need answer with Java code

    a)  Algorithm 
    
    Please check NodeUtil.java in the below path for implementation of the node reversal logic
         
         src/main/java/com/fortinet/questionone/nodereversal/NodeUtil.java
         
    b)    Junit Test
    
    Please run NodeUtilTest.java for Junit Test from the below path
    
        src/test/java/com/fortinet/questionone/nodereversal/NodeUtilTest.java
        
Question - 2
Describe the Scenario : Observer Pattern

 Consider a scenario where the news publisher wants to publish it's news to the different types  of subscriber as soon as the new news comes in. This creates a one to many relationship  between the news publisher and its subscribers and hence I am using a Observer design  pattern where the subscriber will be notified as soon as the news is posted by the  news publisher they subscribed to. In this implementation the SMS subscriber and Mail subscriber  both gets notified as soon as the news is set by the Business News Publisher.

Advantage :
 1) Decouple an object from those that want to watch it.
 2) Observer can take what they want by registering or unregistering from the publisher
 3) Observer need not have to pull information from the publiher.

Please Run MainNewsDemo.java in the below path for implementation of the Observer Pattern

    src/main/java/com/fortinet/questiontwo/designpattern/MainNewsDemo.java

Question - 3 

a) What is Session in Hibernate?

Answer :
The hibernate architecture has many objects and session is one of them. A session object represents a database connection and once we have a Session object we can perform all the CRUD (Create, Read, Update, Delete ) operation. We can get a session by calling an open session method of the SessionFactory interface. 
The object which is not passed to the save method of the session then such object becomes a transient object. After we save the object using the save method of the session then such object becomes persistent and once we close the session then such object goes in detached state i.e this object is not associated with the session.

b) How would you control transaction with Spring & Hibernate? Answer with different scenarios.

Answer:-

Transaction management plays an important role to ensure the data consistency in the database. Spring support both programmatic and declarative transactions. With Programmatic Transactions, the transaction management code like commit code when everything goes successful or rolling back the transaction when something goes wrong can be clubbed with the business logic. On the other hand with Declarative Transactions separates business logic from transaction management code. Spring uses Aspect-Oriented Programming to support declarative transactions via XML configuration or @Transactional annotation. Spring supports many transaction managers to delegate the transaction management task. For instance, it uses hibernate transaction manager when our application uses Hibernate like below.
<bean id=”transactionManager” 
                      class=”org.springframework.orm.hibernate3.HibernateTransactionManager>
                     <property name=”sessionFactory” ref= “sessionFactory” />
     </bean>
When using the @Transactional annotation without any parameter then by default  Propagation mode is set to REQUIRED, ReadOnly is set to false and the isolation level is set to the database default which is generally READ_COMMITTED. It is always good practice to specify the ReadOnly attribute as it increases the performance of the application.
The transaction propagation which is REQUIRED by default means that the same transaction will propagate from a transactional caller to transaction which is called.  It will either create a new transaction or reuse the one if available. If a read only transaction calls a read write transaction method then the complete transaction will be read  only.
When we have multiple transactions within an application that run against the database we need to isolate the underlying the data for each transaction which can be controlled by specifying Isolation level in the @Transactional annotation. 
Examples of the Isolation used by  the springs to resolve database anomalies such as Dirty Reads, Non-Repeatable Reads, and Phantom Reads are as follows

ISOLATION_READ_UNCOMMITTED:  The transaction can read uncommitted data and this is where anomalies like dirty reads, non repeatable reads and phantom reads can occur.  

ISOLATION_READ_COMMITED:  This level ensures that our transaction reads only committed data from the database. We can avoid dirty reads using this isolation level but other anomalys can still occur.

ISOLATION_REPEATABLE_READ: This is the most used isolation level. It is used to prevent all the anomaly except Phantom reads. 

ISOLATION_SERIALIZABLE: This is the highest isolation level. Though this prevents all the three  anomaly like dirty reads, non repeatable reads and phantom reads,The excessive use of this isolation will decreases the overall performance of the application as no two transaction can work on same set of the data at the same time.
