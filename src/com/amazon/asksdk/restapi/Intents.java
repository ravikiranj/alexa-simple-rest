package com.amazon.asksdk.restapi;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public final class Intents {
    public static final String GET_ITEM_INTENT = "GetItemIntent";
    public static final String POST_ITEM_INTENT = "PostItemIntent";
    public static final String DELETE_ITEM_INTENT = "DeleteItemIntent";

    public static final String AMAZON_HELP_INTENT = "AMAZON.HelpIntent";

    public static final Set<String> SKILL_INTENTS = ImmutableSet.of(
            GET_ITEM_INTENT,
            POST_ITEM_INTENT,
            DELETE_ITEM_INTENT
    );

    private Intents() {

    }

}
