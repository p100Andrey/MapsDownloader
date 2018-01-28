package giggss.i.ua.mapsdownloader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class EuropeContinent extends Activity {
    EuropeContinent[] europeContinents = new EuropeContinent[]{
            new Europe(R.mipmap.earth, "Albania"),
            new Europe(R.mipmap.earth, "Andorra"),
            new Europe(R.mipmap.earth, "Austria"),
            new Europe(R.mipmap.earth, "Azores"),
            new Europe(R.mipmap.earth, "Belarus"),
            new Europe(R.mipmap.earth, "Belgium"),
            new Europe(R.mipmap.earth, "Bosnia and Herzegovina")
            new Europe(R.mipmap.earth, "Bulgaria")
            new Europe(R.mipmap.earth, "Croatia")
            new Europe(R.mipmap.earth, "Cyprus")};

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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) view;
        String strText = textView.getText().toString(); // получаем текст нажатого элемента

        if(strText.equalsIgnoreCase(getResources().getString(R.string.name1))) {
            // Запускаем активность, связанную с определенным
            startActivity(new Intent(this, EuropeContinent.class));
        }
    }
}
