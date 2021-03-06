package com.group.pbox.pvbs.sysconf;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.group.pbox.pvbs.clientmodel.sysconf.SysConfReqModel;
import com.group.pbox.pvbs.clientmodel.sysconf.SysConfRespModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/spring-mybatis.xml" })
public class SysConfServiceImplTest
{
    @Resource
    ISysConfService sysConfService;

    @Test
    public void getAllSysConf() throws Exception
    {
        SysConfRespModel object = sysConfService.getAllSysConf();
        assertNotNull(object);
    }

    @Test
    public void getSysConfByParams() throws Exception
    {
        SysConfReqModel param = new SysConfReqModel();
        param.setItem("Support_Ccy");
        SysConfRespModel object = sysConfService.getAllSysConfByParam(param);
        assertNotNull(object);
    }
}
