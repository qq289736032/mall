//package com.jisen.mallmanagerweb.controller;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import guo.ping.e3mall.common.pojo.E3Result;
//import guo.ping.e3mall.search.mallmanagerservice.SearchItemService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class SearchItemController {
//
//    @Reference(timeout = 300000)
//    private SearchItemService searchItemService;
//
//    @RequestMapping("/index/item/import")
//    @ResponseBody
//    public E3Result impotItemIndex() {
//        E3Result result = searchItemService.importItems();
//        return result;
//    }
//}
