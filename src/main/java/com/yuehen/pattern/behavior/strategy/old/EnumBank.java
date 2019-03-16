package com.yuehen.pattern.behavior.strategy.old;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public enum EnumBank {
    // 银行
    INST_EBANK_ICBC("0002","ICBC", "中国工商银行"),
    INST_EBANK_HZBANK("0032","HZBANK","杭州银行"),
    INST_EBANK_0056("0056","0056","上海银联");

    private String bankNo;
    private String name;
    private String description;

    EnumBank(String bankNo,String name, String description) {
        this.bankNo=bankNo;
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    /**
     * 根据银行名称获取银行描述
     *
     * @param name
     * @return
     */
    public static String getDescriptionByName(String name) {
        EnumBank institution = getByName(name);
        if (institution == null) {
            return null;
        }
        return institution.getDescription();
    }

    /**
     * 根据银行名称获取枚举
     *
     * @param name
     * @return
     */
    public static EnumBank getByName(String name) {
        if (name == null) {
            return null;
        }
        for (EnumBank institution : values()) {
            if (name.equalsIgnoreCase(institution.getName())) {
                return institution;
            }
        }
        return null;
    }

    /**
     * 根据银行的代码取得银行枚举
     * @param bankNo
     * @return
     */
    public static EnumBank getByBankNo(String bankNo){
        if (bankNo == null) {
            return null;
        }
        for (EnumBank institution : values()) {
            if (bankNo.equalsIgnoreCase(institution.getBankNo())) {
                return institution;
            }
        }
        return null;
    }

    public static Map<String, String> toMap() {
        Map<String, String> enumDataMap = new HashMap<String, String>();
        for (EnumBank institution : values()) {
            enumDataMap.put(institution.getBankNo(), institution.getDescription());
        }
        return enumDataMap;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * 根据银行名称获取枚举
     *
     * @param bankNo
     * @return
     */
    public static String getDescByBankNo(String bankNo) {
        for (EnumBank institution : values()) {
            if (StringUtils.equals(institution.getBankNo(), bankNo)) {
                return institution.getDescription();
            }

        }
        return bankNo;
    }
}
