package com.perye.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.perye.upms.entity.SysLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 系统日志表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface SysLogMapper extends BaseMapper<SysLog> {

    /**
     * 多表页面信息查询
     * @param page
     * @param params
     * @return
     */
    IPage<SysLog> selectSysLogPage(Page page, @Param("params") Map<String, Object> params);

    /**
     * 多表信息查询
     * @param params
     * @return
     */
    List<SysLog> selectSysLogList(Map<String, Object> params);

}