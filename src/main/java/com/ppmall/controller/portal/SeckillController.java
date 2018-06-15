package com.ppmall.controller.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ppmall.common.ServerResponse;
import com.ppmall.service.ISeckillService;

@Controller
@RequestMapping("/kill")
public class SeckillController {
	@Autowired
	private ISeckillService iSeckillService;
	
	@RequestMapping(value = "/create_order.do")
	@ResponseBody
	public ServerResponse cerateOrder() {
		
		return iSeckillService.createOrder(0);
		
	}
	
	@RequestMapping(value = "/get_kill_url.do")
	@ResponseBody
	public ServerResponse getKillUrl() {
		
		return null;
		
	}
}
