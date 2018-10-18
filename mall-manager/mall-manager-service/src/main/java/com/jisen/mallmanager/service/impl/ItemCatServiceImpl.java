package com.jisen.mallmanager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jisen.mallmanager.mapper.TbItemCatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.jisen.mallmanager.service.ItemCatService;
import pojo.EasyUITreeNode;
import pojo.TbItemCat;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getCatList(Long parentId) {
        // 1、根据parentId查询节点列表
        //设置查询条件
        List<TbItemCat> list = itemCatMapper.getItemCatByParentId(parentId);
        // 2、转换成EasyUITreeNode列表。
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent() ? "closed" : "open");
            //添加到列表
            resultList.add(node);
        }
        // 3、返回。
        return resultList;
    }
}
