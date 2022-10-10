Algoritmo dias
	Leer num_dias
	Si num_dias/365 = 0 Entonces
		años = num_dias/365
	SiNo
		diasRestantes = num_dias/365
		Si diasRestantes >= 30 Entonces
			meses = num_dias/30
		SiNo
			diasResMeses = num_dias/30
			Si diasResMeses >= 7 Entonces
				semanas = num_dias/7
			SiNo
				diasResta = num_dias/30
			Fin Si
		Fin Si
	Fin Si
	Escribir "Son ",años," años, ",meses," meses, ", semanas," semanas, ","y ",diasResta," dias."
FinAlgoritmo
