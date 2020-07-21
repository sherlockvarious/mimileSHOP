package edu.scdx.demo.service;

import edu.scdx.demo.dao.ManagerMapper;
import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.entity.ManagerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerMapper ManagerMapper;

    @Override
    public Manager login(Manager manager) {
        ManagerExample managerExample = new ManagerExample();
        ManagerExample.createCriteria().andManagerIdEqualTo(manager.getManagerId()).andPasswordEqualTo(manager.getPassword());
        List<Manager> managers = ManagerMapper.selectByExample(managerExample);
        return (managers.size()>0?managers.get(0):null);
        //domain  entity  pojo
    }
}
