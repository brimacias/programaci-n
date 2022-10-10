Algoritmo suma_Pares_Impares
	Definir num,n,c_par,c_impar Como Entero;
	Escribir 'Introducir cantidad de números: ';
	Leer n;
	//Usar PARA
	Para i=1 Hasta n Con Paso 1 Hacer
		Escribir 'Número: ',i;
		Leer num;
		Si num % 2 = 0 Entonces
			c_par = c_par + 1;
			sumaP = sumaP + num;
		Escribir 'Suma: ', sumaP;
		SiNo
			c_impar = c_impar + 1;
			sumaI = sumaI + num;
		Escribir 'Suma: ',sumaI;
		Fin Si
	Fin Para
	
FinAlgoritmo
