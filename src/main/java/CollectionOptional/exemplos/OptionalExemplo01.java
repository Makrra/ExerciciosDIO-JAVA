package CollectionOptional.exemplos;

/*
* Tratamento para valores que podem ser nulos
* Possui 2 estados: Presente ou vazio
* Permite executar operações em valores que podem ser nulos sem preocupação com as famosas NullPointerExceptions
* */

import java.util.Optional;

public class OptionalExemplo01 {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");;
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null - não está presente"));

        Optional<String>  emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
