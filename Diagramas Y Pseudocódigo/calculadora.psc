Algoritmo calculadora
	//Definir variables
	Definir n1,n2 Como Real;
	Definir num_o Como Entero;
	//Datos de entrada
	Escribir 'Introducir dos números enteros:';
	Leer n1,n2;
	//Proceso 
	Escribir '1 = Suma | 2 = Resta | 3 = Multiplicación | 4 = División';
	Escribir 'Introducir número de la operación a realizar: '
	Leer num_op;
	Segun num_op Hacer
		1:
			suma<-n1+n2
			resultado<-suma
		2:
			resta<-n1-n2;
			resultado<-resta
		3:
			multiplicacion<-n1*n2
			resultado<-multiplicacion
		4:
			division<-n1/n2
			resultado<-division
		De Otro Modo:
			Escribir 'Debe elegir 1-4.'
	Fin Segun
	//Datos de salida
	Escribir 'El resultado de la operación es ',resultado;
FinAlgoritmo
