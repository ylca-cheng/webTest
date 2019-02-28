/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： StartApplication.java
 * 注意事项：
 * Id: StartApplication.java,v3.0 2018/7/9 niecheng Exp
 * ==============================================
 */
package com.cheng.test;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * <p>功能:无。</p>
 * <p>说明:无。</p>
 * <p>备注:无。</p>
 * <p>
 * <pre>@version 3.0</pre>
 * <pre>@author 公司名 : 上海金仕达卫宁软件科技有限公司（Shanghai KingStar WinningSoft LTD.）
 *          变更履历
 *          2018/7/9 : niecheng : 代码做成</pre>
 */
public class StartApplication extends ResourceConfig{
    /**
     * Register JAX-RS application components.
     */
    public StartApplication() {
        //register(AuthRequestFilter.class);
        packages("com.cheng.controller");
    }

}
/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */