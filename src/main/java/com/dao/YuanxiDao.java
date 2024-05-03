package com.dao;

import com.entity.YuanxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxiVO;
import com.entity.view.YuanxiView;


/**
 * 院系
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:35:05
 */
public interface YuanxiDao extends BaseMapper<YuanxiEntity> {
	
	List<YuanxiVO> selectListVO(@Param("ew") Wrapper<YuanxiEntity> wrapper);
	
	YuanxiVO selectVO(@Param("ew") Wrapper<YuanxiEntity> wrapper);
	
	List<YuanxiView> selectListView(@Param("ew") Wrapper<YuanxiEntity> wrapper);

	List<YuanxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxiEntity> wrapper);
	
	YuanxiView selectView(@Param("ew") Wrapper<YuanxiEntity> wrapper);
	
}
