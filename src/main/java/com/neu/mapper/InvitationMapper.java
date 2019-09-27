package com.neu.mapper;

import com.neu.entity.Invitation;
import com.neu.entity.InvitationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvitationMapper {
    int countByExample(InvitationExample example);

    int deleteByExample(InvitationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    List<Invitation> selectByExample(InvitationExample example);
    
    List<Invitation> selectByExamples(@Param(value="like")String like);

    Invitation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Invitation record, @Param("example") InvitationExample example);

    int updateByExample(@Param("record") Invitation record, @Param("example") InvitationExample example);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}