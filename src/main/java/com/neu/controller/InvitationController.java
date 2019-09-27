package com.neu.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.neu.entity.Invitation;
import com.neu.service.InvitationService;
import com.neu.util.GetDate;

@RestController
@RequestMapping("Invitation")
public class InvitationController {
	@Autowired()
	private InvitationService invitationService;
	
	@RequestMapping("insert")
	@ResponseBody
	public int insert(Invitation invitation){
		invitation.setAuthor("cdp");//session取
		return invitationService.insert(invitation);
	}
	
	@RequestMapping("getall")
	@ResponseBody
	public List<Invitation> getall(){
		Date Now = new Date();
		GetDate d = new GetDate();
		List<Invitation> L = invitationService.getAll();
		List<Invitation> z = new ArrayList<Invitation>();
		for(Invitation i:L) {
		 i.setTime(d.getDate(Now, i.getSubmittime()));
		 z.add(i);
		}
		return z;
	}
	
	@RequestMapping("getbyid")
	@ResponseBody
	
	public Invitation  getbyid(@RequestParam String id) {  
		return invitationService.getById(Integer.parseInt(id));
	}
	
	@RequestMapping("select")
	@ResponseBody
	public List<Invitation> select(String like) {
		Date Now = new Date();
		GetDate d = new GetDate();
		List<Invitation> L = invitationService.selectLike(like);
		List<Invitation> z = new ArrayList<Invitation>();
		for(Invitation i:L) {
		 i.setTime(d.getDate(Now, i.getSubmittime()));
		 z.add(i);
		}
		return z;
	}
}
