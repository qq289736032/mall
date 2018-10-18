package com.jisen.mallmanagerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUITreeNode;
import com.jisen.mallmanager.service.ItemCatService;

import java.util.List;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        List<EasyUITreeNode> list = itemCatService.getCatList(parentId);
        return list;
    }
}
