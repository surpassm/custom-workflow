package com.ysy.workflow.bpmn;

import lombok.Getter;

/**
 *
 * @author MC
 *
 *  所有类型数据
 */
@Getter
public enum BpmnEnum {
    /**
     *
     */
    OTHER_XMLNS(10010,"xmlns"),
    PROCESS(10011,"process"),
    BPMN2_NAMESPACE(10011, "http://www.omg.org/spec/BPMN/20100524/MODEL"),
    XSI_NAMESPACE(10012, "http://www.w3.org/2001/XMLSchema-instance"),
    XSI_PREFIX(10013, "xsi"),
    SCHEMA_NAMESPACE(10014, "http://www.w3.org/2001/XMLSchema"),
    XSD_PREFIX(10015, "xsd"),
    TTYPE_LANGUAGE_ATTRIBUTE(10016, "typeLanguage"),
    XPATH_NAMESPACE(10017, "http://www.w3.org/1999/XPath"),
    EXPRESSION_LANGUAGE_ATTRIBUTE(10018, "expressionLanguage"),
    PROCESS_NAMESPACE(10019, "http://www.activiti.org/test"),
    TARGET_NAMESPACE_ATTRIBUTE(10010, "targetNamespace"),
    ACTIVITI_EXTENSIONS_NAMESPACE(1000, "http://activiti.org/bpmn"),
    ACTIVITI_EXTENSIONS_PREFIX(1001, "activiti"),
    BPMNDI_NAMESPACE(1002, "http://www.omg.org/spec/BPMN/20100524/DI"),
    BPMNDI_PREFIX(1003, "bpmndi"),
    OMGDC_NAMESPACE(1004, "http://www.omg.org/spec/DD/20100524/DC"),
    mOMGDC_PREFIX(1005, "omgdc"),
    OMGDI_NAMESPACE(1006, "http://www.omg.org/spec/DD/20100524/DI"),
    OMGDI_PREFIX(1007, "omgdi"),
    ATTRIBUTE_ID(1008, "id"),
    ATTRIBUTE_NAME(1009, "name"),
    ATTRIBUTE_TYPE(1010, "type"),
    ATTRIBUTE_DEFAULT(1011, "default"),
    ATTRIBUTE_ITEM_REF(1012, "itemRef"),
    ELEMENT_DEFINITIONS(1013, "definitions"),
    ELEMENT_DOCUMENTATION(1014, "documentation"),
    ELEMENT_SIGNAL(1015, "signal"),
    ELEMENT_MESSAGE(1016, "message"),
    ELEMENT_ERROR(1017, "error"),
    ELEMENT_COLLABORATION(1018, "collaboration"),
    ELEMENT_PARTICIPANT(1019, "participant"),
    ELEMENT_MESSAGE_FLOW(1020, "messageFlow"),
    ELEMENT_LANESET(1021, "laneSet"),
    ELEMENT_LANE(1022, "lane"),
    ELEMENT_FLOWNODE_REF(1023, "flowNodeRef"),
    ATTRIBUTE_PROCESS_REF(1024, "processRef"),
    ELEMENT_RESOURCE(1025, "resource"),
    ELEMENT_PROCESS(1026, "process"),
    ATTRIBUTE_PROCESS_EXECUTABLE(1027, "isExecutable"),
    ELEMENT_POTENTIAL_STARTER(1028, "potentialStarter"),
    ATTRIBUTE_PROCESS_CANDIDATE_USERS(1029, "candidateStarterUsers"),
    ATTRIBUTE_PROCESS_CANDIDATE_GROUPS(1030, "candidateStarterGroups"),
    ELEMENT_SUBPROCESS(1031, "subProcess"),
    ATTRIBUTE_TRIGGERED_BY(1032, "triggeredByEvent"),
    ELEMENT_TRANSACTION(1033, "transaction"),
    ELEMENT_DATA_STATE(1034, "dataState"),
    ELEMENT_EXTENSIONS(1035, "extensionElements"),
    ELEMENT_EXECUTION_LISTENER(1036, "executionListener"),
    ELEMENT_EVENT_LISTENER(1037, "eventListener"),
    ELEMENT_TASK_LISTENER(1038, "taskListener"),
    ATTRIBUTE_LISTENER_EVENT(1039, "event"),
    ATTRIBUTE_LISTENER_EVENTS(1040, "events"),
    ATTRIBUTE_LISTENER_ENTITY_TYPE(1041, "entityType"),
    ATTRIBUTE_LISTENER_CLASS(1042, "class"),
    ATTRIBUTE_LISTENER_EXPRESSION(1043, "expression"),
    ATTRIBUTE_LISTENER_DELEGATEEXPRESSION(1044, "delegateExpression"),
    ATTRIBUTE_LISTENER_THROW_EVENT_TYPE(1045, "throwEvent"),
    ATTRIBUTE_LISTENER_THROW_SIGNAL_EVENT_NAME(1046, "signalName"),
    ATTRIBUTE_LISTENER_THROW_MESSAGE_EVENT_NAME(1047, "messageName"),
    ATTRIBUTE_LISTENER_THROW_ERROR_EVENT_CODE(1048, "errorCode"),
    ATTRIBUTE_LISTENER_THROW_EVENT_TYPE_SIGNAL(1049, "signal"),
    ATTRIBUTE_LISTENER_THROW_EVENT_TYPE_GLOBAL_SIGNAL(1050, "globalSignal"),
    ATTRIBUTE_LISTENER_THROW_EVENT_TYPE_MESSAGE(1051, "message"),
    ATTRIBUTE_LISTENER_THROW_EVENT_TYPE_ERROR(1052, "error"),
    ATTRIBUTE_VALUE_TRUE(1053, "true"),
    ATTRIBUTE_VALUE_FALSE(1054, "false"),
    ATTRIBUTE_ACTIVITY_ASYNCHRONOUS(1055, "async"),
    ATTRIBUTE_ACTIVITY_EXCLUSIVE(1056, "exclusive"),
    ATTRIBUTE_ACTIVITY_ISFORCOMPENSATION(1057, "isForCompensation"),
    ELEMENT_IMPORT(1058, "import"),
    ATTRIBUTE_IMPORT_TYPE(1059, "importType"),
    ATTRIBUTE_LOCATION(1060, "location"),
    ATTRIBUTE_NAMESPACE(1061, "namespace"),
    ELEMENT_INTERFACE(1062, "interface"),
    ELEMENT_OPERATION(1063, "operation"),
    ATTRIBUTE_IMPLEMENTATION_REF(1064, "implementationRef"),
    ELEMENT_IN_MESSAGE(1065, "inMessageRef"),
    ELEMENT_OUT_MESSAGE(1066, "outMessageRef"),
    ELEMENT_ITEM_DEFINITION(1067, "itemDefinition"),
    ATTRIBUTE_STRUCTURE_REF(1068, "structureRef"),
    ATTRIBUTE_ITEM_KIND(1069, "itemKind"),
    ELEMENT_DATA_STORE(1070, "dataStore"),
    ELEMENT_DATA_STORE_REFERENCE(1071, "dataStoreReference"),
    ATTRIBUTE_ITEM_SUBJECT_REF(1072, "itemSubjectRef"),
    ATTRIBUTE_DATA_STORE_REF(1073, "dataStoreRef"),
    ELEMENT_IOSPECIFICATION(1074, "ioSpecification"),
    ELEMENT_DATA_INPUT(1075, "dataInput"),
    ELEMENT_DATA_OUTPUT(1076, "dataOutput"),
    ELEMENT_DATA_INPUT_REFS(1077, "dataInputRefs"),
    ELEMENT_DATA_OUTPUT_REFS(1078, "dataOutputRefs"),
    ELEMENT_INPUT_ASSOCIATION(1079, "dataInputAssociation"),
    ELEMENT_OUTPUT_ASSOCIATION(1080, "dataOutputAssociation"),
    ELEMENT_SOURCE_REF(1081, "sourceRef"),
    ELEMENT_TARGET_REF(1082, "targetRef"),
    ELEMENT_TRANSFORMATION(1083, "transformation"),
    ELEMENT_ASSIGNMENT(1084, "assignment"),
    ELEMENT_FROM(1085, "from"),
    ELEMENT_TO(1086, "to"),
    ELEMENT_TASK_MAIL(1087, "mailTask"),
    ELEMENT_TASK(1088, "task"),
    ELEMENT_TASK_BUSINESSRULE(1089, "businessRuleTask"),
    ELEMENT_TASK_MANUAL(1090, "manualTask"),
    ELEMENT_TASK_RECEIVE(1091, "receiveTask"),
    ELEMENT_TASK_SCRIPT(1092, "scriptTask"),
    ELEMENT_TASK_SEND(1093, "sendTask"),
    ELEMENT_TASK_SERVICE(1094, "serviceTask"),
    ELEMENT_TASK_USER(1095, "userTask"),
    ELEMENT_CALL_ACTIVITY(1096, "callActivity"),
    ATTRIBUTE_EVENT_START_INITIATOR(1097, "initiator"),
    ATTRIBUTE_FORM_FORMKEY(1098, "formKey"),
    ELEMENT_MULTIINSTANCE(1099, "multiInstanceLoopCharacteristics"),
    ELEMENT_MULTIINSTANCE_CARDINALITY(1100, "loopCardinality"),
    ELEMENT_MULTIINSTANCE_DATAINPUT(1101, "loopDataInputRef"),
    ELEMENT_MULTIINSTANCE_DATAITEM(1102, "inputDataItem"),
    ELEMENT_MULTIINSTANCE_CONDITION(1103, "completionCondition"),
    ATTRIBUTE_MULTIINSTANCE_SEQUENTIAL(1104, "isSequential"),
    ATTRIBUTE_MULTIINSTANCE_COLLECTION(1105, "collection"),
    ATTRIBUTE_MULTIINSTANCE_VARIABLE(1106, "elementVariable"),
    ATTRIBUTE_MULTIINSTANCE_INDEX_VARIABLE(1107, "elementIndexVariable"),
    ATTRIBUTE_TASK_IMPLEMENTATION(1108, "implementation"),
    ATTRIBUTE_TASK_OPERATION_REF(1109, "operationRef"),
    ATTRIBUTE_TASK_SCRIPT_TEXT(1110, "script"),
    ATTRIBUTE_TASK_SCRIPT_FORMAT(1111, "scriptFormat"),
    ATTRIBUTE_TASK_SCRIPT_RESULTVARIABLE(1112, "resultVariable"),
    ATTRIBUTE_TASK_SCRIPT_AUTO_STORE_VARIABLE(1113, "autoStoreVariables"),
    ATTRIBUTE_TASK_SERVICE_CLASS(1114, "class"),
    ATTRIBUTE_TASK_SERVICE_EXPRESSION(1115, "expression"),
    ATTRIBUTE_TASK_SERVICE_DELEGATEEXPRESSION(1116, "delegateExpression"),
    ATTRIBUTE_TASK_SERVICE_RESULTVARIABLE(1117, "resultVariableName"),
    ATTRIBUTE_TASK_SERVICE_EXTENSIONID(1118, "extensionId"),
    ATTRIBUTE_TASK_SERVICE_SKIP_EXPRESSION(1119, "skipExpression"),
    ATTRIBUTE_TASK_USER_ASSIGNEE(1120, "assignee"),
    ATTRIBUTE_TASK_USER_OWNER(1121, "owner"),
    ATTRIBUTE_TASK_USER_CANDIDATEUSERS(1122, "candidateUsers"),
    ATTRIBUTE_TASK_USER_CANDIDATEGROUPS(1123, "candidateGroups"),
    ATTRIBUTE_TASK_USER_DUEDATE(1124, "dueDate"),
    ATTRIBUTE_TASK_USER_BUSINESS_CALENDAR_NAME(1125, "businessCalendarName"),
    ATTRIBUTE_TASK_USER_CATEGORY(1126, "category"),
    ATTRIBUTE_TASK_USER_PRIORITY(1127, "priority"),
    ATTRIBUTE_TASK_USER_SKIP_EXPRESSION(1128, "skipExpression"),
    ATTRIBUTE_TASK_RULE_VARIABLES_INPUT(1129, "ruleVariablesInput"),
    ATTRIBUTE_TASK_RULE_RESULT_VARIABLE(1130, "resultVariable"),
    ATTRIBUTE_TASK_RULE_RULES(1131, "rules"),
    ATTRIBUTE_TASK_RULE_EXCLUDE(1132, "exclude"),
    ATTRIBUTE_TASK_RULE_CLASS(1133, "class"),
    ATTRIBUTE_CALL_ACTIVITY_CALLEDELEMENT(1134, "calledElement"),
    ATTRIBUTE_CALL_ACTIVITY_INHERITVARIABLES(1135, "inheritVariables"),
    ELEMENT_CALL_ACTIVITY_IN_PARAMETERS(1136, "in"),
    ELEMENT_CALL_ACTIVITY_OUT_PARAMETERS(1137, "out"),
    ATTRIBUTE_IOPARAMETER_SOURCE(1138, "source"),
    ATTRIBUTE_IOPARAMETER_SOURCE_EXPRESSION(1139, "sourceExpression"),
    ATTRIBUTE_IOPARAMETER_TARGET(1140, "target"),
    ELEMENT_SEQUENCE_FLOW(1141, "sequenceFlow"),
    ELEMENT_FLOW_CONDITION(1142, "conditionExpression"),
    ATTRIBUTE_FLOW_SOURCE_REF(1143, "sourceRef"),
    ATTRIBUTE_FLOW_TARGET_REF(1144, "targetRef"),
    ATTRIBUTE_FLOW_SKIP_EXPRESSION(1145, "skipExpression"),
    ELEMENT_TEXT_ANNOTATION(1146, "textAnnotation"),
    ATTRIBUTE_TEXTFORMAT(1147, "textFormat"),
    ELEMENT_TEXT_ANNOTATION_TEXT(1148, "text"),
    ELEMENT_ASSOCIATION(1149, "association"),
    ELEMENT_GATEWAY_EXCLUSIVE(1150, "exclusiveGateway"),
    ELEMENT_GATEWAY_EVENT(1151, "eventBasedGateway"),
    ELEMENT_GATEWAY_INCLUSIVE(1152, "inclusiveGateway"),
    ELEMENT_GATEWAY_PARALLEL(1153, "parallelGateway"),
    ELEMENT_GATEWAY_COMPLEX(1154, "complexGateway"),
    ELEMENT_EVENT_START(1155, "startEvent"),
    ELEMENT_EVENT_END(1156, "endEvent"),
    ELEMENT_EVENT_BOUNDARY(1157, "boundaryEvent"),
    ELEMENT_EVENT_THROW(1158, "intermediateThrowEvent"),
    ELEMENT_EVENT_CATCH(1159, "intermediateCatchEvent"),
    ATTRIBUTE_BOUNDARY_ATTACHEDTOREF(1160, "attachedToRef"),
    ATTRIBUTE_BOUNDARY_CANCELACTIVITY(1161, "cancelActivity"),
    ELEMENT_EVENT_ERRORDEFINITION(1162, "errorEventDefinition"),
    ATTRIBUTE_ERROR_REF(1163, "errorRef"),
    ATTRIBUTE_ERROR_CODE(1164, "errorCode"),
    ELEMENT_EVENT_MESSAGEDEFINITION(1165, "messageEventDefinition"),
    ATTRIBUTE_MESSAGE_REF(1166, "messageRef"),
    ELEMENT_EVENT_SIGNALDEFINITION(1167, "signalEventDefinition"),
    ATTRIBUTE_SIGNAL_REF(1168, "signalRef"),
    ATTRIBUTE_SCOPE(1169, "scope"),
    ELEMENT_EVENT_TIMERDEFINITION(1170, "timerEventDefinition"),
    ATTRIBUTE_CALENDAR_NAME(1171, "businessCalendarName"),
    ATTRIBUTE_TIMER_DATE(1172, "timeDate"),
    ATTRIBUTE_TIMER_CYCLE(1173, "timeCycle"),
    ATTRIBUTE_END_DATE(1174, "endDate"),
    ATTRIBUTE_TIMER_DURATION(1175, "timeDuration"),
    ELEMENT_EVENT_TERMINATEDEFINITION(1176, "terminateEventDefinition"),
    ATTRIBUTE_TERMINATE_ALL(1177, "terminateAll"),
    ELEMENT_EVENT_CANCELDEFINITION(1178, "cancelEventDefinition"),
    ELEMENT_EVENT_COMPENSATEDEFINITION(1179, "compensateEventDefinition"),
    ATTRIBUTE_COMPENSATE_ACTIVITYREF(1180, "activityRef"),
    ATTRIBUTE_COMPENSATE_WAITFORCOMPLETION(1181, "waitForCompletion"),
    ELEMENT_FORMPROPERTY(1182, "formProperty"),
    ATTRIBUTE_FORM_ID(1183, "id"),
    ATTRIBUTE_FORM_NAME(1184, "name"),
    ATTRIBUTE_FORM_TYPE(1185, "type"),
    ATTRIBUTE_FORM_EXPRESSION(1186, "expression"),
    ATTRIBUTE_FORM_VARIABLE(1187, "variable"),
    ATTRIBUTE_FORM_READABLE(1188, "readable"),
    ATTRIBUTE_FORM_WRITABLE(1189, "writable"),
    ATTRIBUTE_FORM_REQUIRED(1190, "required"),
    ATTRIBUTE_FORM_DEFAULT(1191, "default"),
    ATTRIBUTE_FORM_DATEPATTERN(1192, "datePattern"),
    ELEMENT_VALUE(1193, "value"),
    ELEMENT_FIELD(1194, "field"),
    ATTRIBUTE_FIELD_NAME(1195, "name"),
    ATTRIBUTE_FIELD_(1196, "Value"),
    ATTRIBUTE_FIELD_EXPRESSION(1197, "expression"),
    ELEMENT_FIELD_(1198, "field"),
    ALFRESCO_TYPE(1199, "alfrescoScriptType"),
    ELEMENT_DI_DIAGRAM(1200, "BPMNDiagram"),
    ELEMENT_DI_PLANE(1201, "BPMNPlane"),
    ELEMENT_DI_SHAPE(1202, "BPMNShape"),
    ELEMENT_DI_EDGE(1203, "BPMNEdge"),
    ELEMENT_DI_LABEL(1204, "BPMNLabel"),
    ELEMENT_DI_BOUNDS(1205, "Bounds"),
    ELEMENT_DI_WAYPOINT(1206, "waypoint"),
    ATTRIBUTE_DI_BPMNELEMENT(1207, "bpmnElement"),
    ATTRIBUTE_DI_IS_EXPANDED(1208, "isExpanded"),
    ATTRIBUTE_DI_WIDTH(1209, "width"),
    ATTRIBUTE_DI_HEIGHT(1210, "height"),
    ATTRIBUTE_DI_X(1211, "x"),
    ATTRIBUTE_DI_Y(1212, "y"),
    ELEMENT_DATA_OBJECT(1213, "dataObject"),
    ATTRIBUTE_DATA_ID(1214, "id"),
    ATTRIBUTE_DATA_NAME(1215, "name"),
    ATTRIBUTE_DATA_ITEM_REF(1216, "itemSubjectRef"),
    ELEMENT_DATA_VALUE(1217, "value"),
    ELEMENT_CUSTOM_RESOURCE(1218, "customResource"),
    ELEMENT_RESOURCE_ASSIGNMENT(1219, "resourceAssignmentExpression"),
    ELEMENT_FORMAL_EXPRESSION(1220, "formalExpression"),
    ELEMENT_RESOURCE_REF(1221, "resourceRef"),
    ATTRIBUTE_ASSOCIATION_DIRECTION(1222, "associationDirection"),
    FAILED_JOB_RETRY_TIME_CYCLE(1223, "failedJobRetryTimeCycle"),
    MAP_EXCEPTION(1224, "mapException"),
    MAP_EXCEPTION_ERRORCODE(1225, "errorCode"),
    MAP_EXCEPTION_ANDCHILDREN(1226, "includeChildExceptions");


    Integer code;
    String value;

    BpmnEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static BpmnEnum getByValue(Integer code) {
        for (BpmnEnum bpmnEnum : BpmnEnum.values()) {
            if (bpmnEnum.getCode().equals(code)) {
                return bpmnEnum;
            }
        }
        return null;
    }

}
