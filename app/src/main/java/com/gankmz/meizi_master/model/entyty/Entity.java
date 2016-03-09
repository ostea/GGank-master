package com.gankmz.meizi_master.model.entyty;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.NotNull;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Unique;

import java.io.Serializable;

/**
 * Created by ostea on 2016/3/8.
 * 17:10
 */
public class Entity implements Serializable {

    @PrimaryKey(PrimaryKey.AssignType.AUTO_INCREMENT)
    @Column("_id")
    public long id;


    @NotNull
    @Unique
    @Column("objectId")
    public String objectId;
}
