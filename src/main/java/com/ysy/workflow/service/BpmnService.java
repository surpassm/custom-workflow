package com.ysy.workflow.service;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface BpmnService {
    /**
     * 1、生成对应BPMN.xml文件
     *
     * @param values values
     */
    void insert(List<Map<Integer, String>> values);
}
