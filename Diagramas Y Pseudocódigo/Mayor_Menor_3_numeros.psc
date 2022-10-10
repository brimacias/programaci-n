Algoritmo Mayor_Menor_3_numeros
	Leer num1,num2,num3
	Si num1>num2 Y num1>num3 Entonces
		Escribir num1,' es el mayor.'
		Si num2>num3 Entonces
			Escribir num3,' es el menor.'
		SiNo
			Escribir num2,' es el menor.'
		FinSi
	SiNo
		Si num2>num1 Y num2>num3 Entonces
			Escribir num2, ' es el mayor.';
			Si num1>num3 Entonces
				Escribir num3, ' es el menor.';
			SiNo
				Escribir num1, ' es el menor.';
			Fin Si
		SiNo
			Si num1 = num2 O num1 = num3 O num2 = num3 Entonces
				Escribir 'Hay números iguales.';
			SiNo
				Si num1>num2 Entonces
					Escribir num2, ' es el menor.'
				SiNo
					Escribir num1, ' es el menor.'
				Fin Si
			Fin Si
		FinSi
	FinSi
FinAlgoritmo
