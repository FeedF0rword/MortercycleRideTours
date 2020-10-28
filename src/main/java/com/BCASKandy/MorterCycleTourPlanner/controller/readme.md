<h1>Add the Controllers Here as Packages</h1>
<p>The controller layer is in charge of handling a request from the moment when it is intercepted to the generation of the response and its transmission.</p>
<p>What a controller does is to call one or more service layer functions. It also manages the deserialization of the request and the serialization of the response, through the DTO layer. Avoiding passing DTOs as parameters to the service layer (or to receive them from it) allows the system to be highly decoupled and keep the service layer completely independent from data representation. To achieve this defining a new layer may be necessary, as described in the Extras section. </p>
<p>Controllers should be placed in the controller package, and each controller class has to be marked with @RestController (or @Controller) annotation.</p>
<p>
Best practices recommend declaring a version for each function, then each API. In fact, this layer should be kept versioned to support multiple versions of an API at the same time. </p>
