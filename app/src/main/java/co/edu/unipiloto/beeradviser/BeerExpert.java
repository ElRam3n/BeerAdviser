package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String beerType){
        List<String> brands = new ArrayList<>();
        switch (beerType){

            case "light":
                brands.add("Corona");
                brands.add("Miller Lite");
                brands.add("Bud Light");
                brands.add("Pilsen");
                break;

            case "amber":
                brands.add("Red Stripe");
                brands.add("Fat Tire");
                brands.add("Dos Equis Ambar");
                break;

            case "brown":
                brands.add("Newcastle Brown Ale");
                brands.add("Samuel Adams Brown");
                brands.add("Brooklyn Brown Ale");
                break;

            case "dark":
                brands.add("Guinness");
                brands.add("Negra Modelo");
                brands.add("Murphy's Irish Stout");
                break;

            default:
                brands.add("No recommendations available");
                break;
        }
        return brands;
    }

}
