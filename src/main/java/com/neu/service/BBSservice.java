package com.neu.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Invitation;
import com.neu.entity.Reply;

public interface BBSservice<T> {
	int insert(T entity);
	int update(T entity);
	int delete(int id);
	List<T> getAll();
	T getById(int id);
	int getcount(int id);
	PageInfo<T> getPaged(int pageNum,int pageSize,Map<String, Object> params);
	List<T> selectLike(String like);
	List<T> getPaged(int pageNum, String like, int pageSize, Map<String, Object> params);
}
