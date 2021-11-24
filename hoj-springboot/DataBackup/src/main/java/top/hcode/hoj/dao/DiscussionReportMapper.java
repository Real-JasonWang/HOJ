package top.hcode.hoj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.hcode.hoj.pojo.entity.discussion.DiscussionReport;

@Mapper
@Repository
public interface DiscussionReportMapper extends BaseMapper<DiscussionReport> {
}
