package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjipiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjipiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjipiaoxinxiView;


/**
 * 机票信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-20 01:19:33
 */
public interface DiscussjipiaoxinxiService extends IService<DiscussjipiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjipiaoxinxiVO> selectListVO(Wrapper<DiscussjipiaoxinxiEntity> wrapper);
   	
   	DiscussjipiaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);
   	
   	List<DiscussjipiaoxinxiView> selectListView(Wrapper<DiscussjipiaoxinxiEntity> wrapper);
   	
   	DiscussjipiaoxinxiView selectView(@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjipiaoxinxiEntity> wrapper);
   	

}

