/**
 * 
 */
/**
 * @author YY小主
 *	时间处理的包
 *	1、学习和练习时间处理相关方法和思路
 *
 *
 *	2、整理Java 中处理时间的类和方法
 *
 *
 *
 *
 *
 *
 *
 */
package com.junz.dateConvert;


/**
 * JS 中时间的处理
 * 
 * 1、js中 new Date() 默认的就是格林威治时间格式，带时区的
 * 
 * me._GMTtoNormal = function(time) {
		var year = time.getFullYear();
		var month = time.getMonth() + 1;
		var day = time.getDate();
		//补齐格式
		if(month < 10) {
			month = "0" + month;
		}
		if(day < 10) {
			day = "0" + day;
		}
		var timeStr = year + "-" + month + "-" + day;
		return timeStr;
	}
 * 
 */ 
