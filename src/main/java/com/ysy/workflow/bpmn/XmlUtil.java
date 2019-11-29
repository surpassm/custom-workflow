package com.ysy.workflow.bpmn;


/**
 * @author mc
 *
 * XMl工具类
 */
public class XmlUtil {

    private static String lt = "<";
    private static String ltEnd = "</";
    private static String rt = ">";
    private static String rhtEnd = "/>";
    private static String quotes = "\"";
    private static String equal = "=";
    private static String blank = " ";

    /**
     * 转换为xml
     *
     * @param el
     * @return
     */
    public static String elementToXml(Element el){
        StringBuilder result = new StringBuilder();
        //元素开始
        result.append(lt).append(el.getName());
        //判断是否有属性
        if(el.getProperty() != null && el.getProperty().size() > 0 ){
            for (String s : el.getProperty().keySet()) {
                String key = String.valueOf(s);
                String value = el.getProperty().get(key);
                result.append(blank).append(key).append(equal)
                        .append(quotes).append(value).append(quotes).append(blank);
            }
        }
        //结束标记
        result.append(rt);
        /*
         * 判断是否是叶子节点
         * 是叶子节点，添加节点内容
         * 不是叶子节点，循环添加子节点
         */
        if(el.isLeaf()){
            result.append(el.getNodeText());
        }else{
            for(Element element :el.getChild()){
                result.append(elementToXml(element));
            }
        }
        //元素结束
        result.append(ltEnd).append(el.getName()).append(rt);
        return result.toString();
    }

}
