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


import com.dao.JichangguanggaoDao;
import com.entity.JichangguanggaoEntity;
import com.service.JichangguanggaoService;
import com.entity.vo.JichangguanggaoVO;
import com.entity.view.JichangguanggaoView;

@Service("jichangguanggaoService")
public class JichangguanggaoServiceImpl extends ServiceImpl<JichangguanggaoDao, JichangguanggaoEntity> implements JichangguanggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JichangguanggaoEntity> page = this.selectPage(
                new Query<JichangguanggaoEntity>(params).getPage(),
                new EntityWrapper<JichangguanggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JichangguanggaoEntity> wrapper) {
		  Page<JichangguanggaoView> page =new Query<JichangguanggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JichangguanggaoVO> selectListVO(Wrapper<JichangguanggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JichangguanggaoVO selectVO(Wrapper<JichangguanggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JichangguanggaoView> selectListView(Wrapper<JichangguanggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JichangguanggaoView selectView(Wrapper<JichangguanggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
