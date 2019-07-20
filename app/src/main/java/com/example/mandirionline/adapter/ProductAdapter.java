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

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<ProductResponse> mDataset;

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private ImageView imageView;
        public TextView titleProduct;
        public TextView subTitleProduct;
        public TextView validDate;
        public TextView nameMerchant;
        public ProductViewHolder(View v) {
            super(v);
            imageView = (ImageView)  v.findViewById(R.id.image_product);
            titleProduct = (TextView) v.findViewById(R.id.title_product);
            subTitleProduct = (TextView) v.findViewById(R.id.subtitle_product);
            validDate = (TextView) v.findViewById(R.id.valid_date);
            nameMerchant = (TextView) v.findViewById(R.id.name_merchant);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ProductAdapter(List<ProductResponse> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        ProductViewHolder vh = new ProductViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        ProductResponse product = mDataset.get(position);
        Picasso.get().load(product.getImageUrl().getUrl()).into(holder.imageView);
        holder.titleProduct.setText(product.getTitleProduct());
        holder.subTitleProduct.setText(product.getSubtitleProduct());
        holder.validDate.setText(product.getExpDate());
        holder.nameMerchant.setText(product.getNameMerchant());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
