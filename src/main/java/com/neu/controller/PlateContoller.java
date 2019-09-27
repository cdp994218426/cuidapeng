package com.neu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Plate;
import com.neu.service.PlateService;
	@RestController
	@RequestMapping("Plate")
public class PlateContoller {
	@Autowired(required=true)
	private PlateService plateService;
	@ResponseBody
	@RequestMapping("getall")
	public  List<Plate> getPaged(){
		
		return plateService.getAll();
	}
}
