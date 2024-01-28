/*
Ejercicio 4.8¶
1 Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación según nos haya gustado más o menos al leerlo.

2 Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y la calificación que le damos entre 0 y 10.

3 Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo). Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor y menor calificación y, por último, mostrar un contenido de todo el conjunto.

4 En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor) hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.
 */
fun main() {
    val libro1 = Libro("Donde viven las musas (Poesía)", "Marianela Dos Santos", 140 , 9.6)
    val libro2 = Libro("Bruma Roja", "Lucía G. Sobrado", 576, 7.0)

    val Clibros = conjuntoLibros(5)

    Clibros.agregarLibro(libro1)
    Clibros.agregarLibro(libro2)

    Clibros.mostrarConjunto()
    println()
    Clibros.eliminarLibroAutor("Marianela Dos Santos")
    Clibros.eliminarLibroTitulo("Bruma Roja")

    Clibros.mostrarConjunto()
    println("Vacío")

    val libro3 = Libro("Yumi y el pintor de pesadillas", "Brando Sanderson", 551, 6.5)
    Clibros.agregarLibro(libro3)
    println()
    Clibros.mostrarConjunto()
}