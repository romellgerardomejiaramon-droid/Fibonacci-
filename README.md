La serie Fibonacci sabemos que funciona de que es una suma y el ultima numero de la operación se suma junto con el resultado de la misma operación un ejemplo 

0+1 = 1
1+1 = 2
1+2 = 3
2+3 = 5
3+5 = 8
5+8 = 13
ETC.....

La explicación del código en general y breve 

Casos base (Términos 1 y 2):
Muestran directamente los valores iniciales de la serie (a = 0 y b = 1) para arrancar la secuencia.Cálculo repetitivo 

(Términos 3 al 500):Entran a un bucle for que se repite hasta llegar a 500:
Suma: Calcula el nuevo término haciendo c = a + b.

Impresión: Muestra en pantalla la operación formateada (por ejemplo, 0 + 1 = 1).

Desplazamiento: Actualiza las variables para la siguiente vuelta:
a toma el valor de b.
b toma el valor de c.

Cierre: Al terminar las 500 iteraciones, sale del ciclo e imprime 
"Fin de la serie Fibonacci".
