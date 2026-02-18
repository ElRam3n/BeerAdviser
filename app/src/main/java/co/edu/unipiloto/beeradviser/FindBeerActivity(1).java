package co.edu.unipiloto.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import co.edu.unipiloto.R;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_find_beer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickFindBeer(View view){
        String beers = "";
        BeerExpert expert = new BeerExpert();

        TextView brands = findViewById(R.id.brands);

        Spinner color = findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());

        List<String> brandList = expert.getBrands(beerType);

        for (String beer:brandList) {
            beers += beer + "\n";
        }

        brands.setText(beers);

    }

    public void onClickFindStations(View view){
        String stations = "";
        ZonesExpert expert = new ZonesExpert();

        TextView zones = findViewById(R.id.zones);

        Spinner region = findViewById(R.id.region);

        String allStations = String.valueOf(region.getSelectedItem());

        List<String> brandList = expert.getStations(allStations);

        for (String beer:brandList) {
            stations += beer + "\n";
        }

        zones.setText(stations);

    }



}