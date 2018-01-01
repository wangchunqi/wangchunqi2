package com.example.app7;

import java.util.List;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public class Bean {


    public int code;
    public String msg;
    public DataBean data;

    public static class DataBean {

        public ActivityInfoBean activityInfo;
        public boolean creditRecived;
        public GoodsSpreeActivityBean goodsSpreeActivity;
        public List<SubjectsBean> subjects;
        public List<Ad1Bean> ad1;
        public List<Ad5Bean> ad5;
        public List<Ad8Bean> ad8;
        public List<DefaultGoodsListBean> defaultGoodsList;

        public static class ActivityInfoBean {

            public String activityAreaDisplay;
            public List<ActivityInfoListBean> activityInfoList;

            public static class ActivityInfoListBean {

                public String id;
                public String activityImg;
                public String activityType;
                public String activityData;
                public String activityDataDetail;
                public String activityAreaDisplay;
                public String countDownEnable;
                public String remark;
                public int sort;
            }
        }

        public static class GoodsSpreeActivityBean {

            public String id;
            public String name;
            public String startDate;
            public String endDate;
            public String status;
            public String startSeconds;
            public String endSeconds;
            public String isChecked;
            public List<GoodsListBean> goodsList;

            public static class GoodsListBean {

                public String id;
                public String goodsSpreeId;
                public String goodsId;
                public String goodsName;
                public String goodsImg;
                public double marketPrice;
                public double activityPrice;
                public int salesRatio;
                public int stockNumber;
                public int releaseNumber;
            }
        }

        public static class SubjectsBean {

            public String id;
            public String title;
            public String detail;
            public String image;
            public String start_time;
            public String end_time;
            public int show_number;
            public String state;
            public int sort;
            public String descImage;
            public String template;
            public String url;
            public String wapUrl;
            public List<GoodsListBeanX> goodsList;
            public List<String> goodsIdsList;
            public List<GoodsRelationListBean> goodsRelationList;

            public static class GoodsListBeanX {

                public String id;
                public String goods_name;
                public double shop_price;
                public double market_price;
                public String goods_img;
                public boolean reservable;
                public String efficacy;
                public int stock_number;
                public int restrict_purchase_num;
                public String goodsName;
                public String goodsImage;
                public String description;
            }

            public static class GoodsRelationListBean {

                public String id;
                public String subject_id;
                public String goods_id;
                public String goodsName;
                public String goodsImage;
                public String description;
            }
        }

        public static class Ad1Bean {

            public String id;
            public String createtime;
            public String lastupdatetime;
            public String image;
            public int ad_type;
            public int sort;
            public int position;
            public int enabled;
            public String createuser;
            public String lastupdateuser;
            public String ad_type_dynamic;
            public String ad_type_dynamic_data;
            public String ad_type_dynamic_detail;
            public String title;
            public String channelType;
            public String show_channel;
        }

        public static class Ad5Bean {

            public String id;
            public String image;
            public int ad_type;
            public int sort;
            public int position;
            public int enabled;
            public String ad_type_dynamic;
            public String ad_type_dynamic_data;
            public String ad_type_dynamic_detail;
            public String show_channel;
            public String title;
            public String url;
        }

        public static class Ad8Bean {

            public String id;
            public String image;
            public int ad_type;
            public int sort;
            public int position;
            public int enabled;
            public String description;
            public String ad_type_dynamic;
            public String ad_type_dynamic_data;
            public String ad_type_dynamic_detail;
            public String show_channel;
            public String title;
            public GoodsBean goods;

            public static class GoodsBean {

                public int collect_count;
                public boolean reservable;
                public int restriction;
                public int restrict_purchase_num;
                public boolean is_coupon_allowed;
                public int allocated_stock;
                public int is_gift;
            }
        }

        public static class DefaultGoodsListBean {

            public String id;
            public String goods_name;
            public double shop_price;
            public double market_price;
            public String goods_img;
            public boolean reservable;
            public String efficacy;
            public int stock_number;
            public int restrict_purchase_num;
        }
    }
}
