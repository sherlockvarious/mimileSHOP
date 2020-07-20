package edu.scdx.demo.entity;

public class Type {
    private Integer typeId;

    private String typeName;

    private String icon;

    public Type(Integer typeId, String typeName, String icon) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.icon = icon;
    }

    public Type() {
        super();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}