package com.example.mandirionline.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mandirionline.R;
import com.example.mandirionline.network.model.ProductResponse;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<ProductResponse> mDataset;

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public TextView titleProduct;
        public TextView subTitleProduct;
        public TextView validDate;
        public TextView nameMerchant;
        public ProductViewHolder(View v) {
            super(v);
            imageView = (ImageView)  v.findViewById(R.id.image_product);
            titleProduct = v.findViewById(R.id.title_product);
            subTitleProduct = v.findViewById(R.id.subtitle_product);
            validDate = v.findViewById(R.id.valid_date);
            nameMerchant = v.findViewById(R.id.name_merchant);
        }
    }

    public ProductAdapter(List<ProductResponse> myDataset) {
        mDataset = myDataset;
    }

    @NotNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NotNull ViewGroup parent,
                                                int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder  holder, int position) {
        ProductResponse product = mDataset.get(position);
        Picasso.get().load(product.getImageUrl().getUrl()).into(holder.imageView);
        holder.titleProduct.setText(product.getTitleProduct());
        holder.subTitleProduct.setText(product.getSubtitleProduct());
        holder.validDate.setText(product.getExpDate());
        holder.nameMerchant.setText(product.getNameMerchant());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
