Abstracción y encapsulamiento 




La abstracción es la habilidad de ignorar los detalles de las partes para enfocar la atención en un nivel más alto de un problema. El encapsulamiento sucede cuando algo es envuelto en una capa protectora. Cuando el
encapsulamiento se aplica a los objetos, significa que los datos del objeto están protegidos, “ocultos” dentro del objeto. En el supuesto de que los métodos de un objeto estén bien escritos, los métodos aseguran
que se pueda acceder a los datos de manera adecuada. Al hecho de empaquetar o proteger los datos o atributos con los métodos se denomina encapsulamiento.



  Abstracción 

  La abstracción es la propiedad que considera los aspectos más significativos o notables de un problema y expresa una solución en esos términos. La abstracción posee diversos grados o niveles de abstracción, los cuales ayudan a estructurar la complejidad intrínseca
que poseen los sistemas del mundo real.



  Encapsulamiento 

  La encapsulación o encapsulamiento significa reunir en una cierta estructura a todos los elementos que a un cierto nivel de abstracción se pueden considerar pertenecientes a una misma entidad, y es el proceso de agrupamiento de datos y operaciones relacionadas bajo
una misma unidad de programación, lo que permite aumentar la cohesión de los componentes del sistema.


Modificadores de acceso 

Los modificadores de acceso se utilizan para definir la visibilidad de los miembros de una clase (atributos y métodos) y de la propia clase. En Java existen tres modificadores de
acceso:
   public
   protected
   private
Sin embargo, existen cuatro niveles de acceso. Cuando no se especifica ninguno de los tres modificadores anteriores se tiene el nivel de acceso por defecto, que es el nivel de paquete. La sintaxis para los modificadores de acceso es simplemente anteponerlos a la declaración
de atributos y métodos.
                  Modificador tipoDato nombreVariable;
                  Modificador tipoDato nombreMetodo(parámetros…)


  Acceso a miembros 

Podemos reforzar la separación del qué hacer del cómo hacerlo, declarando los campos como privados y usando un método de acceso para acceder a ellos. Los métodos de acceso son el medio de acceder a los atributos privados del objeto. Son
métodos públicos del objeto y pueden ser:
             Métodos modificadores: llamamos métodos modificadores a aquellos métodos que dan lugar a un cambio en el valor de uno o varios de los atributos del objeto.
             Métodos consultores u observadores: son métodos que devuelven información sobre el contenido de los atributos del objeto sin modificar los valores de estos atributos. 


Cuando se crea una clase es frecuente que lo primero que se haga sea establecer métodos para consultar sus atributos y estos métodos suelen ir precedidos del prefijo get (getNombre, getValor, etc.) por lo que muchas veces se alude coloquialmente a ellos como
“métodos get” o “getters”. Los métodos get son un tipo de métodos consultores, porque solo consultan y devuelven el valor de los atributos de un objeto.
Se suele proceder de igual forma con métodos que permitan establecer los valores de los atributos. Estos métodos suelen ir precedidos del prefijo set (setNombre, setValor, etc.) por lo que muchas veces se alude coloquialmente a ellos como “métodos set” o “setters”. Los
métodos set son un tipo de métodos modificadores, porque cambian el valor de los atributos de un objeto.
  
