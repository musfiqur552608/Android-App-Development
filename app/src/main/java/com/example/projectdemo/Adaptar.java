package com.example.projectdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptar extends RecyclerView.Adapter<Adaptar.ViewHolder> {

    private List<ModelClass> userList;

    public Adaptar(List<ModelClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adaptar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptar.ViewHolder holder, int position) {
        int image = userList.get(position).getImage();
        String name = userList.get(position).getName();
        String time = userList.get(position).getTime();
        String message = userList.get(position).getMessage();

        holder.setData(image,name,time,message);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView nameT, timeT, messageT;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            nameT = itemView.findViewById(R.id.nameId);
            timeT = itemView.findViewById(R.id.timeId);
            messageT = itemView.findViewById(R.id.messageId);

        }

        public void setData(int image, String name, String time, String message) {
            imageView.setImageResource(image);
            nameT.setText(name);
            timeT.setText(time);
            messageT.setText(message);
        }
    }
}
