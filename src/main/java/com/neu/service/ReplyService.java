package com.neu.service;

import java.util.HashMap;
import java.util.List;

import com.neu.entity.Reply;

public interface ReplyService extends BBSservice<Reply> {

	HashMap<Object, Object> getPaged(int pageNum, String like, int pageSize);

}
