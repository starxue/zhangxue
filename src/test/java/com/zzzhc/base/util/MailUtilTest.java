package com.zzzhc.base.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;
import javax.mail.MessagingException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:servlet-context.xml")
@WebAppConfiguration
public class MailUtilTest {

    private Logger logger = LoggerFactory.getLogger(MailUtil.class);

    @Inject
    private MailUtil mailUtil;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSend() throws Exception {
        //创建邮件
        MailUtil.MailBean mailBean = new MailUtil.MailBean();
        mailBean.setSubject("reset your password");
        mailBean.setToEmails(new String[]{"fangd@126.com"});
        mailBean.setTemplate("hello ${userName} !<a href='www.baidu.com' >baidu</a>");
        Map map = new HashMap();
        map.put("userName", "Fang Dong");
        mailBean.setData(map);
        mailBean.setFromName("fangd");

        //发送邮件
        try {
            assert (mailUtil.send(mailBean));
        } catch (MessagingException e) {
            logger.error("send mail error:", e);
        }
    }

    @Test
    public void testSendWithTemplate() throws Exception {
        assert (mailUtil.send(new String[]{"fangd@126.com","fangd@guodu.net"}, "this is a test", "mail content"));
    }

    @Test
    public void testSendWithAttachments() throws Exception {
        File file = new File("logs/app.log");
        assert (mailUtil.send(new String[]{"fangd@126.com","fangd@guodu.net"}, "this is a test", "mail content", new File[]{file}));
    }

    @Test
    public void testSendWithFromNameAndAttachments() throws Exception {
        File file = new File("logs/app.log");
        assert (mailUtil.send("惠信易达征信平台", new String[]{"fangd@126.com","fangd@guodu.net"}, "测试邮件", "邮件内容可根据模板生成", new File[]{file}));
    }
}