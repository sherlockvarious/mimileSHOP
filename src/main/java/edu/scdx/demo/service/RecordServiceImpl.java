package edu.scdx.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.scdx.demo.dao.ManagerRecordMapper;
import edu.scdx.demo.entity.ManagerRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    ManagerRecordMapper recordMapper;
        public boolean addRecord(ManagerRecord record){
            if (recordMapper.insertSelective(record)==1){
                return true;
            }
            return false;
        }
    @Override
    public PageInfo<ManagerRecord> findRecord(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<ManagerRecord> records = recordMapper.selectByExample(null);
        return new PageInfo<>(records);
    }
}

