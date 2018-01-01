package com.example.app7;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static final int TYPE_PULL_IMAGE = 0;

        public static final int TYPE_RIGHT_IMAGE = 1;

        public static final int TYPE_THREE_IMAGE = 2;

        private Bean object;

        private Context context;



        public MyAdapter(Bean object, Context context) {

            this.object=object;

            this.context = context;

        }

        @Override

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            if(viewType==TYPE_PULL_IMAGE){

                View view= LayoutInflater.from(context).inflate(R.layout.item2,parent,false);

                ViewHolder2 holder2=new ViewHolder2(view);

                return holder2;

            }else if(viewType==TYPE_RIGHT_IMAGE){

                View view=LayoutInflater.from(context).inflate(R.layout.item3,parent,false);

                ViewHolder1 holder1=new ViewHolder1(view);

                return holder1;

            }else {

                View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

                ViewHolder holder = new ViewHolder(view);

                return holder;

            }

        }


        @Override

        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            if (holder instanceof ViewHolder2){
              List<Bean.DataBean.Ad1Bean> list=object.data.ad1;
              List<String> images=new ArrayList<>();
               for (int i=0;i<list.size();i++){
                   images.add(list.get(i).image);
                }
                ((ViewHolder2) holder).banner.setImages(images).setImageLoader(new GlideImageLoader()).isAutoPlay(true).setViewPagerIsScroll(true).start();
            }

            if(holder instanceof ViewHolder1){
                ((ViewHolder1) holder).recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
              ((ViewHolder1) holder).recyclerView.setAdapter(new MyAdapter2(context,object.data.ad5));
            }

            if(holder instanceof ViewHolder){
                    Uri uri=Uri.parse(object.data.subjects.get(0).goodsList.get(position).goodsImage);
                    ((ViewHolder) holder).sdv.setImageURI(uri);


            }

        }
        @Override
        public int getItemCount() {
            return 12;
        }



        @Override

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {

            super.onAttachedToRecyclerView(recyclerView);

            RecyclerView.LayoutManager manager=recyclerView.getLayoutManager();

            if(manager instanceof GridLayoutManager){

                final GridLayoutManager gridLayoutManager= (GridLayoutManager) manager;

                gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                    @Override

                    public int getSpanSize(int position) {

                        int type=getItemViewType(position);

                        switch (type){

                            case TYPE_PULL_IMAGE:

                                return 2;

                            case TYPE_RIGHT_IMAGE:

                                return 2;

                            case TYPE_THREE_IMAGE:

                                return 1;

                        }

                        return 0;

                    }

                });

            }

        }



        @Override

        public int getItemViewType(int position) {

            if (position==0){

                return TYPE_PULL_IMAGE;

            }else if(position==1)

            {

                return TYPE_RIGHT_IMAGE;

            }else

                return TYPE_THREE_IMAGE;

        }



public class ViewHolder extends RecyclerView.ViewHolder {
    SimpleDraweeView sdv;
    public ViewHolder(View itemView) {
        super(itemView);
        sdv=itemView.findViewById(R.id.sdv);
    }
}
public class ViewHolder1 extends RecyclerView.ViewHolder{
   RecyclerView recyclerView;

    public ViewHolder1(View itemview){

        super(itemview);
     recyclerView=itemview.findViewById(R.id.rlv2);

    }

}

public class ViewHolder2 extends RecyclerView.ViewHolder{

    Banner banner;

    public ViewHolder2(View itemview){

        super(itemview);

        banner=itemview.findViewById(R.id.banner);

    }

}

}