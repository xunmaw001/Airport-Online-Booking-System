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


import com.dao.DiscussjipiaoxinxiDao;
import com.entity.DiscussjipiaoxinxiEntity;
import com.service.DiscussjipiaoxinxiService;
import com.entity.vo.DiscussjipiaoxinxiVO;
import com.entity.view.DiscussjipiaoxinxiView;

@Service("discussjipiaoxinxiService")
public class DiscussjipiaoxinxiServiceImpl extends ServiceImpl<DiscussjipiaoxinxiDao, DiscussjipiaoxinxiEntity> implements DiscussjipiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjipiaoxinxiEntity> page = this.selectPage(
                new Query<DiscussjipiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjipiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjipiaoxinxiEntity> wrapper) {
		  Page<DiscussjipiaoxinxiView> page =new Query<DiscussjipiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjipiaoxinxiVO> selectListVO(Wrapper<DiscussjipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjipiaoxinxiVO selectVO(Wrapper<DiscussjipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjipiaoxinxiView> selectListView(Wrapper<DiscussjipiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjipiaoxinxiView selectView(Wrapper<DiscussjipiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
