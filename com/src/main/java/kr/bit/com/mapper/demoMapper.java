package kr.bit.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.bit.com.vo.vo;

@Mapper
public interface demoMapper {
    public List<vo> showList();
}
