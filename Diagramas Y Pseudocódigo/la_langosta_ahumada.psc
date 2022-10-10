Algoritmo la_langosta_ahumada
	Definir costo Como Entero
	Leer numPersonas
	Si numPersonas<=200 Entonces
		costo <- 95.00
	SiNo
		Si numPersonas>200 Y numPersonas<=300 Entonces
			costo <- 85.00
		SiNo
			costo = 75.00
		FinSi
	FinSi
	presupuesto<-numPersonas*costo
	Escribir "El presupuesto es de ",presupuesto," euros."
FinAlgoritmo
