//package com.jisen.mallmanagerweb.controller;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import pojo.EasyUITreeNode;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/content/category")
//public class ContentCategoryController {
//
//    @Reference
//    private ContentCategoryService contentCategoryService;
//
//    @RequestMapping("/list")
//    @ResponseBody
//    public List<EasyUITreeNode> getContentCatList(
//            @RequestParam(value="id", defaultValue="0") Long parentId) {
//        return contentCategoryService.getContentCategoryList(parentId);
//    }
//
//    @RequestMapping("/create")
//    @ResponseBody
//    public E3Result createCategory(Long parentId, String name) {
//        return contentCategoryService.addContentCategory(parentId, name);
//    }
//}
