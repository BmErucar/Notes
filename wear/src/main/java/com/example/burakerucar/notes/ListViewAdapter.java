package com.example.burakerucar.notes;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by burakerucar on 20/07/17.
 */

public class ListViewAdapter extends ArrayAdapter<Note> {

    public ListViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Note> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (position == 0) {
            return LayoutInflater.from(this.getContext()).inflate(R.layout.new_note, parent, false);
        }
            convertView = LayoutInflater.from(this.getContext()).inflate(android.R.layout.simple_expandable_list_item_1, parent, false);

            Note note = getItem(position);

            TextView title = (TextView) convertView.findViewById(android.R.id.text1);

            title.setText(note.getTitle());

            return convertView;

        }


    }


