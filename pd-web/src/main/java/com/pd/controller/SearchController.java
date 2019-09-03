package com.pd.controller;

import com.pd.pojo.Item;
import com.pd.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/8/29.
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search/toSearch.html")
    public String search(String key, Model model) throws Exception {
        List<Item> itemList = searchService.findItemByKey(key);
        model.addAttribute("list",itemList);
        return "/search.jsp";
    }
}
