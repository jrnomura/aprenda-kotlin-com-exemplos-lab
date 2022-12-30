// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel{BASICO, INTERMEDIARIO, AVANCADO}


data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val tempo: Int, val nivel: Nivel)

data class Formacoes(val nome: String, val curso: List<ConteudoEducacional>){

 val matricula = mutableListOf<Usuario>()

 fun addUsuario(usuario: Usuario){
   matricula.add(usuario)
}

 fun getAddUsuario(){
  for(usuario in matricula){
    println("Nome: ${usuario.nome} - Email: ${usuario.email}")
      }
   }

 fun imprimirConteudoEducacional(){
  for(cursos in curso){
    println("Nome: ${cursos.nome} - Tempo: ${cursos.tempo} - Nivel: cursos.nivel")
   }
  }
}


  fun main(){
 val moduloJava = ConteudoEducacional("Linguagem Java", 150, Nivel.BASICO)

 val moduloKotlin = ConteudoEducacional("Linguagem Kotlin", 120, Nivel.BASICO)

 val listaCursos = mutableListOf<ConteudoEducacional>()
 listaCursos.add(moduloJava)
 listaCursos.add(moduloKotlin)

 val jorge = Usuario("Jorge", "jorge@gmail.com")
 val maria = Usuario("Maria", "maria@gmail.com")

 val treinamentoAndroid = Formacoes("Curso Android", listaCursos)
 treinamentoAndroid.addUsuario(jorge)
 treinamentoAndroid.addUsuario(maria)

 println("$treinamentoAndroid")

 println(" ")
 
 println("Cursos")
 println(listaCursos)
 
 println(" ")
 
 println("Alunos Matriculados: ")
 println(treinamentoAndroid.getAddUsuario())

}
