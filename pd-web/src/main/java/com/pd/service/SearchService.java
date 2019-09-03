package com.pd.service;

import com.pd.pojo.Item;

import java.util.List;

/**
 * Created by Administrator on 2019/8/29.
 */
public interface SearchService {

    List<Item> findItemByKey(String key) throws Exception;

}
