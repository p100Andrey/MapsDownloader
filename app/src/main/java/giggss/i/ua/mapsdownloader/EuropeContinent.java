package giggss.i.ua.mapsdownloader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class EuropeContinent extends AppCompatActivity {
    Europe[] europeContinents = new Europe[]{
            new Europe(R.mipmap.flag, "Albania", R.mipmap.download),
            new Europe(R.mipmap.flag, "Andorra", R.mipmap.download),
            new Europe(R.mipmap.flag, "Austria", R.mipmap.download),
            new Europe(R.mipmap.flag, "Azores", R.mipmap.download),
            new Europe(R.mipmap.flag, "Belarus", R.mipmap.download),
            new Europe(R.mipmap.flag, "Belgium", R.mipmap.download),
            new Europe(R.mipmap.flag, "Bosnia and Herzegovina", R.mipmap.download),
            new Europe(R.mipmap.flag, "Bulgaria", R.mipmap.download),
            new Europe(R.mipmap.flag, "Croatia", R.mipmap.download),
            new Europe(R.mipmap.flag, "Cyprus", R.mipmap.download)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe_layout);

        ListView lv21 = findViewById(R.id.ListView21);

        EuropeAdapter adapterEurope = new EuropeAdapter(this,
                R.layout.listview_item_row, europeContinents);

//        View header = (View) getLayoutInflater().inflate(R.layout.listview_header_row, null);
//        lv12.addHeaderView(header);

        lv21.setAdapter(adapterEurope);
    }
}
