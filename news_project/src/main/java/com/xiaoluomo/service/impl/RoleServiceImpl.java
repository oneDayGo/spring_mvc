package com.xiaoluomo.service.impl;

import com.xiaoluomo.dao.RoleDao;
import com.xiaoluomo.po.Role;
import com.xiaoluomo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> findRoleList() {

        return this.roleDao.selectRoleList();
    }
}
