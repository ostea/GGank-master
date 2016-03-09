package com.gankmz.meizi_master.model.entyty;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.Table;

import java.util.Date;

/**
 * Created by ostea on 2016/3/8.
 * 17:16
 */
@Table("meizhis")
public class MeiZhi extends Entity {
    @Column("url")
    public String url;
    @Column("type")
    public String type;
    @Column("desc")
    public String desc;
    @Column("who")
    public String who;
    @Column("used")
    public boolean used;
    @Column("createdAt")
    public Date createdAt;
    @Column("updatedAt")
    public Date updatedAt;
    @Column("publishedAt")
    public Date publishedAt;
    @Column("source")
    public String source;
    @Column("imageWidth")
    public int imageWidth;
    @Column("imageHeight")
    public int imageHeight;

}
