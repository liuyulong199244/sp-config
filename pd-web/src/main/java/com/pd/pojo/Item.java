package com.pd.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/8/29.
 */
@Data
public class Item implements Serializable{

    @Field("id")
    private String id;
    @Field("title")
    private String title;
    @Field("sellPoint")
    private String sellPoint;
    @Field("price")
    private Long price;
    @Field("image")
    private String image;
}
