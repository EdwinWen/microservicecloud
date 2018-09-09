package com.edwin.springcloud.entities;



import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by wenpuzhao on 2018/9/9.
 */



@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
    private long deptno;
    private String dname;
    private String db_source;
    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}