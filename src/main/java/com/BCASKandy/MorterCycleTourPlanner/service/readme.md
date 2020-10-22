<h1></h1>
<p><i>“The DAO layer’s main goal is to handle the details of the persistence mechanism. While the service layer stands on top of it to handle business requirements.”
</i></p>
<p>
Service classes should be defined under the service package and this layer is responsible for (but not limited to):
<ul>
<li>encapsulating the business logic;</li>
<li>defining where the transactions begin and end;</li>
<li>centralizing data access.</li></ul>
In order to define a proper service, each service class should be marked with @Service annotation. </p>
