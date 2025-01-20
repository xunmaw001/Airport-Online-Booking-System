package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JichangguanggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JichangguanggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JichangguanggaoView;


/**
 * 机场广告
 *
 * @author 
 * @email 
 * @date 2022-04-20 01:19:33
 */
public interface JichangguanggaoService extends IService<JichangguanggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JichangguanggaoVO> selectListVO(Wrapper<JichangguanggaoEntity> wrapper);
   	
   	JichangguanggaoVO selectVO(@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);
   	
   	List<JichangguanggaoView> selectListView(Wrapper<JichangguanggaoEntity> wrapper);
   	
   	JichangguanggaoView selectView(@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JichangguanggaoEntity> wrapper);
   	

}

