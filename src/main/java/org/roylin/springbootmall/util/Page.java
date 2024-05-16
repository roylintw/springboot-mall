package org.roylin.springbootmall.util;

import lombok.Data;

import java.util.List;

// 11-14
@Data
public class Page<T> {

    private Integer limit;
    private Integer offset;
    private Integer total;
    private List<T> results;

}
