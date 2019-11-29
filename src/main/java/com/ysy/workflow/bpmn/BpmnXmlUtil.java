package com.ysy.workflow.bpmn;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author MC
 * <p>
 * bpmn拼接
 */
public class BpmnXmlUtil {

    /**
     * @return
     * @Description 根目录组装
     */

    public static Element getBpmnXmlRoot() {
        Element eleRoot = new Element(getbpmnValue(1013));
        eleRoot.addProperty("xmlns:", BpmnEnum.BPMN2_NAMESPACE.getValue());
        eleRoot.addProperty("xmlns:xsi", BpmnEnum.XSI_NAMESPACE.getValue());
        eleRoot.addProperty("xmlns:xsd", BpmnEnum.SCHEMA_NAMESPACE.getValue());
        eleRoot.addProperty("xmlns:activiti", BpmnEnum.ACTIVITI_EXTENSIONS_NAMESPACE.getValue());
        eleRoot.addProperty("xmlns:bpmndi", BpmnEnum.BPMNDI_NAMESPACE.getValue());
        eleRoot.addProperty("xmlns:omgdc", BpmnEnum.OMGDC_NAMESPACE.getValue());
        eleRoot.addProperty("xmlns:omgdi", BpmnEnum.OMGDI_NAMESPACE.getValue());
        eleRoot.addProperty("typeLanguage", BpmnEnum.SCHEMA_NAMESPACE.getValue());
        eleRoot.addProperty("expressionLanguage", BpmnEnum.XPATH_NAMESPACE.getValue());
        eleRoot.addProperty("targetNamespace", BpmnEnum.PROCESS_NAMESPACE.getValue());
        return eleRoot;
    }


    /**
     * @param eleRoot
     * @param mapProcess
     * @param mapStart
     * @return
     * @description真正任务开始之前的组装
     */

    public static Element bpmnXmlBeforeStartEvent(Element eleRoot, Map<Integer, String> mapProcess, Map<Integer, String> mapStart) {
        Element eP = bpmnAnalysis(1011, mapProcess);
        eleRoot.addChild(eP);
        Element elStart = bpmnAnalysis(1155, mapStart);
        eP.addChild(elStart);
        return eP;
    }


    public static Element bpmnAnalysis(Integer elementType, Map<Integer, String> map) {

        Element elementOrig = new Element(getbpmnValue(elementType));
        elementOrig.addProperty(BpmnProcessKey.ID.getValue(), map.get(BpmnProcessKey.ID.getCode()));
        elementOrig.addProperty(BpmnProcessKey.NAME.getValue(), map.get(BpmnProcessKey.NAME.getCode()));
        switch (elementType) {
            case 1095:
                elementOrig.addProperty(BpmnProcessKey.ACTIVITIASSIGNEE.getValue(), map.get(BpmnProcessKey.ACTIVITIASSIGNEE.getCode()));
                break;
            case 1011:
                elementOrig.addProperty(BpmnProcessKey.ISEXECUTABLE.getValue(), map.get(BpmnProcessKey.ISEXECUTABLE.getCode()));
                break;
            case 1150:
                elementOrig.addProperty(BpmnProcessKey.EXCLUSIVEDEFAULT.getValue(), map.get(BpmnProcessKey.EXCLUSIVEDEFAULT.getCode()));
                break;
            case 1141:
                elementOrig.addProperty(BpmnProcessKey.SOURCEREF.getValue(), map.get(BpmnProcessKey.SOURCEREF.getCode()));
                elementOrig.addProperty(BpmnProcessKey.TARGETREF.getValue(), map.get(BpmnProcessKey.TARGETREF.getCode()));
                elementOrig.addProperty(BpmnProcessKey.SKIPEXPRESSION.getValue(), map.get(BpmnProcessKey.SKIPEXPRESSION.getCode()));
                break;
            case 1094:
                //可写默认处理器xxservice
                elementOrig.addProperty(BpmnProcessKey.ACTIVITIEXPRESSION.getValue(), map.get(BpmnProcessKey.ACTIVITIEXPRESSION.getCode()));
                break;
        }
        return elementOrig;
    }


    /**
     * @param BpmnEnumCode xml元素code值
     * @return BpmnEnumValue xml元素 名称
     * @description 根据元素code获取元素属性
     */

    public static String getbpmnValue(Integer BpmnEnumCode) {
        return BpmnEnum.getByValue(BpmnEnumCode).getValue();
    }


    public static String bpmnXMLSplit(Map<Integer, String> mapProcess, Map<Integer, Map<Integer, String>> elementCode) {
        //mapStart 固定参数  -------start部分
        Map<Integer, String> mapStart = new LinkedHashMap<>();
        mapStart.put(1, "startevent0");
        mapStart.put(2, "开始");

        //mapEnd总结束 固定参数 --------start部分
        Map<Integer, String> mapEnd = new LinkedHashMap<>();
        mapEnd.put(1, "endevent0");
        mapEnd.put(2, "结束");

        Element eleRoot = getBpmnXmlRoot();
        Element eP = bpmnXmlBeforeStartEvent(eleRoot, mapProcess, mapStart);
        for (Integer key : elementCode.keySet()) {
            Element eleOrig2 = bpmnAnalysis(key, elementCode.get(key));
            eP.addChild(eleOrig2);
        }

        Element endElement = bpmnAnalysis(1156, mapEnd);
        eP.addChild(endElement);
        return (XmlUtil.elementToXml(eleRoot));
    }

    public static void main(String[] args) {
        Map<Integer, String> mapProcess = new LinkedHashMap<>();
        Map<Integer, Map<Integer, String>> elementCode = new LinkedHashMap<>();
        mapProcess.put(1,"htTongProcess");
        mapProcess.put(2,"htTong Process");
        mapProcess.put(3,"true");

        Map<Integer,String> mapNei01 = new LinkedHashMap<>();
        mapNei01.put(1,"usertask1");
        mapNei01.put(2,"费用申请报销");
        elementCode.put(1095,mapNei01);

        Map<Integer,String> mapNei02 = new LinkedHashMap<>();
        mapNei02.put(1,"exclusivegateway1");
        mapNei02.put(2,"Exclusive Gateway");
        mapNei02.put(5,"flow3");
        elementCode.put(1150,mapNei02);
        //mapStart 写死
        Map<Integer, String> mapStart = new LinkedHashMap<>();//--------start部分
        mapStart.put(1,"startevent1");
        mapStart.put(2,"开始");
        //mapEnd写死
        Map<Integer, String> mapEnd = new LinkedHashMap<>();//--------start部分
        mapEnd.put(1,"endevent1");
        mapEnd.put(2,"结束");
        Element eleRoot =  BpmnXmlUtil.getBpmnXmlRoot();
        Element eP = BpmnXmlUtil.bpmnXmlBeforeStartEvent(eleRoot,mapProcess,mapStart);
        for (Integer key : elementCode.keySet()) {
            Element eleOrig2 = BpmnXmlUtil.bpmnAnalysis(key, elementCode.get(key));
            eP.addChild(eleOrig2);
        }

        Element endElement = BpmnXmlUtil.bpmnAnalysis(1156,mapEnd);
        eP.addChild(endElement);
        System.out.println((XmlUtil.elementToXml(eleRoot)));
    }
}
