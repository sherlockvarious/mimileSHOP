package edu.scdx.demo.entity;

public class Type extends TypeKey {
    private String icon;

    public Type(Integer typeId, String typeName, String icon) {
        super(typeId, typeName);
        this.icon = icon;
    }

    public Type() {
        super();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}