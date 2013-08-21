/*
 * Copyright (C) 2013 Codenvy.
 */
package com.codenvy.analytics.metrics;

/** @author <a href="mailto:abazko@codenvy.com">Anatoliy Bazko</a> */
public class FactorySessionsAnonPercentMetric extends PercentMetric {

    FactorySessionsAnonPercentMetric() {
        super(MetricType.FACTORY_SESSIONS_ANON_PERCENT,
              MetricFactory.createMetric(MetricType.FACTORY_SESSIONS),
              MetricFactory.createMetric(MetricType.FACTORY_SESSIONS_ANON));
    }
}
