package org.zerock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zerock.service.SampleService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
@Log4j
public class SampleServiceTests {
	
	@Setter(onMethod_ = @Autowired)
	private SampleService service;
	
	@Test
	public void testMulti() {
		
		String str = "8888888888똥해물과 빽뚜산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
//		String str = "됩니까 다들?";
		service.addMulti(str);
		
	}
	
	@Test
	public void testAdd()throws Exception {
		
		log.info(service.getClass().getName());
		
		log.info("RESULT: " + service.doAdd("123", "456"));
		
		
		
	}
	

}
