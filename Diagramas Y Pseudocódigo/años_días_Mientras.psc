Algoritmo años_dias
	Definir anios,meses,semanas,dias Como Entero;
	//Datos de Entrada
	Escribir "Número de días: ";
	Leer numDias;
	dias = numDias;
	//Proceso 
	//Años
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
	//Información de años,meses,semanas,días
	Escribir "En ", numDias, " días hay ", anios, " año(s), ",meses," mes(es), ",semanas," semana(s) y ",dias, " dia(s)";
FinAlgoritmo
