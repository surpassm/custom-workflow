package com.ysy.workflow.bpmn;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author MC
 *
 *  常用的bpmn的属性
 */

@Getter
public enum BpmnProcessKey {
    /**
     *
     */
    ID(1,"id"),
    NAME(2,"name"),
    ISEXECUTABLE(3,"isExecutable"),
    ACTIVITIASSIGNEE(4,"activiti:assignee"),
    EXCLUSIVEDEFAULT(5,"default"),
    SOURCEREF(6,"sourceRef"),
    TARGETREF(7,"targetRef"),
    SKIPEXPRESSION(8,"skipExpression"),
    ACTIVITIEXPRESSION(9,"activiti:expression");

    Integer code;
    String value;


    BpmnProcessKey(Integer code, String value) {
        this.code = code;
        this.value = value;
    }





}
