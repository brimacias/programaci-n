Algoritmo primos
	Definir x,contador Como Entero
	Escribir 'Escribe un n�mero: '
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
		Escribir 'El n�mero ',n,' es primo.'
	SiNo
		Escribir 'El n�mero ',n,' no es primo.'
	FinSi
FinAlgoritmo
