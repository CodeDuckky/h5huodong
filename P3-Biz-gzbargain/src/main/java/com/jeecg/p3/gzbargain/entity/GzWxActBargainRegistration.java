package com.jeecg.p3.gzbargain.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActBargainRegistration:砍价报名表<br>
 * @author junfeng.zhou
 * @since：2015年08月06日 18时46分36秒 星期四 
 * @version:1.0
 */
public class GzWxActBargainRegistration implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 *活动参与人头像
	 */
	private String head;
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	/**
	
	/**
	 * 领奖状态0:未领奖;1:已领奖
	 */
	private String awardsStatus;
	/**
	 * 对应微信平台原始id
	 */
	private String jwid;
	
	/**
	 * 是否关注（ 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。）
	 */
	private String subscribe;
	
	public String getAwardsStatus() {
		return awardsStatus;
	}
	public void setAwardsStatus(String awardsStatus) {
		this.awardsStatus = awardsStatus;
	}
	public String getJwid() {
		return jwid;
	}
	public void setJwid(String jwid) {
		this.jwid = jwid;
	}
	@Override
	public String toString() {
		return "GzWxActBargainRegistration [id=" + id + ", actId=" + actId
				+ ", openid=" + openid + ", nickname=" + nickname + ", head=" + head
				+ ", productName=" + productName + ", productPrice="
				+ productPrice + ", productNewPrice=" + productNewPrice
				+ ", createTime=" + createTime + ", awardsStatus="
				+ awardsStatus + ", jwid=" + jwid + "]";
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public String getSubscribe() {
		return subscribe;
	}
	
}
