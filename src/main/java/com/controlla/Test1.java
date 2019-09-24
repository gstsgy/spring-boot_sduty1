package com.controlla;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.Response;

@RestController
public class Test1 {
	
	@GetMapping(value="test")
	public Response test() {
		return new Response(200,"成功","测试数据");
	}

}
