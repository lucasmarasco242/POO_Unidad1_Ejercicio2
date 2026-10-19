# Ejercicio 2 - Parametrización con Constructores (Mascota)

## Explicación del programa

En este ejercicio se diseñó una clase llamada `Mascota` que contiene tres atributos de instancia:
* `nombre`, de tipo `String`.
* `especie`, de tipo `String`.
* `edad`, de tipo `int`.

Además, se implementó un constructor explícito que recibe estos tres parámetros e inicializa los atributos de la instancia mediante la referencia `this`.

Luego, dentro del método `main`, se instanciaron tres objetos de tipo `Mascota` invocando al constructor parametrizado:
`Mascota mascota1 = new Mascota("firulais", "perro", 5);`
`Mascota mascota2 = new Mascota("nemo", "pez", 3);`
`Mascota mascota3 = new Mascota("juan", "caballo", 15);`

Finalmente, se utilizó `System.out.println()` para imprimir por pantalla la descripción de cada mascota utilizando concatenación de cadenas.

## Lógica utilizada

La lógica del programa consiste en:
* Crear la clase `Mascota`.
* Definir sus atributos: `nombre`, `especie` y `edad`.
* Implementar un constructor parametrizado que utilice la referencia `this` para asignar los valores recibidos a los atributos del objeto.
* Crear tres objetos (`mascota1`, `mascota2` y `mascota3`) pasando los valores correspondientes directamente al invocar al constructor.
* Mostrar los datos de cada mascota por consola utilizando concatenación.

De esta manera se puede observar cómo el uso de constructores parametrizados permite inicializar los objetos de manera directa y segura al momento de su creación.

## Resultado de la ejecución

La ejecución del programa muestra en la consola los datos correspondientes a cada objeto:
* el nombre de la mascota 1 es firulais su especie es perro y su edad es 5
* el nombre de la mascota 2 es nemo su especie es pez y su edad es 3
* el nombre de la mascota 3 es juan su especie es caballo y su edad es 15

## Captura de pantalla
<img width="1680" height="266" alt="EJercicio 2" src="https://github.com/user-attachments/assets/5d8d6980-e832-4246-a8e5-8b9afff03129" />

