Programación Orientada a Objetos en lenguaje Java

En este repositorio se encuentran las atividades que realizamos en el laboratorio de la facultad para entender la creación de clases, crear objetos e instancias, invocar métodos y utlizar constructores.
El objetivo fue que el alumno aplicara los conceptos básicos de la programación orientada a objetos en un lenguaje de programación. 


Teoría básica
Objeto
La idea fundamental de la programación orientada a objetos y de los lenguajes queimplementan este paradigma de programación es combinar (encapsular) en una únicaunidad tanto los datos como las funciones que operan (manipulan) sobre los datos. Esta unidad de programación se denomina objeto. Entonces, un objeto es una encapsulación genérica de datos y de los procedimientos para manipularlos. En otras palabras, un objeto no es más que un conjunto de atributos (variables o datos) y métodos (o funciones) relacionados entre sí. El objeto es el centro de la programación orientada a objetos. Un objeto es algo que se visualiza, se utiliza y que juega un papel o un rol en el dominio del problema del programa. La estructura interna y el comportamiento de un objeto, en consecuencia, no es prioritario durante el modelado del problema.

Clase
En el mundo real existen varios objetos de un mismo tipo, o de una misma clase, por lo que una clase equivale a la generalización de un tipo específico de objetos. Una clase es una plantilla que define las variables y los métodos que son comunes para todos los objetos de un cierto tipo. Una clase es la implementación de un tipo abstracto de datos y describe no solo los atributos (datos) de un objeto sino también sus operaciones (comportamiento).En Java para definir una clase se utiliza la palabra reservada class seguida del nombre de la clase.
            class NombreDeLaClase
En UML una clase se representa de manera gráfica con 3 rectángulos dispuestos de manera vertical uno debajo de otro. En el primero se anota el nombre de la clase, en el segundo los atributos y en el tercero las operaciones, es decir:

Instancia
Una vez definida la clase se pueden crear objetos a partir de ésta, a este proceso se le conoce como crear instancias de una clase o instanciar una clase. En este momento el sistema reserva suficiente memoria para el objeto con todos sus atributos. Una instancia es un elemento de una clase (un objeto). Cada uno de los objetos o instancias tiene su propia copia de las variables definidas en la clase de la cual son
instanciados y comparten la misma implementación de los métodos. Sin embargo, cada objeto asigna valores a sus atributos y es totalmente independiente de los demás. En Java para crear una instancia se utiliza el operador new seguido del nombre de la clase y un par de paréntesis.
            new NombreDeLaClase( );

MensajesNormalmente un único objeto por sí solo no es muy útil. Los objetos interactúan enviándose mensajes unos a otros. Tras la recepción de un mensaje el objeto actuará. La acción puede ser el envío de otros mensajes, el cambio de su estado, o la ejecución de cualquier otra tarea que se requiera que haga el objeto. Los objetos de un programa interactúan y se comunican entre ellos por medio de mensajes. Cuando un objeto A quiere que otro objeto B ejecute uno de sus métodos, el objeto A manda un mensaje al objeto B. En ocasiones, el objeto que recibe el mensaje necesita más información para saber exactamente lo que tiene que hacer. Esta información se pasa junto con el mensaje en forma de parámetro. En Java para que un objeto ejecute algún método se utiliza el operador punto:
            objeto.nombreDelMetodo( parametros );

Métodos
Los métodos especifican el comportamiento de la clase y sus instancias. En el momento de la declaración hay que indicar cuál es el tipo del parámetro que devolverá el método o void También se debe especificar el tipo y nombre de cada uno de los parámetros o argumentos del método entre paréntesis. Si un método no tiene parámetros el paréntesis queda vacío (no es necesario escribir void). Los parámetros de los métodos son variables locales a los métodos y existen sólo en el interior de estos. Los argumentos pueden tener el mismo nombre que los atributos de la clase, de ser así, los argumentos “ocultan” a los atributos. Para acceder a los atributos en caso de ocultación se referencian a partir del objeto actual this. En Java se declara un método de manera similar a las funciones en C:
            tipoDato nombreDelMetodo( tipoDato parametro1, tipoDato parametro2, …)en caso de que no devuelva nada.

Sobrecarga de métodos
La sobrecarga de métodos permite usar el mismo nombre de un método en una clase, pero con diferentes argumentos (y, opcionalmente, con diferentes valores de retorno). Los métodos sobrecargados hacen más cómoda la implementación de un objeto y, por ende, la utilización de los métodos del mismo. Los métodos sobrecargados:
   Deben tener el mismo nombre.
   Deben cambiar la lista de argumentos.
   Pueden cambiar el valor de retorno.
   Pueden cambiar el nivel de acceso.
Java permite métodos sobrecargados (overloaded), es decir, métodos distintos que tienen  el mismo nombre, pero que se diferencian por el número y/o tipo de los argumentos.Por ejemplo:
          public void imprimePunto( )
          public void imprimePunto(int x, int y)
          public void imprimePunto(float r, float th)
A la hora de llamar a un método sobrecargado, Java sigue algunas reglas para determinar el método concreto que debe llamar:
   Si existe el método cuyos argumentos se ajustan exactamente al tipo de los argumentos de la llamada (argumentos actuales), se llama ese método.
   Si no existe un método que se ajuste exactamente, se intenta promover los argumentos actuales al tipo inmediatamente superior (cast implícito) y se llama el método correspondiente.
   Si sólo existen métodos con argumentos de un tipo más restringido, el programador debe hacer un cast explícito en la llamada, responsabilizándose de esta manera de lo que pueda ocurrir.
   El valor de retorno no influye en la elección del método sobrecargado. En realidad es imposible saber desde el propio método lo que se va a hacer con él. No es posible crear dos métodos sobrecargados, es decir con el mismo nombre, que sólo difieran en el valor de retorno. 




Desarrollo de la práctica
Desarralomos diferentes tipos de clase 

