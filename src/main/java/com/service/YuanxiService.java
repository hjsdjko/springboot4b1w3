package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxiView;


/**
 * 院系
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:35:05
 */
public interface YuanxiService extends IService<YuanxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiVO> selectListVO(Wrapper<YuanxiEntity> wrapper);
   	
   	YuanxiVO selectVO(@Param("ew") Wrapper<YuanxiEntity> wrapper);
   	
   	List<YuanxiView> selectListView(Wrapper<YuanxiEntity> wrapper);
   	
   	YuanxiView selectView(@Param("ew") Wrapper<YuanxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxiEntity> wrapper);
   	
}

