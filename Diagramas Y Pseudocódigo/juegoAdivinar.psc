Algoritmo juegoAdivinar
	Definir numIntentos,numIntro,numCorrecto Como Entero;
	numIntentos = 10;
	Escribir "Introducir el n�mero (del 1 al 100): ";
	Leer numIntro;
	numCorrecto=azar(100)+1;
	Si numIntro <= 0 O numIntro > 100 Entonces
		Escribir "El n�mero tiene que ser entre el 1 y el 100.";
		Leer numIntro;
	Sino
		Mientras ((numIntro <> numCorrecto)Y(numIntentos >= 1)) Hacer
					Si numIntro > numCorrecto Entonces
						Escribir "El n�mero introducido es mayor que el correcto.Int�ntelo de nuevo:";
					SiNo
						Si numIntro < numCorrecto Entonces
							Escribir "El n�mero introducido es menor que el correcto.Int�ntelo de nuevo:";
						FinSi
					FinSi
					numIntentos = numIntentos -1;
					Escribir "Quedan ",numIntentos, " intentos.";
					Leer numIntro;
				Fin Mientras
				Si numIntro = numCorrecto Entonces
					Escribir "El n�mero es correcto :D";
				SiNo
					Si numIntentos = 0 Entonces
						Escribir "Se acabaron los intentos."
					FinSi
		FinSi
	FinSi
FinAlgoritmo
