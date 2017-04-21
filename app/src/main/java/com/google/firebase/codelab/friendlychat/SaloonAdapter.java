package com.google.firebase.codelab.friendlychat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static java.security.AccessController.getContext;

/**
 * Created by nesab on 20/04/2017.
 */

public class SaloonAdapter extends ArrayAdapter<Saloon> {

    //tweets est la liste des models à afficher
    public SaloonAdapter(Context context, List<Saloon> messages) {
        super(context, 0, messages);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rowsaloon,parent, false);
        }

        SaloonViewHolder viewHolder = (SaloonViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new SaloonViewHolder();
            viewHolder.pseudo = (TextView) convertView.findViewById(R.id.pseudo);
            viewHolder.text = (TextView) convertView.findViewById(R.id.text);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Saloon message = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.pseudo.setText(message.getPseudo());
        viewHolder.text.setText(message.getText());
        viewHolder.avatar.setImageDrawable(new ColorDrawable(message.getColor()));

        return convertView;
    }

    private class TweetViewHolder{
        public TextView pseudo;
        public TextView text;
        public ImageView avatar;
    }

}
