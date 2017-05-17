package com.ssm.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.service.MqGoodsService;



@RestController
@RequestMapping(value="/api") 
public class MqGoodsController {
	
	@Autowired MqGoodsService mqGoodsService;
	
	@RequestMapping(value={"/goodsGrid/{productsn}"}, method=RequestMethod.GET)
    public Object getProductsList(@PathVariable String productsn) {
        return mqGoodsService.selectGoodsInfoBycode(productsn);
    }
	
	@RequestMapping(value={"/mqgoods/{uniacid}"}, method=RequestMethod.GET)
	public Object getMqProductsList(@PathVariable String uniacid) {
		return mqGoodsService.findGoodsByUniacid(uniacid);
	}
}
