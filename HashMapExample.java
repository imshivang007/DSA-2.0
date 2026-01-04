import java.util.*;;

public class HashMapExample {
    public static void main(String[] args){
        //Country-Population HashMap
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Adding entries to the HashMap
        countryPopulation.put("USA", 331002651);
        countryPopulation.put("India", 1380004385);
        countryPopulation.put("China", 1439323776);
        countryPopulation.put("Brazil", 212559417);
        countryPopulation.put("Russia", 145934462);

        //Displaying the HashMap
        System.out.println("Country Population:");
        System.out.println(countryPopulation);

        //Searching for a specific country
        if(countryPopulation.containsKey("India")){
            System.out.println("Population of India: " + countryPopulation.get("India"));
        } else {
            System.out.println("India not found in the map.");
        }

        //Iterating through the HashMap
        System.out.println("\nIterating through the HashMap:");

        for(Map.Entry<String, Integer> entry : countryPopulation.entrySet()){
            System.out.println("Country: " + entry.getKey() + ", Population: " + entry.getValue());
        }


    }
}
