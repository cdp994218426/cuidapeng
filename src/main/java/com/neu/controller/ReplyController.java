package com.neu.controller;

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
import com.neu.entity.Reply;
import com.neu.service.PlateService;
import com.neu.service.ReplyService;

@RestController
@RequestMapping("Reply")
public class ReplyController {
	@Autowired(required=true)
	private ReplyService replyService;
	@ResponseBody
	@RequestMapping("getcount")
	public int getcount(String topicid){
		return replyService.getcount(Integer.parseInt(topicid));
	}
	@ResponseBody
	@RequestMapping("insert")
	public int insert(Reply reply) {
		//session取
		reply.setAuthor("cdp");
		return replyService.insert(reply);
	}
	@RequestMapping("getReply")
	@ResponseBody
	public HashMap<Object,Object> getReply(String topicid,@RequestParam(defaultValue="1") int pageNum,@RequestParam(defaultValue="5")int pageSize) {
		return replyService.getPaged(pageNum, topicid, pageSize);
	}
}
