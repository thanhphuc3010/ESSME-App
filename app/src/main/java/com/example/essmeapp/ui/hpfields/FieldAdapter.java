package com.example.essmeapp.ui.hpfields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.essmeapp.R;
import com.example.essmeapp.model.Fields;

import java.util.List;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 1:55 PM
 */
public class FieldAdapter extends RecyclerView.Adapter<FieldAdapter.FieldViewHolder> {
    private final Context context;
    private List<Fields> fields;

    public FieldAdapter(Context context) {
        this.context = context;
    }

    public void submitList(List<Fields> fields) {
        this.fields = fields;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FieldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_field, parent, false);
        return new FieldViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FieldViewHolder holder, int position) {
        Fields fields = getItem(position);
        if (fields == null) {
            return;
        }
        holder.txtField.setText(fields.getName());
    }

    @Override
    public int getItemCount() {
        if (fields != null) {
            return fields.size();
        }
        return 0;
    }

    private Fields getItem(int position) {
        return fields.get(position);
    }

//    private void bindViews(int position) {
//        Fields field = getItem(position);
//        if (field == null) {
//            return;
//        }
//    }

    public class FieldViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imgField;
        private final TextView txtField;

        public FieldViewHolder(@NonNull View itemView) {
            super(itemView);

            imgField = itemView.findViewById(R.id.imvFields);
            txtField = itemView.findViewById(R.id.txtField);
        }
    }
}
