package com.ysy.workflow.service.impl;

import com.ysy.workflow.service.BpmnService;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Slf4j
@Service
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
public class BpmnServiceImpl implements BpmnService {

    /**
     * 部署流程定义
     */
    @Resource
    private RepositoryService repositoryService;

    /**
     * 启动流程实例
     */
    @Resource
    private RuntimeService runtimeService;

    /**
     * 1、生成对应BPMN.xml文件
     * @param values values
     */
    @Override
    public void insert(List<Map<Integer, String>> values) {



    }
}