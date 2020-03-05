package com.cd.test.controller;

import com.cd.test.domain.Test;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1/")
@Api(tags = {"demo模块"})
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperation("测试方法")

    @ApiResponses({
            //http code
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "成功"),
            @ApiResponse(code = HttpServletResponse.SC_CONFLICT, message = "当前用户没有做到swagger使用规范")
    })
    public String test(@Valid @RequestBody @ApiParam Test test){

        return test.getId()+ "====" +test.getName();
    }

    @GetMapping("/test/{id}")
    @ApiOperation("测试方法2222")
    public String test1(@PathVariable @ApiParam(value = "wei yi id",required = true) String id){

        return id;
    }
}
