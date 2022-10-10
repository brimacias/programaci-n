Algoritmo viaje_estudios
	Leer numAlum,cadaAlum,rentaBus;
	Si numAlum<=100 Entonces
		rentaBus <- 65.00
	SiNo
		Si numAlum>=50 Y numAlum<=99 Entonces
			rentaBus <- 70.00
		SiNo
			Si numAlum<30 Entonces
				rentaBus <- 4000.00
			FinSi
		FinSi
	FinSi
	pago <- rentaBus*numAlum
	cadaAlum <- pago/numAlum
	Escribir  'El pago total a hacer es de ',pago,' euros.'
	Escribir 'El coste a pagar por alumno es de ',cadaAlum," euros."
FinAlgoritmo
