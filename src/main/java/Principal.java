
public class Principal {

    public static void main(String[] args) {
        // Duas variáveis recebem o mesmo literal String.
        // O Java mantém um pool de Strings (String Pool).
        // Como os literais são iguais, as variáveis
        // normalmente apontam para o mesmo objeto.
        String a = "Java";
        String b = "Java";

        // O operador new cria explicitamente novos objetos.
        // Cada chamada de new cria um objeto String distinto,
        // mesmo que o conteúdo seja igual ao de outro objeto.
        String c = new String("Java");
        String d = new String("Java");

        System.out.println("Comparando literais:");

        // O operador == compara as referências dos objetos.
        // Como a e b apontam para o mesmo objeto,
        // o resultado é true.
        System.out.println("a == b: " + (a == b));

        // O método equals() compara o conteúdo das Strings.
        // Como ambas contêm "Java", o resultado é true.
        System.out.println("a.equals(b): " + a.equals(b));

        System.out.println("\nComparando objetos:");

        // c e d referenciam objetos diferentes,
        // criados por chamadas distintas de new.
        // Por isso, a comparação de referências retorna false.
        System.out.println("c == d: " + (c == d));

        // Apesar de serem objetos diferentes,
        // ambos possuem o conteúdo "Java".
        // Por isso, equals() retorna true.
        System.out.println("c.equals(d): " + c.equals(d));
    }
}
