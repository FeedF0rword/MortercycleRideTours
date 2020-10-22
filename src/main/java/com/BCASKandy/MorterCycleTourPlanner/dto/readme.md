<h1>DTOs Layer / (De)Serialization Layer</h1>

<p><i>“DTO or Data Transfer Objects is an object that carries data between processes. 
The motivation for its use is that communication between processes is usually done resorting to remote interfaces (e.g., web services),
where each call is an expensive operation”</i></p>
<p>
Data Transfer Objects are used to decouple data representation to (and not only) model objects. DTOs can be employed to (de)serialize data objects in several ways.
DTOs should be placed in the dto package, and since they usually require one or more mappers, a mapper sub-package may be useful as well.</p>
<p>
Multi-layered applications often require to map between different object models (e.g. entities and DTOs). Writing such mapping code is a tedious, error-prone task, and involves boilerplate code.
So, the following guide is highly recommended: <a href="https://medium.com/swlh/avoiding-boilerplate-code-with-mapstruct-spring-boot-and-kotlin-50bf5848dc7c"> Avoiding Boilerplate Code With MapStruct, Spring Boot and Kotlin</a>
</p>
