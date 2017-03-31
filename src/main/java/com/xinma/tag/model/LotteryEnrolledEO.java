package com.xinma.tag.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.xinma.base.core.model.AccountRow;
import com.xinma.tag.model.location.AddressEO;

/**
 * 标签抽奖日志
 * 
 * @author Alauda
 *
 * @date 2015年6月30日
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LotteryEnrolledEO {

	private Date time;

	private AddressEO address;

	private AccountRow user;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public AddressEO getAddress() {
		return address;
	}

	public void setAddress(AddressEO address) {
		this.address = address;
	}

	public AccountRow getUser() {
		return user;
	}

	public void setUser(AccountRow user) {
		this.user = user;
	}
}
