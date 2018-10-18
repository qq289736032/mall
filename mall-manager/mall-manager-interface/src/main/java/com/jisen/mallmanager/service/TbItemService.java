package com.jisen.mallmanager.service;

import pojo.E3Result;
import pojo.EasyUIDataGridResult;
import pojo.TbItem;
import pojo.TbItemDesc;

public interface TbItemService {
    TbItem getItemById(Long itemId);
    EasyUIDataGridResult getItemList(int page, int rows);
    E3Result addItem(TbItem item, String desc);
    TbItemDesc getItemDescById(Long itemId);
}
