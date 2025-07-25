public class Main {

    public static void mostrarProfessor(String nome, String disciplina, String departamento) {
        System.out.println("Professor " + nome + " leciona " + disciplina);
        System.out.println("Departamento: " + departamento);
    }

    public static void mostrarComputador(String processador, int ram) {
        System.out.println("Processador: " + processador + ", RAM: " + ram + "GB");
        System.out.println("Computador ligado.");
    }

    public static void mostrarTelefone(String operadora, String corCapinha) {
        System.out.println("Ligando com a operadora " + operadora);
        System.out.println("Capinha de cor: " + corCapinha);
    }

    public static void mostrarCachorro(String nome, String dono, String vet) {
        System.out.println(nome + " está latindo!");
        System.out.println("Cachorro cuidado por " + vet + ", dono: " + dono);
    }

    public static void main(String[] args) {
        mostrarProfessor("Sabrina", "Java", "Exatas");
        mostrarComputador("Ryzen 5 5660g", 16);
        mostrarTelefone("Claro", "Branco");
        mostrarCachorro("Crystal", "Sabrina", "Dr. Perna Longa");
    }
}

//deu problema no meu intellij e tive que usar o vscode (emoji de coração partido)