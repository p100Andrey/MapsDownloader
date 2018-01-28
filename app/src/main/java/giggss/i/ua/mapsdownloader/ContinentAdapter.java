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

public class ContinentAdapter extends ArrayAdapter<Continent>{

    Context context;
    int layoutResourceId;
    Continent data[] = null;

    public ContinentAdapter(@NonNull Context context, int layoutResourceId, Continent[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ContinentHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ContinentHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

            row.setTag(holder);
        }
        else
        {
            holder = (ContinentHolder) row.getTag();
        }

        Continent continent = data[position];
        holder.txtTitle.setText(continent.name);
        holder.imgIcon.setImageResource(continent.image);

        return row;
    }

    static class ContinentHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
