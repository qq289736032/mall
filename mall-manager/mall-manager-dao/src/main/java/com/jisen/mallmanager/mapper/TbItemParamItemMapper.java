package com.jisen.mallmanager.mapper;

import pojo.TbItemParamItem;

public interface TbItemParamItemMapper {
    void insert(TbItemParamItem tbItemParamItem);

    TbItemParamItem selectItemParamByItemId(Long itemId);
}
