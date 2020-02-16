package com.bit.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName Product.java
 * @Description TODO
 * @createTime 2020年02月15日 22:38:00
 */
@Getter
@Setter
public class Product implements Serializable {
    private Long id;

    private String name;

    private Date createDate;
}