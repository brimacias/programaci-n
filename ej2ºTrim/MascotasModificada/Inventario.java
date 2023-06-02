package ej2oTrim.Herencia.MascotasModificada;
import java.util.*;

public class Inventario {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Animales> animales = new ArrayList<>();

    public static void menuII() throws Exception {
        int num = 0;
        menuIIPrincipal();
        do {
            System.out.println("\nIntroducir número de la operación deseada: ");
            num = leInterfaz.teclado.nextInt();
            switch (num) {
                case 1 -> validacionesAlta();
                case 2 -> mostrarListaRevisionesPerros();
            }
        }while (num <=10);
    }

    public static void menuIIPrincipal() {
        System.out.println("""
                1. Validaciones de alta: 
                2.- Revisiones perros: """);
    }

    public static void validacionesAlta() throws Exception {
        System.out.println("Introducir el número de la mascota cuya información quieres comprobar.");
        int indice = teclado.nextInt();
        System.out.println("""
                1.- Validación del nombre de la mascota.
                2.- Validación de la edad.
                3.- Comprobación del estado de la mascota.""");
        System.out.println("Introducir el número de la validación: ");
        int numero = leInterfaz.teclado.nextInt();
        switch (numero) {
            case 1:
                if (animales.get(indice).getNombre().matches("[A-Z]{1}[a-z]{1,10}")) {
                    System.out.println("El nombre es válido");
                } else throw new Exception("El nombre de la mascota no es válido.");
                break;
            case 2:
                if (animales.get(indice).getEdad() >= 0) {
                    System.out.println("La edad de la mascota es válida.");
                } else throw new Exception("No se puede introducir una edad negativa.");
                break;
            case 3:
                if (!Objects.equals(animales.get(indice).getEstado(), "Se murió T-T")) {
                    System.out.println("La mascota está viva.");
                }
                break;
        }
    }

    static String getTipoAnimal(Animales a) {
        if (a instanceof Gato) {
            return "Gato";
        } else if (a instanceof Perro) {
            return "Perro";
        } else if (a instanceof Canario) {
            return "Canario";
        } else if (a instanceof Loro) {
            return "Loro";
        } else {
            return null;
        }
    }

    //private String getTipoMascotaClass(Animales m){return m.getClass().getSimpleName();}

    public static void mostrarLista(){
        System.out.println("=== LISTA DE ANIMALES ===");
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(i + ": " + getTipoAnimal(animales.get(i)) + " " + animales.get(i).getNombre());
        }
    }

    //Método que muestra la lista de las revisiones de los perros (clase HistorialRevision)
    public static void mostrarListaRevisionesPerros() {
        System.out.println("Introducir el número del perro en la lista de mascotas: ");
        int num = teclado.nextInt();
        System.out.println("---Lista de Revisiones del perro---");
        if (Inventario.animales.get(num) instanceof  Perro){
            System.out.println(num + ": " + getTipoAnimal(animales.get(num)) + " " + animales.get(num).getNombre());
            //Hasta aquí va bien
            if (getTipoAnimal(animales.get(num)).equals("Perro")) {
                ((Perro)animales.get(num)).getHistorial();
            }
        }
    }

    public static void mostrarDatosAnimal(){
        System.out.println("Introducir número de la mascota: ");
        int indice = teclado.nextInt();

        for (Animales animal : animales) {
            if (animal.getNombre().equals(animales.get(indice).getNombre())) {
                System.out.println("Tipo de mascota: " + getTipoAnimal(animal)
                        + "\nNombre: " + animal.getNombre()
                        + "\nEstado: " + animal.getEstado()
                        + "\nFecha de nacimiento: " + animal.getFechaNacimiento()
                        + "\nEdad: " + animal.getEdad());
            }
        }
    }

    public static void mostrarDatosTodos(){
        for (Animales animal : animales) {
            System.out.println("Tipo de mascota: " + getTipoAnimal(animal) +
                    "\nNombre: " + animal.getNombre()
                    + "\nEstado: " + animal.getEstado()
                    + "\nFecha de nacimiento: " + animal.getFechaNacimiento()
                    + "\nEdad: " + animal.getEdad());
            System.out.println();
        }
    }

    public static void insertarAnimal(){
        System.out.println("Introducir nombre de la mascota: ");
        String nombre = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Introducir edad: ");
        int edad = teclado.nextInt();
        System.out.println("Introducir su estado actual:");
        teclado.nextLine();
        String estado = teclado.nextLine();
        System.out.println("Introducir fecha de nacimiento de la mascota: ");
        String fechaNac = teclado.nextLine();
        System.out.println("\nIntroducir tipo de mascota: ");
        String tipo = teclado.nextLine();
        switch (tipo) {
            case "Gato":
                System.out.println("Introducir color del gato: ");
                String color = teclado.nextLine();
                System.out.println("¿Tiene el pelo largo? (true/false)");
                boolean pelo = teclado.nextBoolean();
                Animales gato = new Gato(nombre,edad,estado,fechaNac,color,pelo);
                animales.add(gato);
                break;
            case "Perro":
                System.out.println("¿De qué raza es el perro?");
                String raza = teclado.nextLine();
                System.out.println("¿Tiene pulgas? (true/false)");
                boolean pulgas = teclado.nextBoolean();
                Animales perro = new Perro(nombre,edad,estado,fechaNac,raza,pulgas);
                animales.add(perro);
                break;
            case "Loro":
                System.out.println("¿Qué tipo de pico tiene?");
                String picoLoro = teclado.nextLine();
                System.out.println("¿Puede volar? (true/false)");
                boolean vuelaLoro = teclado.nextBoolean();
                System.out.println("Origen del loro: ");
                String origen = teclado.nextLine();
                System.out.println("¿Habla? (true/false)");
                boolean habla = teclado.nextBoolean();
                Animales loro = new Loro(nombre,edad,estado,fechaNac,picoLoro,vuelaLoro,origen,habla);
                animales.add(loro);
                break;
            case "Canario":
                System.out.println("¿Qué tipo de pico tiene?");
                String picoCanario = teclado.nextLine();
                System.out.println("¿Puede volar? (true/false)");
                boolean vuelaCanario = teclado.nextBoolean();
                System.out.println("¿De qué color es?");
                String colorCanario = teclado.nextLine();
                System.out.println("¿Canta? (true/false)");
                boolean canta = teclado.nextBoolean();
                Animales canario = new Canario(nombre,edad,estado,fechaNac,picoCanario,vuelaCanario,colorCanario,canta);
                animales.add(canario);
                break;
        }
    }

    public static void eliminarAnimal() {
        System.out.println("Introducir número de la mascota: ");
        int indice = leInterfaz.teclado.nextInt();
        if (indice >= 0 && indice < animales.size()) {
            animales.remove(indice);
        }
    }

    public static void vaciarInventario(){
        animales.clear();
        System.out.println("El inventario está vacío.");
    }

    //Métodos de ordenación que sí funcionan
    public void ordenacionArrayList(){
        //Ordenado de mayor a menor por edad
        System.out.println("\nArrayList ordenado por nombre de mayor a menor: ");
        Collections.sort(animales, new Comparator<>() {
            @Override
            public int compare(Animales o1, Animales o2) {
                //Aquí se compara m1 con m2 para ordenación ascendente y no al revés
                return o1.getNombre().compareTo((o2.getNombre()));
            }
        });
        printArrayListMascota();
    }

    public void printArrayListMascota() {
        Iterator<Animales> iteradorArrayList = animales.iterator();
        int posicion = 0;
        while (iteradorArrayList.hasNext()) {
            System.out.println("Posición(" + posicion + ") = ");
            iteradorArrayList.next().muestra();
            posicion++;
        }
    }

    /* Ejemplo de búsqueda binaria recursiva con cadenas
     public int busquedaBinariaRecursiva(ArrayList<Mascotas> mascotas,String busqueda, int izquierda, int derecha) {
        //Si izquierda es mayor que derecha significa que no encontramos nada
        if (izquierda > derecha) {
            return -1;
        }
        //Calculamos las mitades
        int indiceDelElementoDelMedio = (int)Math.floor((izquierda + derecha)/2);
        String elementoDelMedio = String.valueOf(indiceDelElementoDelMedio);

        //Primero vamos a comparar y luego vamos a ver si el resultado es negativo, positivo o 0
        int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

        //Si el resultado de la comparación es 0, significa que ambos elementos son iguales y por lo tanto,
        //hemos encontrado la búsqueda
        if (resultadoDeLaComparacion < 0) {
            return indiceDelElementoDelMedio;
        }

        //Si no, entonces vemos si está a la derecha o a la izquierda
        if (resultadoDeLaComparacion < 0) {
            derecha = indiceDelElementoDelMedio -1;
            return busquedaBinariaRecursiva(mascotas,busqueda,izquierda,derecha);
        } else {
            izquierda = indiceDelElementoDelMedio + 1;
            return busquedaBinariaRecursiva(mascotas,busqueda,izquierda,derecha);
        }
    }*/

    //Búsqueda binaria

    public static int busquedaBinariaConWhile(ArrayList<Animales> animales, String busqueda) {
//
//        Collections.sort(animales, new Comparator<>() {
//            @Override
//            public int compare(Animales o1, Animales o2) {
//                return (o1.getNombre()).compareTo((o2.getNombre()));
//            }
//        });

        int izquierda = 0;
        int derecha = animales.size() - 1;

        while (izquierda <= derecha) {
            //Calculamos las mitades
            int indiceDelElementoDelMedio = (int)Math.floor((izquierda + derecha)/2);
            String elementoDelMedio = String.valueOf(indiceDelElementoDelMedio);

            //Primero vamos a comparar y ver si el resultado es negativo, positivo o 0
            int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

            //Si el resultado de la comparación es 0, significa que ambos elementos son iguales y, por lo tanto
            //quiere decir que hemos encontrado la búsqueda
            if (resultadoDeLaComparacion == 0) {
                return indiceDelElementoDelMedio;
            }

            //Si no, entonces vemos si está a la izquierda o derecha
            if (resultadoDeLaComparacion < 0) {
                derecha = indiceDelElementoDelMedio -1;
            } else {
                izquierda = indiceDelElementoDelMedio + 1;
            }
        }
        //Si no se rompió el ciclo ni regresó el índice, entonces el elemento no existe
        return -1;

        /*Implementación:
        ArrayList<Mascotas> mascota;
        String busqueda = "Kika";

        int indiceDelElementoBuscado = busquedaBinariaConWhile(mascotas, busqueda);
        sout("Con el ciclo While - El elemento buscado (" + busqueda + ") se encuentra en el indice " +
        indiceDelElementoBuscado);
         */
    }

    public static int busquedaLineal(ArrayList<Animales> animales, String busqueda) {
        int resultado = 0;
        for (Animales animal : animales) {
            if (animal.getNombre().equals(busqueda)) {
                resultado = 1;
            } else {
                resultado = -1;
            }
        }
         /*int indice = mascotas.indexOf(busqueda);
         if (indice != -1) {
             System.out.println("La búsqueda '" + busqueda + "' está en el índice " + indice);
         } else {
             System.out.println("El elemento no existe. ");
         }*/
        return resultado;
    }

    public static void menu() {
        int num = 0;
        do {
            menuPrincipal();
            System.out.println("\nIntroducir número de la operación deseada: ");
            num = leInterfaz.teclado.nextInt();
            switch (num) {
                case 1 -> mostrarLista();
                case 2 -> mostrarDatosAnimal();
                case 3 -> mostrarDatosTodos();
                case 4 -> insertarAnimal();
                case 5 -> eliminarAnimal();
                case 6 -> vaciarInventario();
            }
        } while (num <= 6) ;
    }
    public static void menuPrincipal() {
        System.out.println();
        System.out.println("""
                -----MASCOTAS-----
                1.-Mostrar lista de los animales (tipo y nombre).
                2.-Mostrar todos los datos de un animal en concreto.
                3.-Mostrar todos los datos de todos los animales.
                4.-Insertar un animal al inventario.
                5.-Eliminar un animal del inventario.
                6.-Vaciar el inventario.""");
    }
}
