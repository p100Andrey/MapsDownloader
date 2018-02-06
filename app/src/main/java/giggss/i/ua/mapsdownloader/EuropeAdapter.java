package giggss.i.ua.mapsdownloader;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EuropeAdapter extends ArrayAdapter<Europe> {

    Context context;
    int layoutResourceId;
    Europe data[] = null;

    public EuropeAdapter(@NonNull Context context, int layoutResourceId, Europe[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        EuropeAdapter.EuropeHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new EuropeAdapter.EuropeHolder();
            holder.img1 = row.findViewById(R.id.imgIcon1);
            holder.txtTitle = row.findViewById(R.id.txtTitle);
            holder.img2 = row.findViewById(R.id.imgIcon2);

            row.setTag(holder);
        }
        else
        {
            holder = (EuropeAdapter.EuropeHolder) row.getTag();
        }

        Europe europeContinent = data[position];
        holder.txtTitle.setText(europeContinent.name);
        holder.img1.setImageResource(europeContinent.image1);
        holder.img2.setImageResource(europeContinent.image2);

        return row;
    }

    static class EuropeHolder
    {
        ImageView img1;
        TextView txtTitle;
        ImageView img2;
    }
}
