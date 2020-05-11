package com.ysy.workflow.service.impl;

import com.ysy.workflow.service.BpmnService;
import lombok.extern.slf4j.Slf4j;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.ui.modeler.domain.Model;
import org.flowable.ui.modeler.serviceapi.ModelService;
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

    @Resource
    private ModelService modelService;
    /**
     * 1、生成对应BPMN.xml文件
     * @param values values
     */
    @Override
    public void insert(List<Map<Integer, String>> values) {
        Model model = modelService.getModel("1");
        BpmnModel bpmnModel = modelService.getBpmnModel(model);
        byte[] xmlBytes = modelService.getBpmnXML(bpmnModel);


    }
}
