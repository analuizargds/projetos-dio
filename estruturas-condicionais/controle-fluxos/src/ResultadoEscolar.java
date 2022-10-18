public class ResultadoEscolar {
    
    public static void main(String[] args) {
    //     int nota = 10;

    //     //Condicional encadeana
    //     if(nota >= 7)
    //     System.out.println("Aprovado");

    //     else if (nota >= 5 && nota < 7)
    //     System.out.println("Prova Recuperação");

    //     else
    //     System.out.println("Reprovado");

        //CONDIÇÃO TERNÁRIA OU OPERADOR TERNÁRIO
        int nota = 5;
        // se nota >= 7 aprovado, senão reprovado
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        // String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação : "Reprovado";
        System.out.println(resultado);
    }

}
