package CollectionOptional.exercicios;

/*
* 1 - Crie um Optional de um determinado tipo de dado
* Crie com estado vazio, estado presente e com null
* Se presente exiba o valor no console
* Se vazio lance uma exceção IlegalStateException
* Se presente transforme o valor e exiba no console
* Se presente pegue o valor do Optional e atribua a uma variável
* Se presente filtre o Optional com uma determinada regra de negócio
* */

import java.util.Optional;

public class ExercicioPropostoOptional {
    public static void main(String[] args) {
        //Criação de tipos de Optionals
        Optional<Double> optionalDouble = Optional.of(32.6);
        Optional<String> optionalString = Optional.of("Ok");
        Optional<Integer> optionalInt = Optional.of(21);
        Optional<Long> optionalEmpty = Optional.empty();
        Optional<String> optionalNull = Optional.ofNullable(null);

        //Imprimindo Optionals
        System.out.println(optionalInt);
        System.out.println(optionalDouble);
        System.out.println(optionalString);
        System.out.println(optionalEmpty);
        System.out.println(optionalNull);

        //Condicional se presente
        if (optionalEmpty.isPresent() || optionalNull.isPresent() || optionalDouble.isPresent() || optionalString.isPresent() || optionalInt.isPresent()){
            System.out.println("\nOptional presente");
        }

        System.out.println("");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Optional não está presente"));
        optionalDouble.ifPresentOrElse(System.out::println, () -> System.out.println("Optional não está presente"));
        optionalInt.ifPresentOrElse(System.out::println, () -> System.out.println("Optional não está presente"));
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Optional não está presente"));
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Optional não está presente"));

        //Se presente transformar e exibir no console
        System.out.println("");
        optionalDouble.map((valor) -> valor.intValue()).ifPresent(System.out::println);

        //Se presente atribua a uma variável
        if (optionalInt.isPresent()){
            System.out.println("");
            Integer existeOptionalInt = optionalInt.get();
            System.out.println(existeOptionalInt);
        }


        //Condicional se vazio criar exceção
        if (optionalEmpty.isEmpty() || optionalNull.isEmpty() || optionalDouble.isEmpty() || optionalString.isEmpty() || optionalInt.isEmpty()){
            System.out.println("\nOptional vazio");
            optionalEmpty.orElseThrow(IllegalStateException::new);
        }

    }
}
