package com.tac.guns.common.container.slot;

public enum SlotType {
    SCOPE("scope", "Scope"),            // 0
    BARREL("barrel", "Barrel"),            // 1
    STOCK("stock", "Stock"),            // 2
    UNDER_BARREL("under_barrel", "Under_Barrel"),            // 3
    SIDE_RAIL("side_rail", "Side_Rail"),            // 4
    EXTENDED_MAG("extended_mag", "Extended_Mag"), // 5
    GUN_SKIN("gun_skin", "Gun_Skin"),     // 6

    SCOPE_RETICLE_COLOR("reticle_color", "Reticle_Color"), // Scope Attachment Type // 7
    SCOPE_BODY_COLOR("body_color", "Body_Color"),          // Scope Attachment Type // 8
    SCOPE_GLASS_COLOR("glass_color", "Glass_Color");       // Scope Attachment Type // 9

    private String translationKey;
    private String tagKey;

    SlotType(String translationKey, String tagKey) {
        this.translationKey = translationKey;
        this.tagKey = tagKey;
    }

    public String getTranslationKey() {
        return this.translationKey;
    }

    public String getTagKey() {
        return this.tagKey;
    }

}
