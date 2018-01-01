package com.example.app7;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/30/030.
 */

class MyAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
   private Context context;
   private List<Bean.DataBean.Ad5Bean> add5bean=new ArrayList<>();

    public MyAdapter2(Context context, List<Bean.DataBean.Ad5Bean> add5bean) {
        this.context = context;
        this.add5bean = add5bean;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item4,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder=(ViewHolder)holder;
        //holder.textView=add5bean.get(position).title;
        ((ViewHolder) holder).textView.setText(add5bean.get(position).title);
        Uri uri=Uri.parse(add5bean.get(position).image);
        ((ViewHolder) holder).sdv.setImageURI(uri);
    }

    @Override
    public int getItemCount() {
        return add5bean.size();
    }
    public class  ViewHolder extends RecyclerView.ViewHolder{
        SimpleDraweeView sdv;
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            sdv=itemView.findViewById(R.id.sdv);
            textView=itemView.findViewById(R.id.title);
        }
    }
}
