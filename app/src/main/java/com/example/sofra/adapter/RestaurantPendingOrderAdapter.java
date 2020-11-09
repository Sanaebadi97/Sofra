package com.example.sofra.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sofra.R;
import com.example.sofra.data.pojo.order.OrderData;
import com.example.sofra.databinding.ItemRestaurantOrderPendingBinding;

import java.util.ArrayList;
import java.util.List;


public class RestaurantPendingOrderAdapter extends RecyclerView.Adapter<RestaurantPendingOrderAdapter.ViewHolder> {
    private final Context context;
    private final Activity activity;
    private List<OrderData> restaurantOrderDataList = new ArrayList<>();

    public RestaurantPendingOrderAdapter(Activity activity, List<OrderData> restaurantOrderDataList) {
        this.context = activity;
        this.activity = activity;
        this.restaurantOrderDataList = restaurantOrderDataList;
    }


    @NonNull
    @Override
    public RestaurantPendingOrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemRestaurantOrderPendingBinding.inflate(LayoutInflater.from(parent.getContext())
                , parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantPendingOrderAdapter.ViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }

    private void setData(RestaurantPendingOrderAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(restaurantOrderDataList.get(position).getClient().getPhotoUrl())
                .into(holder.binding.itemRestaurantOrderPendingImageView);

        holder.binding.itemRestaurantOrderPendingTextViewCustomerName.setText(restaurantOrderDataList.get(position).getClient().getName());
        holder.binding.itemRestaurantOrderPendingTextViewOrderNumber.setText(context.getString(R.string.item_order_number
                , restaurantOrderDataList.get(position).getItems().get(0).getPivot().getOrderId()));
        holder.binding.itemRestaurantOrderPendingTextViewTotal.setText(context.getString(R.string.item_order_total
                , restaurantOrderDataList.get(position).getTotal()));
        holder.binding.itemRestaurantOrderPendingTextViewAddress.setText(context.getString(R.string.item_order_total
                , restaurantOrderDataList.get(position).getAddress()));
    }


    private void setAction(final RestaurantPendingOrderAdapter.ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return restaurantOrderDataList == null ? 0 : restaurantOrderDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemRestaurantOrderPendingBinding binding;

        public ViewHolder(@NonNull ItemRestaurantOrderPendingBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
