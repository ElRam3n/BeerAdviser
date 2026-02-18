package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class ZonesExpert {
    public List<String> getStations(String zone){
        List<String> stations = new ArrayList<>();
        switch (zone){

            case "Caribe":
                stations.add("Terpel Barranquilla Centro");
                stations.add("Esso Cartagena Norte");
                stations.add("Mobil Santa Marta");
                stations.add("Texaco Valledupar");
                break;

            case "Andina":
                stations.add("Terpel Bogotá Suba");
                stations.add("Esso Medellín Poblado");
                stations.add("Brio Cali Norte");
                stations.add("Petrobras Bucaramanga");
                break;

            case "Pacífica":
                stations.add("Terpel Buenaventura");
                stations.add("Esso Tumaco");
                stations.add("Mobil Quibdó Centro");
                break;

            case "Orinoquia":
                stations.add("Terpel Villavicencio");
                stations.add("Esso Yopal");
                stations.add("Texaco Arauca");
                break;

            case "Amazonía":
                stations.add("Terpel Leticia");
                stations.add("Esso Florencia");
                stations.add("Mobil Puerto Asís");
                break;

            case "Insular":
                stations.add("Terpel San Andrés Centro");
                stations.add("Esso Providencia");
                break;

            default:
                stations.add("No hay estaciones disponibles para esta zona");
                break;
        }
        return stations;
    }
}
