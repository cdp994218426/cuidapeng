package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.github.pagehelper.PageInfo;
import com.neu.entity.Invitation;
import com.neu.entity.InvitationExample;
import com.neu.entity.PlateExample;
import com.neu.mapper.InvitationMapper;

@Service
public class InvitationServiceImpl implements InvitationService {
	
	@Autowired
	private InvitationMapper InvitationMapper;
	
	@Override
	public int insert(Invitation entity) {
		return InvitationMapper.insert(entity);
	}

	@Override
	public int update(Invitation entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Invitation getById(int id) {
		// TODO Auto-generated method stub
		InvitationExample example = new InvitationExample();
		example.or().andIdEqualTo(id);
		return  (InvitationMapper.selectByExample(example)).get(0);
	}
	@Override
	public PageInfo<Invitation> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invitation> getAll() {
		// TODO Auto-generated method stub
		InvitationExample example = new InvitationExample();
		example.setOrderByClause("submittime desc");
		return InvitationMapper.selectByExample(example);	
	}
	@Override
	public List<Invitation> selectLike(String like) {
		// TODO Auto-generated method stub
		return InvitationMapper.selectByExamples(like);	
	}
	
	@Override
	public int getcount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
