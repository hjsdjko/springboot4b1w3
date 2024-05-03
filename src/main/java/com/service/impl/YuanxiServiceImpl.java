package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuanxiDao;
import com.entity.YuanxiEntity;
import com.service.YuanxiService;
import com.entity.vo.YuanxiVO;
import com.entity.view.YuanxiView;

@Service("yuanxiService")
public class YuanxiServiceImpl extends ServiceImpl<YuanxiDao, YuanxiEntity> implements YuanxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiEntity> page = this.selectPage(
                new Query<YuanxiEntity>(params).getPage(),
                new EntityWrapper<YuanxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiEntity> wrapper) {
		  Page<YuanxiView> page =new Query<YuanxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxiVO> selectListVO(Wrapper<YuanxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiVO selectVO(Wrapper<YuanxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiView> selectListView(Wrapper<YuanxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiView selectView(Wrapper<YuanxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
