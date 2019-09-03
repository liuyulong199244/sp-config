package com.pd.service.impl;

import com.pd.pojo.Item;
import com.pd.service.SearchService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2019/8/29.
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SolrClient solrClient;

    @Override
    public List<Item> findItemByKey(String key) throws Exception {
        SolrQuery query = new SolrQuery(key);
        //查询前20条数据
        query.setStart(0);
        query.setRows(20);

        //执行查询并获取结果
        QueryResponse qr = solrClient.query(query);
        //把查询结果转成1组商品实例
        List<Item> items = qr.getBeans(Item.class);
        return items;
    }
}
