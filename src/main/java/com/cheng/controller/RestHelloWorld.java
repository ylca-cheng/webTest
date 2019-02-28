/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： RestHelloWorld.java
 * 注意事项：
 * Id: RestHelloWorld.java,v3.0 2018/7/9 niecheng Exp
 * ==============================================
 */
package com.cheng.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
@Path("/helloWorld")
public class RestHelloWorld {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json;charset=UTF-8")
    public String sayHelloWorld(){
        return "Hello ZY!!!大苏打";
    }

}
/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */