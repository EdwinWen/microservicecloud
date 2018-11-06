package com.edwin.springcloud.entities;



import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by wenpuzhao on 2018/9/9.
 */



@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable // entity-- orm -- db_table
{
    private long deptno; // 主键
    private String dname; // 部门名称
    private String db_source; // 数据库
    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
