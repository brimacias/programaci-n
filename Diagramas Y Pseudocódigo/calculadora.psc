Algoritmo calculadora
	//Definir variables
	Definir n1,n2 Como Real;
	Definir num_o Como Entero;
	//Datos de entrada
	Escribir 'Introducir dos n�meros enteros:';
	Leer n1,n2;
	//Proceso 
	Escribir '1 = Suma | 2 = Resta | 3 = Multiplicaci�n | 4 = Divisi�n';
	Escribir 'Introducir n�mero de la operaci�n a realizar: '
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
	Escribir 'El resultado de la operaci�n es ',resultado;
FinAlgoritmo
