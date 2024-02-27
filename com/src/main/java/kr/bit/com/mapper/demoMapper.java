package kr.bit.com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface demoMapper {
    public List<Map<String, Object>> showList();
}
