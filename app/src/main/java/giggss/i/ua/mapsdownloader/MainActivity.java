package giggss.i.ua.mapsdownloader;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    Continent[] continents = new Continent[]{
            new Continent(R.mipmap.earth, "Africa"),
            new Continent(R.mipmap.earth,"Asia"),
            new Continent(R.mipmap.earth, "Australia and Oceania"),
            new Continent(R.mipmap.earth, "Central America"),
            new Continent(R.mipmap.earth, "Europe"),
            new Continent(R.mipmap.earth, "North America"),
            new Continent(R.mipmap.earth, "South America")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv13 = findViewById(R.id.textView13);
        double freeBytes = Runtime.getRuntime().freeMemory() / 1000000; // Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()
        tv13.setText("Free " + freeBytes + " GB");

        double totalBytes = Runtime.getRuntime().totalMemory() / 1000000;
        ProgressBar pb11 = findViewById(R.id.progressBar11);
        pb11.setProgress((int) (totalBytes - freeBytes));

        ListView lv11 = findViewById(R.id.ListView11);

        ContinentAdapter adapter = new ContinentAdapter(this,
                R.layout.listview_item_row, continents);

        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
        lv11.addHeaderView(header);

                lv11.setAdapter(adapter);
    }
}
