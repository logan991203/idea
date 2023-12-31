package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Menu;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2023-06-30
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据用户id查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();
}
