<h1></h1>
<p><i>
“DAO stands for Data Access Object. Usually, the DAO class is responsible for two concepts. 
Encapsulating the details of the persistence layer and provide a CRUD interface for a single entity.”
</p></i>

<p>
DAOs are supported by Spring to make it easy to work with different data access technologies like JDBC, Hibernate,
JPA, or JDO in a consistent way. Switching between the aforementioned persistence technologies becomes easy thanks to the DAOs layer.</p>
<p>In order to code without worrying about catching exceptions that are specific to each technology each DAO class has to be marked with @Repository annotation.</p>
<p>DAOs should be placed in the dao package.
Each entity class should have a respective DAO. 
</p>
