## Request

Una request o una solicitud es un mensaje que se lleva a cabo desde un cliente a un servidor para acceder a determinado servicio.
Una request utiliza el protocolo HTTP (Hypertext transfer protocol).
Tiene una serie de componentes para poder ser llevada a cabo:

* Método: se utiliza para indicar bajo qué verdbo HTTP se enviará un mensaje. HTTP utiliza varios dependiendo del tipo de solicitud, los más conocidos pueden ser: GET, POST, PUT, DELETE..
* URL: hace referencia a la direccion en donde se encuenta el servidor y a la cual el cliente está enviando la solicitud o request.
* Header: contiene atributos o especificaciones necesarias para una correcta comunicación, por ejemplo, en qué formato se enviará la información (JSON, XML, etc). si se necesita autenticación, etc.
* Body: es la información que se envía al servidor, por ejemplo, si se está creando un nuevo usuario, el body contendrá la información del usuario.

## Librerías vs Frameworks

Librerías y frameworks son herramientas que se utilizan para facilitar el desarrollo de software. Sin embargo, tienen diferencias importantes.

* Las librerías son un conjunto de funciones que se pueden utilizar para realizar tareas específicas. Por ejemplo, una librería de matemáticas puede contener funciones para realizar operaciones matemáticas como sumar, restar, multiplicar, etc. Las librerías se pueden utilizar en cualquier proyecto y no imponen una estructura específica.
* Frameworks, por otro lado, son un conjunto de librerías y reglas que definen la estructura de un proyecto. Los frameworks imponen una forma de trabajar y facilitan el desarrollo de software al proporcionar una estructura predefinida. Por ejemplo, un framework web puede definir cómo se deben organizar los archivos de un proyecto, cómo se deben manejar las rutas, cómo se deben manejar las solicitudes HTTP, etc.

## Maven vs Gradle

Maven y Gradle son herramientas de gestión de dependencias y construcción de proyectos en Java. Ambas herramientas permiten gestionar las dependencias de un proyecto y automatizar el proceso de construcción del software. Sin embargo, tienen diferencias importantes.

* Maven utiliza XML, un lenguaje de marcado extensible, para definir la configuración del proyecto. Maven utiliza un modelo de construcción basado en fases, en el que se definen una serie de fases (como compilar, empaquetar, probar, etc.) y se ejecutan en un orden predefinido. Maven no admite la compilación incremental y es pensado para poca personalización.
* Gradle utiliza un lenguaje de dominio específico (DSL) basado en Groovy o Kotlin para definir la configuración del proyecto. Gradle es más flexible y permite una mayor personalización que Maven. Gradle utiliza un modelo de construcción basado en tareas, lo que permite definir tareas personalizadas y ejecutarlas de forma independiente. Gradle también admite compilaciones incrementales y tiene un rendimiento similar a Maven.

# Spring

Spring es un framework de desarrollo de aplicaciones Java que proporciona una infraestructura completa para el desarrollo de aplicaciones. Spring se basa en el principio de inversión de control (IoC) y la inyección de dependencias (DI) para facilitar el desarrollo de aplicaciones. Spring proporciona una serie de módulos que se pueden utilizar para desarrollar diferentes tipos de aplicaciones, como aplicaciones web, aplicaciones de escritorio, aplicaciones móviles, etc.
Cuenta con una platadorma con varias herramientas:

* Spring boot: es un proyecto de Spring que facilita la creación de aplicaciones Java autónomas. Spring Boot proporciona una serie de características que facilitan el desarrollo de aplicaciones, como la configuración automática, la gestión de dependencias, la integración con servidores de aplicaciones, etc.
* Spring data: utilizado para la administración, manejo y comunicación con bases de datos. Tanto relacionales como no-relacionales.
* Spring security: utilizado para la seguridad de las aplicaciones. Proporciona una serie de características para proteger las aplicaciones, como la autenticación, la autorización, la protección contra ataques, etc.
* Spring web services: utilizado para el desarrollo de servicios web. Proporciona una serie de características para desarrollar servicios web, como la creación de servicios RESTful, la integración con servicios SOAP, la validación de datos, etc.
* Spring cloud: utilizado para el desarrollo de aplicaciones en la nube. Proporciona una serie de características para desarrollar aplicaciones en la nube, como la gestión de configuraciones, la gestión de servicios, la monitorización, etc.

# Spring vs Spring Boot

Spring boot es una extension de spring y fue creado para facilitar el desarrollo de aplicaciones web, bajo el concepto de "Just Run" (solo ejecutar).
Antes de spring boot, en spring se tardaba mucho en codificar y configurar el proyecto, se realizaba una congiguracion manuial de archivo xml y de un servidor de aplicaciones web.

## Patrones de Diseño

Los patrones de diseño son soluciones generales a problemas comunes que se encuentran al diseñar software. Los patrones de diseño proporcionan una forma de reutilizar soluciones probadas y probadas para problemas comunes y ayudan a los desarrolladores a comunicarse de manera efectiva sobre el diseño de software. Hay varios tipos de patrones de diseño, como patrones de creación, patrones estructurales, patrones de comportamiento, etc. Algunos ejemplos de patrones de diseño son:

* Singleton: se utiliza para garantizar que una clase solo tenga una instancia y proporciona un punto de acceso global a esa instancia.
* Factory: se utiliza para crear objetos sin especificar la clase exacta de objeto que se creará.
* Observer: se utiliza para definir una dependencia uno a muchos entre objetos de modo que cuando un objeto cambia de estado, todos sus dependientes son notificados y actualizados automáticamente.
* Strategy: se utiliza para definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables.
* Decorator: se utiliza para agregar funcionalidad a un objeto dinámicamente.
* Adapter: se utiliza para permitir que dos interfaces incompatibles trabajen juntas.
* **MVC: se utiliza para separar la lógica de presentación de la lógica de negocio y la lógica de acceso a datos en una aplicación.**
* **DTO: tiene como finalidad crear un objeto plano (POJO) con una serie de atributos que pueden ser enviados o recuperados en una misma invocación. Un DTO puede contener datos de multiples clases, fuentes o tablas de una base de datos y agruparlos en una única clase simple.**

# API

Aplication Programming Interface, es un conjunto de funciones y procedimientos que se usan para diseñar e integrar el software de diferentes aplicaciones. Esto permite que dos aplicaciones puedan comunicarse entre si aunque esten desarrolladas en diferentes lenguajes.
Los más comúnes son mediante REST (Representational State Transfer) y SOAP (Simple Object Access Protocol).

## APIs REST

Se caracteriza por no tener estado alguno (la api necesita de datos para devolver una respuesta), y logra interconexiones mediante mensajes HTTP del tipo XML o JSON.

### Metoodos HTTP

* GET: se utiliza para solicitar información de un recurso.
* POST: se utiliza para enviar información a un recurso. Tamboién se puede usar para actualizar un dato pero es considerado una mala práctica.
* PUT: se utiliza para actualizar información de un recurso.
* DELETE: se utiliza para eliminar información de un recurso.
* PATCH: se utiliza para actualizar parcialmente la información de un recurso.

## Metodos REST en Spring boot

Para configurar un metodo GET se usa @GetMapping, para POST @PostMapping, para PUT @PutMapping, para DELETE @DeleteMapping y para PATCH @PatchMapping.
```
@GetMapping
public String sayHello(){
return "Primera prueba";
}
```
Para realizar un POST con un body, se debe usar @RequestBody
```
@PostMapping("/person")
    public String crearPersona(@RequestBody Person p1) {
        return "El nombre es: " + p1.getName() + "\n" +
                "El apellido es: " + p1.getLastName() + "\n" +
                "La age es: " + p1.getAge();
    }
```
Para devolver un status code personalizado se debe usar ResponseEntity
```
@GetMapping("/responses")
    ResponseEntity<String> testStatusCode() {
        return new ResponseEntity<>("This is the response body", HttpStatus.CREATED);
    }
```
