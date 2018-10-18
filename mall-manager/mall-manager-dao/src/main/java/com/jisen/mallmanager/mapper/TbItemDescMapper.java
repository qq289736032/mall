package com.jisen.mallmanager.mapper;

import pojo.TbItemDesc;

public interface TbItemDescMapper {

    void insert(TbItemDesc tbItemDesc);

    TbItemDesc selectItemDescByPrimaryKey(Long itemId);
}
