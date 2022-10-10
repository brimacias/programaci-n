Algoritmo dias_años
	//A partir de un número de días, calcular el número de días,semanas,meses y años son.
	//Definir variables
	Definir anios,meses,dias Como Entero;
	//Datos de Entrada
	Escribir "Número de días: ";
	Leer numDias;
	dias = numDias;
	//Proceso
	//Años 365 días
	anios = trunc(numDias/365);
	//30 días
	meses = trunc((numDias-(anios*365))/30);
	//7 días
	dias = trunc(dias-((anios*365)+(meses*30)));
	
	//Datos de Salida
	Escribir "Años: ",anios;
	Escribir "Meses: ",meses;
	Escribir "Días: ",dias;
	//Información de años,meses,semanas
FinAlgoritmo
