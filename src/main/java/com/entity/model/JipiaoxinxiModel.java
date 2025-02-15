package com.entity.model;

import com.entity.JipiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 机票信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 01:19:32
 */
public class JipiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 航空公司
	 */
	
	private String hangkonggongsi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 出发地
	 */
	
	private String chufadi;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 飞行方式
	 */
	
	private String feixingfangshi;
		
	/**
	 * 中转或经停的地点
	 */
	
	private String zhongzhuanhuojingtingdedidian;
		
	/**
	 * 出发时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chufashijian;
		
	/**
	 * 飞行时长
	 */
	
	private String feixingshizhang;
		
	/**
	 * 票价
	 */
	
	private Float piaojia;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 乘机地点
	 */
	
	private String chengjididian;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：航空公司
	 */
	 
	public void setHangkonggongsi(String hangkonggongsi) {
		this.hangkonggongsi = hangkonggongsi;
	}
	
	/**
	 * 获取：航空公司
	 */
	public String getHangkonggongsi() {
		return hangkonggongsi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：出发地
	 */
	 
	public void setChufadi(String chufadi) {
		this.chufadi = chufadi;
	}
	
	/**
	 * 获取：出发地
	 */
	public String getChufadi() {
		return chufadi;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
				
	
	/**
	 * 设置：飞行方式
	 */
	 
	public void setFeixingfangshi(String feixingfangshi) {
		this.feixingfangshi = feixingfangshi;
	}
	
	/**
	 * 获取：飞行方式
	 */
	public String getFeixingfangshi() {
		return feixingfangshi;
	}
				
	
	/**
	 * 设置：中转或经停的地点
	 */
	 
	public void setZhongzhuanhuojingtingdedidian(String zhongzhuanhuojingtingdedidian) {
		this.zhongzhuanhuojingtingdedidian = zhongzhuanhuojingtingdedidian;
	}
	
	/**
	 * 获取：中转或经停的地点
	 */
	public String getZhongzhuanhuojingtingdedidian() {
		return zhongzhuanhuojingtingdedidian;
	}
				
	
	/**
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
				
	
	/**
	 * 设置：飞行时长
	 */
	 
	public void setFeixingshizhang(String feixingshizhang) {
		this.feixingshizhang = feixingshizhang;
	}
	
	/**
	 * 获取：飞行时长
	 */
	public String getFeixingshizhang() {
		return feixingshizhang;
	}
				
	
	/**
	 * 设置：票价
	 */
	 
	public void setPiaojia(Float piaojia) {
		this.piaojia = piaojia;
	}
	
	/**
	 * 获取：票价
	 */
	public Float getPiaojia() {
		return piaojia;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：乘机地点
	 */
	 
	public void setChengjididian(String chengjididian) {
		this.chengjididian = chengjididian;
	}
	
	/**
	 * 获取：乘机地点
	 */
	public String getChengjididian() {
		return chengjididian;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
