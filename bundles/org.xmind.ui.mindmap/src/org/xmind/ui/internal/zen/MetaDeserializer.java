package org.xmind.ui.internal.zen;

import org.json.JSONObject;
import org.xmind.core.IMeta;

public class MetaDeserializer {

    public void deserialize(IMeta meta, JSONObject metaObject) {

        JSONObject authorObject = metaObject
                .optJSONObject(ZenConstants.KEY_META_AUTHOR);
        if (authorObject != null) {
            String name = (String) authorObject.opt(ZenConstants.KEY_META_NAME);
            if (name != null) {
                meta.setValue(IMeta.AUTHOR_NAME, name);
            }
        }

        JSONObject createObject = metaObject
                .optJSONObject(ZenConstants.KEY_CREATE);
        if (createObject != null) {
            String createTime = (String) createObject
                    .opt(ZenConstants.KEY_TIME);
            if (createTime != null) {
                meta.setValue(IMeta.CREATED_TIME, createTime);
            }
        }

        JSONObject creatorObject = metaObject
                .optJSONObject(ZenConstants.KEY_CREATOR);
        if (creatorObject != null) {
            String name = (String) creatorObject
                    .opt(ZenConstants.KEY_META_NAME);
            if (name != null) {
                meta.setValue(IMeta.CREATOR_NAME, name);
            }
            String version = (String) creatorObject
                    .opt(ZenConstants.KEY_VERSION);
            if (version != null) {
                meta.setValue(IMeta.CREATOR_VERSION, version);
            }
        }

        JSONObject thumbnailObject = metaObject
                .optJSONObject(ZenConstants.KEY_THUMBNAIL);
        if (thumbnailObject != null) {
            JSONObject originObject = thumbnailObject
                    .optJSONObject(ZenConstants.KEY_ORIGIN);
            if (originObject != null) {
                String x = (String) originObject.opt(ZenConstants.KEY_META_X);
                if (x != null) {
                    meta.setValue(IMeta.ORIGIN_X, x);
                }
                String y = (String) originObject.opt(ZenConstants.KEY_META_Y);
                if (y != null) {
                    meta.setValue(IMeta.ORIGIN_Y, y);
                }
            }
            String backgroundColor = (String) thumbnailObject
                    .opt(ZenConstants.KEY_BACKGROUND_COLOR);
            if (backgroundColor != null) {
                meta.setValue(IMeta.BACKGROUND_COLOR, backgroundColor);
            }
        }
    }

}
