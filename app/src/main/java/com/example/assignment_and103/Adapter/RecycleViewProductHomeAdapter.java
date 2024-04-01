package com.example.assignment_and103.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.assignment_and103.Model.Product;
import com.example.assignment_and103.Services.Item_Product_Handle;
import com.example.assignment_and103.R;

import java.util.ArrayList;

public class RecycleViewProductHomeAdapter extends RecyclerView.Adapter<RecycleViewProductHomeAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Product> listProduct;
    private Item_Product_Handle item_product_handle;
    @NonNull
    @Override
    public RecycleViewProductHomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewProductHomeAdapter.ViewHolder holder, int position) {
        Product product = listProduct.get(position);
//        Glide.with(context).load(convertLocalhostToIpAddress(product.getImage())).error(R.drawable.kiwi_product).placeholder(R.drawable.kiwi_product).into(holder.imgProduct);
        holder.txtNameProduct.setText(product.getName());
        holder.txtQuantityProduct.setText(product.getQuantity());
        holder.txtPriceProduct.setText(product.getPrice());
    }

    @Override
    public int getItemCount() {
        return listProduct != null ? listProduct.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProduct;
        ImageButton imgBtnEdit, imgBtnDel, imgBtnCart;
        TextView txtNameProduct, txtQuantityProduct, txtPriceProduct;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            imgBtnEdit = itemView.findViewById(R.id.img_BtnEdit);
            imgBtnDel = itemView.findViewById(R.id.img_BtnDel);
            imgBtnCart = itemView.findViewById(R.id.img_BtnCart);
            txtNameProduct = itemView.findViewById(R.id.txtNameProduct);
            txtQuantityProduct = itemView.findViewById(R.id.txtQuantityProduct);
            txtPriceProduct = itemView.findViewById(R.id.txtPriceProduct);
        }
    }
}
