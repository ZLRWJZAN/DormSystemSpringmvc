package com.ps.dorm.service;

import com.github.pagehelper.Constant;
import com.ps.dorm.domain.DormDo;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 20:51
 */

public interface DormService {
    void add(DormDo dormDo);
    void update(DormDo dormDo);
    void delete(DormDo dormDo);
    List<DormDo> query();
    List<DormDo> dormSelectPeople();
    //@MapKey("id")
    //Map<Long, Constant> dormSelectPeople();
}
