package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Date:2018/12/9
 * Author:WDejin
 * Desc:
 */
public interface BrandMapper extends Mapper<TbBrand> {

     List<TbBrand> queryAll();

}
