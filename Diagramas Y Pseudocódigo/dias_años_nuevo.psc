Algoritmo dias_a�os
	//A partir de un n�mero de d�as, calcular el n�mero de d�as,semanas,meses y a�os son.
	//Definir variables
	Definir anios,meses,dias Como Entero;
	//Datos de Entrada
	Escribir "N�mero de d�as: ";
	Leer numDias;
	dias = numDias;
	//Proceso
	//A�os 365 d�as
	anios = trunc(numDias/365);
	//30 d�as
	meses = trunc((numDias-(anios*365))/30);
	//7 d�as
	dias = trunc(dias-((anios*365)+(meses*30)));
	
	//Datos de Salida
	Escribir "A�os: ",anios;
	Escribir "Meses: ",meses;
	Escribir "D�as: ",dias;
	//Informaci�n de a�os,meses,semanas
FinAlgoritmo
