# Ordenamiento gráfico
Proyecto de aplicación de algoritmos de ordenamiento, utiliza hilos para realizar procesos en simultáneo.

## Lenguaje utilizado
* Java

## Librerias utilizadas
* jcommon-1.0.23
* jfreechart-1.0.19

## Algoritmo Bubble Sort
Es un algoritmo sencillo de ordenamiento que busca mediante repetidas comparaciones de los elementos adyacentes ordenar un conjunto de elementos.

## Algoritmo Insertion Sort
Es un algoritmo de clasificación simple que funciona de manera similar a la forma en que clasifica las cartas en sus manos.
La matriz se divide virtualmente en una parte ordenada y otra no ordenada. 
Los valores de la parte no ordenada se seleccionan y colocan en la posición correcta en la parte ordenada.

## Archivos soportados
La aplicación soporta archivos con extensión .csv, y con un formato de tabla sin cabeceras. En el lado izquierdo se colocan las leyendas de la gráfica en el eje x y
en el lado derecho las cantidades de dichas leyendas. 
Ejemplo:

| X | Y | 
|----------|:-------------:|
| China | 40 |
| Arabia | 29 |
| Perú | 94 | 
| Japón | 65 | 
| Colombia | 73 |

** Por motivos de ejemplo se colocan las cabeceras "X" y "Y", en la aplicación no utilizar.

## Graficación
Para graficar, es necesario agregarle un título a la gráfica, luego se presiona el botón de GRAFICAR. Acá veremos la gráfica con los datos ingresados.
 
## Ordenamiento
Para empezar a ordenar se selecciona la forma en que se desea ordenar (Ascendente o Descendente) y el algoritmo que se desea aplicar.
Luego, se presiona el botón de Ordenar y la gráfica se ordenará, mostrando la cantidad de pasos y el resultado de la gráfica.

## Reporte
Una vez terminado el proceso de ordenamiento se puede generar una reporte del mismo. Para realizar los reportes se crea un archivo HTML, eln el cual aparecerán 
los datos iniciales y los datos ordenados, además del tiempo, los pasos, el algortimo de ordenamiento y la forma en que se ordenó.
