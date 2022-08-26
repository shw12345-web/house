/************************* 版权声明 *********************************
 * 文件名: PayParam.java
 * 版权所有：开元信息
 * 职责：
 ************************* 变更记录 *********************************
 *
 * 创建者：CB
 *
 * 修改记录:
 * 
 *
 ******************************************************************
 */
package com.yunzhu.house.dto.other;

public class PayParam {
	
	private String cardNo;
	
	private int points;
	
	private String description;

	// 以下为积分转移参数 start -------
	private String source;

	private String detail;

	private String type;
	// 以下为积分转移参数 end -------
	
	// 以下为卡值支付参数 start -------
	private String tradeNo;

	private String password;

	private int amount;
	
	private String placeCode;
	// 以下为卡值支付参数 end -------


	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}
