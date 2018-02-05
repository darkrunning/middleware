/**
 * 
 */
package com.owner.campus.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oliverpc
 *
 * 2018年2月5日 上午11:53:28
 */
@Controller
@RequestMapping("/demo")
public class DemoControl {
	
	@RequestMapping("info")
	public String info () {
		System.out.println("i am aa!!!");
		return "aa";
	}
}
