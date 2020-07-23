package edu.scdx.demo.service;

import com.github.pagehelper.PageInfo;
import edu.scdx.demo.entity.ManagerRecord;

public interface RecordService {
    public boolean addRecord(ManagerRecord record);
    PageInfo<ManagerRecord> findRecord(int pageNo, int pageSize);
}
