package com.example.e_commerce.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerce.R;
import com.example.e_commerce.activity.Product_details_1;
import com.example.e_commerce.modle.Products;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Products> productList;

    public ProductAdapter(Context context, List<Products> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_row_item,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.prodImage.setImageResource(productList.get(position).getImageUrl());
        holder.prodPrice.setText(productList.get(position).getProductPrice());
        holder.prodName.setText(productList.get(position).getProductName());
        holder.prodQty.setText(productList.get(position).getProductQty());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Product_details_1.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                context.startActivity(intent, activityOptions.toBundle());


            }
        });

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView prodImage;
        TextView prodName,prodQty,prodPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            prodImage =  itemView.findViewById(R.id.prod_image);
            prodName =  itemView.findViewById(R.id.prod_name);
            prodPrice =  itemView.findViewById(R.id.prod_price);
            prodQty =  itemView.findViewById(R.id.prod_qty);

        }
    }

}
