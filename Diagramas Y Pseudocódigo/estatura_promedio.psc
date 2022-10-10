Algoritmo estatura_promedio
	Definir suma,estatura,contador Como Entero;
	Definir promedio Como Real;
	
	suma=0;
	contador= 0;
	promedio = 0;
	estatura = 0;
	
	Escribir 'Escribir estatura: ';
	Leer estatura;
	
	Mientras estatura>0 Hacer
		suma=suma+estatura;
		contador = contador+1;
		Leer estatura;
	FinMientras 
	
	Si contador=0 Entonces
		Escribir 'No hay estaturas para calcular.';	
	Sino
		promedio =suma/contador;
		Escribir 'La altura promedio es: ', promedio;
	FinSi
	
FinAlgoritmo
