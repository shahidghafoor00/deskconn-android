package org.deskconn.deskconn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.deskconn.deskconn.utils.DeskConn;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<DeskConn.Service> mServices;

    MyAdapter(List<DeskConn.Service> services) {
        mServices = services;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(mServices.get(position).getHostName());
    }

    @Override
    public int getItemCount() {
        return mServices.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.name);
        }
    }
}
