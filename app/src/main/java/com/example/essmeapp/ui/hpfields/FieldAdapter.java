package com.example.essmeapp.ui.hpfields;

import androidx.annotation.NonNull;

import com.example.essmeapp.codebase.BaseSimpleAdapter;
import com.example.essmeapp.databinding.ItemFieldBinding;
import com.example.essmeapp.model.Fields;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 1:55 PM
 */
public class FieldAdapter extends BaseSimpleAdapter<Fields, ItemFieldBinding, FieldAdapter.ViewHolder> {

    public FieldAdapter() {
        super(ItemFieldBinding::inflate);
    }

    @Override
    public ViewHolder getViewHolder(ItemFieldBinding binding) {
        return new ViewHolder(binding);
    }

    public class ViewHolder extends BaseSimpleAdapter.ViewHolder<ItemFieldBinding> {

        public ViewHolder(@NonNull ItemFieldBinding binding) {
            super(binding);
        }

        @Override
        protected void bindViews(int position) {
            Fields field = getItem(position);
            binding.txtField.setText(field.getName());
        }
    }
}
