package pojo;

import java.util.Date;

//商品类
//public abstract class Product<pro_id, pro_name, pro_price, pro_des, pro_stock, pro_date, pro_cate_id, pro_factory> {

     public Product(){
     }





    public Product(String pro_id,String pro_name, Double pro_price, String pro_des, Short pro_stock, Date pro_date, Short pro_cate_id, String pro_factory){

        this.pro_id=pro_id;

        this.pro_name=pro_name;

        this.pro_price=pro_price;

        this.pro_des=pro_des;

        this.pro_stock=pro_stock;

        this.pro_date=pro_date;

        this.pro_cate_id=pro_cate_id;

        this.pro_factory=pro_factory;
        }

}


