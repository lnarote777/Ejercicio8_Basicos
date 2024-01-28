data class Libro (val titulo : String,
                   val autor: String,
                   val nPaginas: Int,
                   val calificacion: Double)
class conjuntoLibros(val capacidad: Int) {
    val libros: Array<Libro?> = arrayOfNulls(capacidad)
    fun agregarLibro(libro: Libro): Boolean {
        for(i in libros.indices){
            if (libros[i] == null){
                libros[i] = libro
                return true
            }
        }
        return false
    }

    fun eliminarLibroTitulo(titulo: String){
        for (i in libros.indices){
            val libro = libros[i]
            if (libro?.titulo == titulo){
                libros[i] = null
            }
        }
    }

    fun eliminarLibroAutor(autor: String){
        for (i in libros.indices){
            val libro = libros[i]
            if (libro?.autor == autor){
                libros[i] = null
            }
        }
    }

    fun mostrarLibrosSegunCalificacion(){
        var mayorCalificacion : Libro? = null
        var menorCalificacion: Libro? = null

        for (libro in libros){
            if (libro != null){
                if (mayorCalificacion == null || libro.calificacion > mayorCalificacion.calificacion){
                    mayorCalificacion = libro
                }

                if (menorCalificacion == null || libro.calificacion < menorCalificacion.calificacion){
                    menorCalificacion = libro
                }
            }
        }

        if (mayorCalificacion != null && menorCalificacion != null){
            println("Mayor calificación: $mayorCalificacion")
            println("Menor calificación: $menorCalificacion")
        }

    }

    fun mostrarConjunto(){
        println("Estantería virtual")
        println("-------------------")
        for (libro in libros){
            if (libro != null) {
                println("Titulo: ${libro.titulo}, Autor: ${libro.autor}, Calificación: ${libro.calificacion}" )
            }
        }
    }

}