package com.ysy.workflow.controller;

import com.ysy.workflow.service.BpmnService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@CrossOrigin
@RestController
@RequestMapping("/bpmn/")
public class BpmnController {

    @Resource
    private BpmnService bpmnService;







    /**
     * 1、生成对应BPMN.xml文件
     *
     * @param values values
     * @return ResponseEntity
     */
    @PostMapping("v1/insert")
    public ResponseEntity insert(@RequestBody @NotNull List<Map<Integer, String>> values) {
        bpmnService.insert(values);
        return null;
    }
    //2、生成对应工作流实例

}
