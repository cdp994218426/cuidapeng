package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.Plate;
import com.neu.entity.PlateExample;
import com.neu.mapper.PlateMapper;
@Service
public class PlateServiceImp implements PlateService {
	@Autowired
	private PlateMapper plateMapper;
	
	@Override
	public int insert(Plate entity) {
		return 0;
	}

	@Override
	public int update(Plate entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Plate getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public PageInfo<Plate> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plate> getAll() {
		PlateExample plate = new PlateExample();
		List<Plate> p = plateMapper.selectByExample(plate);
		return p;
	}

	

	@Override
	public int getcount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
