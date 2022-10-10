Algoritmo primos
	Definir x,contador Como Entero
	Escribir 'Escribe un número: '
	Leer n
	contador <- 0
	x <- 1
	Mientras x<=n Hacer
		Si n MOD x==0 Entonces
			contador <- contador+1
		SiNo
			contador <- contador
		FinSi
		x <- x+1
	FinMientras
	Si contador==2 Entonces
		Escribir 'El número ',n,' es primo.'
	SiNo
		Escribir 'El número ',n,' no es primo.'
	FinSi
FinAlgoritmo
