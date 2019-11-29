package com.ysy.workflow.bpmn;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mc
 *
 * XML元素类
 */
@Data
public class Element {
    /**
     * 元素名
     */
    private String name;
    /**
     * 文本值
     */
    private String nodeText = "";
    /**
     * 属性
     */
    private Map<String, String> property = new HashMap<>();
    /**
     * 是否子节点
     */
    private boolean isLeaf = true;
    /**
     * 子集
     */
    private List<Element> child = new ArrayList<>();

    /**
     * 添加属性
     *
     * @param key   key
     * @param value value
     */
    public void addProperty(String key, String value) {
        this.property.put(key, value);
    }

    public void setChild(List<Element> child) {
        this.child = child;
        if (this.isLeaf && this.child.size() > 0) {
            this.isLeaf = false;
        }
    }

    /**
     * 添加子节点
     *
     * @param el el
     */
    public void addChild(Element el) {
        this.child.add(el);
        if (this.isLeaf && this.child.size() > 0) {
            this.isLeaf = false;
        }
    }
    public Element(String name) {
        this.name = name;
    }
}
