# SOLID Principles

## Ronald Ottoniel Perez Hernandez
## 1290-17-2240


## Branches

Los problemas se basaron en una cafetera que prepara distintos tipos de café.
### Dependency Inversion

  * [Problema](https://github.com/Ronald021/ISHT1/tree/ht1/dependencyinversionProblem)
    
    La cafetera prepara dos tipos de café, un latte y un americano. Sin embargo la clase principal depende de dos clases que son una de cada café.
    [Diagrama de clases del problema](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/diProblem.png)
    
  * [Solucion](https://github.com/Ronald021/ISHT1/tree/ht1/dependencyinversionSolution)
    
    Se debe crear una nueva interfaz entre la clase CoffeMaker y los dos tipos de café con un método para prepararlos.
    [Diagrama de clases de la solucion](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/diSolution.png)

### Interface Segregation

  * [Problema](https://github.com/Ronald021/ISHT1/tree/ht1/interfacesegregationProblem)
    
    Para la preparación de los distintos tipos de café se tiene una interfaz con los distintos ingredientes. Sin embargo si se desea agregar uno nuevo se debe modficar la interfaz.
    [Digrama de clases del problema](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/isProblem.png)
    
  * [Solucion](https://github.com/Ronald021/ISHT1/tree/ht1/interfacesegregationSolution)
    
    Se debe crear una interfaz para cada ingrediente que se usa en la preparación y se implementan las necesarias en las clases de cada tipo de café.
    [Diagrama de clases de la solución](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/isSolution.png)

### Liskov Subtitution

  * [Problema](https://github.com/Ronald021/ISHT1/tree/ht1/liskovsubstitutionProblem)
    
    Para endulzar las comidas y bebidas existen distintos tipos de porductos, el problema es que no todos los productos se pueden usar en ciertas comidas.
    [Diagrama de clases del problema](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/liskovProblem.png)
    
  * [Solucion](https://github.com/Ronald021/ISHT1/tree/ht1/liskovsubstitutionSolution)
    
    Para solucionarlo se creó una clase con el método de endulzar y otras clases con los productos especificos que heredan dicha funcionalidad. 
    [Diagrama de clases con la solución](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/liskovSolution.png)

### Open Closed

  * [Problema](https://github.com/Ronald021/ISHT1/tree/ht1/openclosedProblem)
    
    Para la preparación de los distintos tipos de café se tiene una sola clase, si se desea agregar un nuevo tipo de café no se podría porque la clase esta cerrada a modificaciones.
    [Diagrama de clases del problema](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/opProblem.png)
    
  * [Solucion](https://github.com/Ronald021/ISHT1/tree/ht1/openclosedSolution)
    
    Para esto se añade una interfaz con un método para preparar el café, con esto se pueden crear nuevas clases que implementen dicha interfaz y puedan preparar otro tipo de café, por último se agrega una clase entre la clase principal y la interfaz que se encarga de preparar el café solicitado.
    [Diagrama de clase de la solución](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/opSolution.png)

### Single Responsability

  * [Problema](https://github.com/Ronald021/ISHT1/tree/ht1/singleresponsabilityProblem)
    
    Cuando se prepara un café se pueden entregar en vasos pequeños, medianos o grandes, sin embargo la responsabilidad de crear el café y añadir los vasos esta sobre una sola clase.
    [Diagrama de clases del problema](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/srProblem.png)
    
  * [Solucion](https://github.com/Ronald021/ISHT1/tree/ht1/singleresponsabilitySolution)
    
    Para solucionarlo se creó una clase para preparar el café y otra para añadir los vasos.
    [Diagrama de clases de la solución](https://github.com/Ronald021/ISHT1/blob/ht1/documentation/img/srSolution.png)
    
