package com.jisen.mallmanager.service;

import pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {
    List<EasyUITreeNode> getCatList(Long parentId);
}
