Algoritmo a�os_dias
	Definir anios,meses,semanas,dias Como Entero;
	//Datos de Entrada
	Escribir "N�mero de d�as: ";
	Leer numDias;
	dias = numDias;
	//Proceso 
	//A�os
	Mientras dias>365 Hacer
		anios = anios+1;
		dias = dias-365;
	FinMientras
	//Meses
	Mientras dias>=30 Hacer
		meses = meses+1;
		dias = dias-30;
	FinMientras
	//Semanas
	Mientras dias>= 7 Hacer
		semanas = semanas + 1;
		dias = dias-7;
	FinMientras
	//Datos de Salida
	//Informaci�n de a�os,meses,semanas,d�as
	Escribir "En ", numDias, " d�as hay ", anios, " a�o(s), ",meses," mes(es), ",semanas," semana(s) y ",dias, " dia(s)";
FinAlgoritmo
