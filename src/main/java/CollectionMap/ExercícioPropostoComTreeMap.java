package CollectionMap;

/*
 * Crie um Map e execute as seguintes operações:
 * - Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor;
 * - Remova o estado de Minas Gerais;
 * - Adicione o Distrito Federal;
 * - Verifique o tamanho do Mapa;
 * - Remova o estado de Mato Grosso do Sul usando o nome;
 * - Navegue em todos os registros do Map, mostrando no console o seguinte formato: Nome (Sigla);
 * - Verifique se o estado de Santa Catarina existe no map, buscando por sua sigla (SC);
 * - Verifique se o estado do Maranhão existe no map buscando por seu nome.
 * */

import java.util.TreeMap;

public class ExercícioPropostoComTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();

        //Criando Map com estados
        estados.put("RN", "Rio Grande do Norte");
        estados.put("CE", "Ceará");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("AM", "Amazonas");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("SP", "São Paulo");
        estados.put("MG", "Minas Gerais");
        estados.put("ES", "Espírito Santo");
        estados.put("MA", "Maranhão");
        estados.put("AC", "Acre");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("GO", "Goiás");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("TO", "Tocantins");
        estados.put("PA", "Pará");
        estados.put("SE", "Sergipe");
        estados.put("MT", "Mato Grosso");
        estados.put("BA", "Bahia");
        estados.put("SC", "Santa Catarina");
        estados.put("AL", "Alagoas");
        estados.put("RR", "Roraima");
        estados.put("AP", "Amapá");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("RO", "Rondônia");

        System.out.println(estados);
        System.out.println("O mapa possui " + estados.size() + " itens.");
        System.out.println("");

        //Removendo o estado de Minas Gerais pela Key
        estados.remove("MG");
        System.out.println("O mapa possui " + estados.size() + " itens.");
        System.out.println("");

        //Adicionando o Distrito Federal
        estados.put("DF", "Distrito Federal");
        System.out.println("O mapa possui " + estados.size() + " itens.");
        System.out.println("");

        //Removendo o estado de Minas Gerais pelo Value
        estados.values().remove("Mato Grosso do Sul");
        System.out.println("O mapa possui " + estados.size() + " itens.");
        System.out.println("");

        //Navegando no Mapa
//        Iterator<String> iterator = estados.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(estados.get(key) + " (" + key + ")");
//        }
//        System.out.println("");

        for(String estado : estados.keySet()){
            System.out.println(estados.get(estado) + " (" + estado + ")");
        }
        System.out.println("");

//        for(Map.Entry<String, String> estado : estados.entrySet()){
//            System.out.println(estado.getValue() + " (" + estado.getKey() + ")");
//        }
//        System.out.println("");

        //Verificando a existência de um item pela key
        System.out.println("Existe a capital de Santa Catarina? " + estados.containsKey("SC"));
        System.out.println("");

        //Verificando a existência de um item pelo nome
        System.out.println("Existe a capital do Maranhão? " + estados.containsValue("Maranhão"));
        System.out.println("");
    }
}
