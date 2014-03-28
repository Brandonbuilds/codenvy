/*
 *
 * CODENVY CONFIDENTIAL
 * ________________
 *
 * [2012] - [2013] Codenvy, S.A.
 * All Rights Reserved.
 * NOTICE: All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.analytics.metrics.sessions.factory;

import com.codenvy.analytics.metrics.AbstractListValueResulted;
import com.codenvy.analytics.metrics.MetricType;

import javax.annotation.security.RolesAllowed;

/** @author <a href="mailto:abazko@codenvy.com">Anatoliy Bazko</a> */
@RolesAllowed({"system/admin", "system/manager"})
public class CreatedFactoriesList extends AbstractListValueResulted {
    public CreatedFactoriesList() {
        super(MetricType.CREATED_FACTORIES_LIST);
    }

    @Override
    public String getStorageCollectionName() {
        return getStorageCollectionName(MetricType.CREATED_FACTORIES_SET);
    }

    @Override
    public String getDescription() {
        return "The list of created factories.";
    }

    @Override
    public String[] getTrackedFields() {
        return new String[]{DATE,
                            FACTORY,
                            WS,
                            USER,
                            PROJECT_TYPE,
                            REPOSITORY,
                            AFFILIATE_ID,
                            ORG_ID};
    }
}
