Algoritmo SumaNotaTeoricaPractica
	Definir nota,teorica,practica Como Real;
	Definir n Como Entero;
	Repetir
		Escribir 'num alumnos:';
		Leer n;
		
		Si n<1 Entonces
			Escribir 'Debe ser mayor que 0.';
		Fin Si
	Hasta Que n > 0
	
		Para i=1 Hasta n Con Paso 1 Hacer
			Escribir 'Introducir nota teórica: ';
			Leer teorica;
			Escribir 'Introducir nota práctica: ';
			Leer practica;
			
			nota = (teorica*0.6)+(practica*0.4);
			Escribir 'Nota: ',nota;
		Fin Para
FinAlgoritmo
