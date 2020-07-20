package edu.scdx.demo.entity;

public class TypeKey {
    private Integer typeId;

    private String typeName;

    public TypeKey(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public TypeKey() {
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
}