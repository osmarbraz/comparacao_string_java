# Demonstração de Comparação de Strings em Java

## Descrição

Este programa demonstra a diferença entre comparar referências de objetos e comparar o conteúdo de textos na linguagem Java, utilizando a classe `String`.

O exemplo utiliza o operador `==` e o método `equals()` para comparar Strings criadas de duas maneiras: por meio de literais e por meio do operador `new`.

O objetivo é mostrar que duas variáveis podem conter textos iguais, mas apontar para objetos diferentes na memória. O programa também apresenta o funcionamento do *String Pool*, mecanismo utilizado pelo Java para reutilizar determinadas instâncias de Strings.

## Objetivos

- Compreender como a classe `String` armazena e representa textos.
- Diferenciar a comparação de referências da comparação de conteúdo.
- Conhecer o funcionamento do *String Pool*.
- Entender a diferença entre atribuir um literal String e criar um objeto com `new`.
- Utilizar corretamente o método `equals()` para comparar textos.

## Funcionamento do programa

O programa está dividido em duas partes.

### 1. Comparando literais String

```java
String a = "Java";
String b = "Java";
```

As variáveis `a` e `b` recebem o mesmo literal String.

O Java mantém um conjunto de Strings reutilizáveis chamado *String Pool*. Quando literais iguais são utilizados, as variáveis normalmente referenciam o mesmo objeto do pool.

Por isso, a comparação:

```java
System.out.println(a == b);
```

retorna `true`, pois as duas referências apontam para o mesmo objeto.

Já a comparação:

```java
System.out.println(a.equals(b));
```

também retorna `true`, pois o conteúdo das duas Strings é igual.

### 2. Comparando objetos criados com `new`

```java
String c = new String("Java");
String d = new String("Java");
```

Nesse caso, o operador `new` cria explicitamente um novo objeto `String` em cada atribuição.

Mesmo que os dois objetos contenham o texto `"Java"`, eles são objetos distintos.

Por isso, a comparação:

```java
System.out.println(c == d);
```

retorna `false`, pois as referências apontam para objetos diferentes.

Entretanto:

```java
System.out.println(c.equals(d));
```

retorna `true`, porque o método `equals()` compara o conteúdo textual dos objetos.

## Código-fonte

O arquivo `Principal.java` contém a implementação completa do programa, incluindo comentários que explicam o comportamento de cada operação.

## Como executar

É necessário ter o Java Development Kit (JDK) instalado.

**1. Compile o programa:**

```bash
javac Principal.java
```

**2. Execute o programa:**

```bash
java Principal
```

## Saída esperada

```text
Comparando literais:
a == b: true
a.equals(b): true

Comparando objetos:
c == d: false
c.equals(d): true
```

## Conceitos fundamentais

### Operador `==`

Quando utilizado com variáveis que referenciam objetos, o operador `==` verifica se as referências apontam para o mesmo objeto.

Ele não compara diretamente o conteúdo textual das Strings.

### Método `equals()`

O método `equals()` da classe `String` compara o conteúdo textual dos objetos.

Duas Strings podem ser objetos distintos e ainda assim retornar `true` em uma comparação com `equals()`, desde que possuam a mesma sequência de caracteres.

### String Pool

O *String Pool* é um mecanismo do Java que permite reutilizar Strings correspondentes a literais iguais.

Por exemplo:

```java
String a = "Java";
String b = "Java";
```

Nesse caso, `a` e `b` normalmente apontam para a mesma instância compartilhada.

Por outro lado:

```java
String c = new String("Java");
String d = new String("Java");
```

Cada chamada de `new String()` cria um novo objeto, mesmo que exista uma String com o mesmo conteúdo no pool.

### Imutabilidade da classe String

A classe `String` é imutável. Isso significa que, depois de criado, o conteúdo de um objeto String não pode ser alterado. Operações que aparentemente modificam uma String produzem outra String, sem alterar o conteúdo do objeto original.

Essa característica permite que literais iguais sejam compartilhados com segurança pelo *String Pool*.

## Comparação dos resultados

| Expressão | O que compara? | Resultado |
|---|---|---|
| `a == b` | Referências dos objetos | `true` |
| `a.equals(b)` | Conteúdo textual | `true` |
| `c == d` | Referências dos objetos | `false` |
| `c.equals(d)` | Conteúdo textual | `true` |

## Conclusão

O programa demonstra que comparar referências não é o mesmo que comparar conteúdos.

O operador `==` verifica se duas variáveis referenciam o mesmo objeto, enquanto `equals()` verifica se as Strings possuem o mesmo conteúdo textual.

O *String Pool* explica por que literais iguais podem compartilhar uma referência, enquanto o uso de `new` cria objetos distintos.

Para comparar textos em Java, a recomendação é utilizar `equals()`, evitando resultados inesperados ao comparar referências com `==`.