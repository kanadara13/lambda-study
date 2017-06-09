package com.lambda.study.domain.design;

/**
 * Created by user on 2017-06-09.
 */
public class Asset {
    public enum AssetType {BOND,STOCK}
    private final AssetType type;
    private final int value;

    public Asset(final AssetType type, final int value) {
        this.type = type;
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
