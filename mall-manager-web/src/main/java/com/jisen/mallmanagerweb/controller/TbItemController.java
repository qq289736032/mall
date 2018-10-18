package com.jisen.mallmanagerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.E3Result;
import pojo.EasyUIDataGridResult;
import pojo.TbItem;
import com.jisen.mallmanager.service.TbItemService;

@Controller
@RequestMapping("/item")
public class TbItemController {

    @Reference
    private TbItemService tbItemService;

    @GetMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        return tbItemService.getItemById(itemId);
    }

    /**
     * 获取商品列表
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult result = tbItemService.getItemList(page, rows);
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public E3Result saveItem(TbItem item, String desc) {
        E3Result result = tbItemService.addItem(item, desc);
        return result;
    }

}
