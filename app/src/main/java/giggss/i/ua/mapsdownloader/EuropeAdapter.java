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
    EuropeContinent data[] = null;

    public EuropeAdapter(@NonNull Context context, int layoutResourceId, EuropeContinent[] data) {
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
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

            row.setTag(holder);
        }
        else
        {
            holder = (EuropeAdapter.EuropeHolder) row.getTag();
        }

        EuropeContinent europeContinent = data[position];
        holder.txtTitle.setText(europeContinent.name);
        holder.imgIcon.setImageResource(europeContinent.image);

        return row;
    }

    static class EuropeHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
