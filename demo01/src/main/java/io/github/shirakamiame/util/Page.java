package io.github.shirakamiame.util;

import lombok.Data;

import java.util.List;

@Data
//分页相关的数据
public class Page<T> {
    List<T> list;
    //    页面当前页码
    int current;
    //    页面显示的数据条数
    int size;
    //    总的数据条数
    int total;
    //    末页
    int end;
}

