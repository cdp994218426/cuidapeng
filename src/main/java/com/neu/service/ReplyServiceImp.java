package com.neu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.ConstantItem;
import com.neu.entity.ConstantItemExample;
import com.neu.entity.ConstantType;
import com.neu.entity.Reply;
import com.neu.entity.ReplyExample;
import com.neu.entity.ConstantItemExample.Criteria;
import com.neu.mapper.ReplyMapper;

@Service
public class ReplyServiceImp implements ReplyService {
	@Autowired
	private ReplyMapper replyMapper;
	
	@Override
	public int insert(Reply entity) {
		// TODO Auto-generated method stub
		return replyMapper.insert(entity);
	}

	@Override
	public int update(Reply entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Reply> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reply getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Object,Object> getPaged(int pageNum,String like,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        ReplyExample reply = new ReplyExample();
		reply.or().andTopicidEqualTo(Integer.parseInt(like));
        List<Reply>  re = replyMapper.selectByExample(reply);
        PageInfo<Reply> page = new PageInfo<Reply>(re);
        page.getPageNum();//当前页码
        page.getPages();//总页数
        HashMap<Object,Object> map = new HashMap<Object,Object>();
        map.put("Reply", re);
        map.put("PageNum",page.getPageNum());
        map.put("Pages", page.getPages());
        return  map; 
	}

	@Override
	public int getcount(int id) {
		// TODO Auto-generated method stub
		ReplyExample example = new ReplyExample();
		example.or().andTopicidEqualTo(id);
		return replyMapper.countByExample(example);
	}

	@Override
	public List<Reply> selectLike(String like) {
		ReplyExample reply = new ReplyExample();
		reply.or().andTopicidEqualTo(Integer.parseInt(like));
		return replyMapper.selectByExample(reply);
	}
	
}
