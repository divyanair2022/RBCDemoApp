package com.rbc.stock.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class DowJonesIndex {

	@Id
	private String id;
	
	private String  quarter;
	private String  stock;
	private Date  date;
	private String  open;
	private String  high;
	private String  low;
	private String  close;
	private String  volume;
	private String  percent_change_price;
	private String  percent_change_volume_over_last_wk;
	private String  previous_weeks_volume;
	private String  next_weeks_open;
	private String  next_weeks_close;
	private String  percent_change_next_weeks_price;
	private String  days_to_next_dividend;
	private String  percent_return_next_dividend;
	
	public DowJonesIndex() {
		super();
	}
	
	public DowJonesIndex(String quarter, String stock) {
		this.quarter = quarter;
		this.stock = stock;		
	}	
	
	public DowJonesIndex(String id, String quarter, String stock, Date date, String open, String high, String low,
			String close, String volume, String percent_change_price, String percent_change_volume_over_last_wk,
			String previous_weeks_volume, String next_weeks_open, String next_weeks_close,
			String percent_change_next_weeks_price, String days_to_next_dividend, String percent_return_next_dividend) {
		super();
		this.id = id;
		this.quarter = quarter;
		this.stock = stock;
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.percent_change_price = percent_change_price;
		this.percent_change_volume_over_last_wk = percent_change_volume_over_last_wk;
		this.previous_weeks_volume = previous_weeks_volume;
		this.next_weeks_open = next_weeks_open;
		this.next_weeks_close = next_weeks_close;
		this.percent_change_next_weeks_price = percent_change_next_weeks_price;
		this.days_to_next_dividend = days_to_next_dividend;
		this.percent_return_next_dividend = percent_return_next_dividend;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the quarter
	 */
	public String getQuarter() {
		return quarter;
	}
	/**
	 * @param quarter the quarter to set
	 */
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	/**
	 * @return the stock
	 */
	public String getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the open
	 */
	public String getOpen() {
		return open;
	}
	/**
	 * @param open the open to set
	 */
	public void setOpen(String open) {
		this.open = open;
	}
	/**
	 * @return the high
	 */
	public String getHigh() {
		return high;
	}
	/**
	 * @param high the high to set
	 */
	public void setHigh(String high) {
		this.high = high;
	}
	/**
	 * @return the low
	 */
	public String getLow() {
		return low;
	}
	/**
	 * @param low the low to set
	 */
	public void setLow(String low) {
		this.low = low;
	}
	/**
	 * @return the close
	 */
	public String getClose() {
		return close;
	}
	/**
	 * @param close the close to set
	 */
	public void setClose(String close) {
		this.close = close;
	}
	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}
	/**
	 * @return the percent_change_price
	 */
	public String getPercent_change_price() {
		return percent_change_price;
	}
	/**
	 * @param percent_change_price the percent_change_price to set
	 */
	public void setPercent_change_price(String percent_change_price) {
		this.percent_change_price = percent_change_price;
	}
	/**
	 * @return the percent_change_volume_over_last_wk
	 */
	public String getPercent_change_volume_over_last_wk() {
		return percent_change_volume_over_last_wk;
	}
	/**
	 * @param percent_change_volume_over_last_wk the percent_change_volume_over_last_wk to set
	 */
	public void setPercent_change_volume_over_last_wk(String percent_change_volume_over_last_wk) {
		this.percent_change_volume_over_last_wk = percent_change_volume_over_last_wk;
	}
	/**
	 * @return the previous_weeks_volume
	 */
	public String getPrevious_weeks_volume() {
		return previous_weeks_volume;
	}
	/**
	 * @param previous_weeks_volume the previous_weeks_volume to set
	 */
	public void setPrevious_weeks_volume(String previous_weeks_volume) {
		this.previous_weeks_volume = previous_weeks_volume;
	}
	/**
	 * @return the next_weeks_open
	 */
	public String getNext_weeks_open() {
		return next_weeks_open;
	}
	/**
	 * @param next_weeks_open the next_weeks_open to set
	 */
	public void setNext_weeks_open(String next_weeks_open) {
		this.next_weeks_open = next_weeks_open;
	}
	/**
	 * @return the next_weeks_close
	 */
	public String getNext_weeks_close() {
		return next_weeks_close;
	}
	/**
	 * @param next_weeks_close the next_weeks_close to set
	 */
	public void setNext_weeks_close(String next_weeks_close) {
		this.next_weeks_close = next_weeks_close;
	}
	/**
	 * @return the percent_change_next_weeks_price
	 */
	public String getPercent_change_next_weeks_price() {
		return percent_change_next_weeks_price;
	}
	/**
	 * @param percent_change_next_weeks_price the percent_change_next_weeks_price to set
	 */
	public void setPercent_change_next_weeks_price(String percent_change_next_weeks_price) {
		this.percent_change_next_weeks_price = percent_change_next_weeks_price;
	}
	/**
	 * @return the days_to_next_dividend
	 */
	public String getDays_to_next_dividend() {
		return days_to_next_dividend;
	}
	/**
	 * @param days_to_next_dividend the days_to_next_dividend to set
	 */
	public void setDays_to_next_dividend(String days_to_next_dividend) {
		this.days_to_next_dividend = days_to_next_dividend;
	}
	/**
	 * @return the percent_return_next_dividend
	 */
	public String getPercent_return_next_dividend() {
		return percent_return_next_dividend;
	}
	/**
	 * @param percent_return_next_dividend the percent_return_next_dividend to set
	 */
	public void setPercent_return_next_dividend(String percent_return_next_dividend) {
		this.percent_return_next_dividend = percent_return_next_dividend;
	}

	@Override
	public String toString() {
		return "DowJonesIndex [id=" + id + ", quarter=" + quarter + ", stock=" + stock + ", date=" + date + ", open="
				+ open + ", high=" + high + ", low=" + low + ", close=" + close + ", volume=" + volume
				+ ", percent_change_price=" + percent_change_price + ", percent_change_volume_over_last_wk="
				+ percent_change_volume_over_last_wk + ", previous_weeks_volume=" + previous_weeks_volume
				+ ", next_weeks_open=" + next_weeks_open + ", next_weeks_close=" + next_weeks_close
				+ ", percent_change_next_weeks_price=" + percent_change_next_weeks_price + ", days_to_next_dividend="
				+ days_to_next_dividend + ", percent_return_next_dividend=" + percent_return_next_dividend + "]";
	}
	
}
